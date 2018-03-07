package com.zeasn.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zeasn.log.ApiVisitLogger;

/**
 * 全局维护信息 访问日志 请求处理时间日志
 */
public class HttpContext {
	/** 请求信息 */
	private static ThreadLocal<HttpServletRequest> request = new ThreadLocal<HttpServletRequest>();
	/** 响应信息 */
	private static ThreadLocal<HttpServletResponse> response = new ThreadLocal<HttpServletResponse>();
	/** 会话信息 */
	private static ThreadLocal<HttpSession> session = new ThreadLocal<HttpSession>();
	/** 请求时间计算 */
	private static ThreadLocal<Long> localtime = new ThreadLocal<Long>();

	/**
	 * 初始化
	 */
	public static void init(HttpServletRequest req, HttpServletResponse resp) {
		request.set(req);
		response.set(resp);
		session.set(req.getSession());
		Long time = System.currentTimeMillis();
		localtime.set(System.currentTimeMillis());
	}

	/**
	 * 获取request
	 */
	public static HttpServletRequest getRequest() {
		return request.get();
	}

	/**
	 * 获取response
	 */
	public static HttpServletResponse getResponse() {
		return response.get();
	}

	/**
	 * 获取session
	 */
	public static HttpSession getSession() {
		return session.get();
	}

	/**
	 * 获取request time
	 */
	public static Long getRequestTime() {
		return localtime.get();
	}

	/**
	 * 释放
	 */
	public static void release() {
		// 请求处理完成时间日志
		request.remove();
		response.remove();
		session.remove();
		localtime.remove();
	}
}
