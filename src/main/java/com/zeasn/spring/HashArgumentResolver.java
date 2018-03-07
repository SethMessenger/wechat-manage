package com.zeasn.spring;

import java.util.Iterator;
import java.util.Map;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public class HashArgumentResolver implements HandlerMethodArgumentResolver {
	public boolean supportsParameter(MethodParameter parameter) {
		return parameter.hasParameterAnnotation(HashParameter.class);
	}

	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
		Hash hash = new Hash();
		HashParameter hp = (HashParameter) parameter.getParameterAnnotation(HashParameter.class);
		String hashName = hp.prefix();
		String regex = "^" + hashName + "\\[[^\\]]+\\]$";

		Iterator<String> names = webRequest.getParameterNames();
		while (names.hasNext()) {
			String name = (String) names.next();
			if (name.matches(regex)) {
				String fieldName = name.substring(hashName.length() + 1, name.length() - 1);
				hash.put(fieldName, webRequest.getParameter(name));
			}
		}
		Object nativeReq = webRequest.getNativeRequest();
		if ((nativeReq instanceof MultipartHttpServletRequest)) {
			MultipartHttpServletRequest mpReq = (MultipartHttpServletRequest) nativeReq;
			Map<String, MultipartFile> files = mpReq.getFileMap();
			for (String name : files.keySet()) {
				if (name.matches(regex)) {
					String fieldName = name.substring(hashName.length() + 1, name.length() - 1);
					hash.put(fieldName, files.get(name));
				}
			}
		}
		return hash;
	}
}
