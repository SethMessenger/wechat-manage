package com.zeasn.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class ServiceExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest req, HttpServletResponse response, Object obj,
			Exception ex) {
		ModelAndView mv = new ModelAndView();
		// 处理错误代码
//		ServiceError error = ServiceError.UNKNOWN;
//		ApiErrorLogger.ex_log(req, ex);
//		APIResult result = null;
//		if (ex instanceof ServiceException) {
//			ServiceException se = (ServiceException) ex;
//			error = se.getError();
//		} else if (ex instanceof BadSqlGrammarException) {
//			error = ServiceError.DB;
//		} else if (ex instanceof SQLException) {
//			error = ServiceError.DB;
//		} else if (ex instanceof ParameterException) {
//			ParameterException se = (ParameterException) ex;
//			String message = MessageFormat.format(ErrorTranslator.getMessage(se.getError()), se.getArgs());
//			result = new MessageResult(se.getError(), message);
//		}
//		if (result == null) {
//			result = new MessageResult(error);
//		}
//		mv.addObject("api_result", result);
		return mv;
	}
}