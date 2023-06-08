package com.ironman.project.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Superhero
 * @doto 2023/6/6 16:32 com.ironman.project.interceptor
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
		@Override
		public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
				log.info("LoginInterceptor.preHandle", request.getRequestURI());
				return true;
		}
}
