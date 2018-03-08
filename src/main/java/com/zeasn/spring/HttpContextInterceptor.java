package com.zeasn.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 拦截器
 */
@Repository
public class HttpContextInterceptor implements HandlerInterceptor {
	protected static final Logger logger = LoggerFactory.getLogger(HttpContextInterceptor.class);
//	@Resource
//	private UserRedis userRedis;
	@Override
	public void afterCompletion(HttpServletRequest req, HttpServletResponse arg1, Object arg2, Exception ex)
			throws Exception {
//		HttpContext.release();
	}

	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse resp, Object arg2, ModelAndView arg3)
			throws Exception {
	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object arg2) throws Exception {
//		HttpContext.init(req, resp);
//		String url = req.getRequestURI();
//		if(!url.contains(".vhtml") && !OpenURL.isOpenURL(url)){
//			String customerUuid = req.getParameter("customerUuid");
//			if(StringUtil.isNullOrEmpty(customerUuid)){
//				throw new ServiceException(ServiceError.UN_LOGIN);
//			}else{
//				//检查用户是否冻结
//				if(RexClientVerUtil.isNew(req) && this.userRedis.isFrozen(customerUuid)){
//					throw new ServiceException(ServiceError.USER_FROZEN);
//				}
//			}
//		}
		return true;
	}
}
