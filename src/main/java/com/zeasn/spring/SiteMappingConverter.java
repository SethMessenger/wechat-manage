package com.zeasn.spring;

import java.io.IOException;
import java.lang.reflect.Type;

import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zeasn.spring.util.SiteMappingUtil;
import com.zeasn.utils.HttpContext;

/**
 * 站点匹配转换器
 * 
 * @description 目的是将本系统内所有接口返回的包含域名的参数，按照配置的站点映射规则批量替换，满足某些特定部署环境下内网访问指定的备用站点
 * @description 该方案内分两种情况，1.接口返回值是ApiResult类型或子类并且打上了@ResponseBody注解； 2.
 *              接口返回值是ApiResult类型或子类不加@ResponseBody注解<br/>
 *              情况1使用本SiteMappingConverter
 *              类作为匹配替换类，基于MappingJackson2HttpMessageConverter.
 *              情况2则使用com.zeasn.spring
 *              .view.JacksonJsonView的filterModel方法，完成对应的域名映射.
 * 
 * @author kevin lee
 * @date 2017年2月8日上午11:14:02
 */
public class SiteMappingConverter extends MappingJackson2HttpMessageConverter {

	public SiteMappingConverter() {
		super();
	}

	public SiteMappingConverter(ObjectMapper objectMapper) {
		super(objectMapper);
	}

	@Override
	protected void writeInternal(Object object, Type type, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
		// 过滤匹配
		String snum = HttpContext.getRequest().getParameter("snum");
		SiteMappingUtil.filterApiResultObject(object, snum);
		super.writeInternal(object, type, outputMessage);
	}
}