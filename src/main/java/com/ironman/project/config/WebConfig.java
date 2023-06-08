package com.ironman.project.config;

import com.ironman.project.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Superhero
 * @doto 2023/6/6 16:35 com.ironman.project.config
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
		@Override
		public void addInterceptors(InterceptorRegistry registry) {
//				registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/login");
				registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/user/**");
		}
}
