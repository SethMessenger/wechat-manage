package com.wxmp.core.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.wxmp.backstage.sys.domain.SysUser;
import com.wxmp.core.util.SessionUtilsWeb;


/**
 * 用户拦截器
 * @author  hermit
 *
 */
public class AuthInterceptor extends HandlerInterceptorAdapter {
	private final static Logger log= Logger.getLogger(AuthInterceptor.class);

	/** 也可以注解 **/
	public String[] allowUrls;

	public void setAllowUrls(String[] allowUrls) {
		this.allowUrls = allowUrls;
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		/** HandlerMethod method = (HandlerMethod)handler;
		Auth auth = method.getMethod().getAnnotation(Auth.class); **/
		String requestUrl = request.getRequestURI().replace(request.getContextPath(), "");
		if (null != allowUrls && allowUrls.length >= 1) {
			for (String url : allowUrls) {
				if (requestUrl.contains(".css") || requestUrl.contains(".js") || requestUrl.contains(".png") || requestUrl.contains(".jpg") || requestUrl.contains("/message") || requestUrl.equals(url)) {
					return true;
				}
			}
		}
		if (SessionUtilsWeb.getUser(request) != null) {
			SessionUtilsWeb.getSession(request).setMaxInactiveInterval(60 * 60 * 30);
		}
		//验证登陆超时问题 auth = null，默认验证
		String baseUri = request.getContextPath();
		SysUser user =SessionUtilsWeb.getUser(request);
		
	
		if(user  == null){
			response.setStatus(HttpServletResponse.SC_GATEWAY_TIMEOUT);
			response.sendRedirect(baseUri+"/");
			return false;
		}

		return super.preHandle(request, response, handler);
	}

	
}
