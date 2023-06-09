package com.ironman.project.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Superhero
 * @doto 2023/6/5 15:12 com.ironman.project.config
 */
@Aspect
@Component
public class LoggingAspect {
		private final Logger log = LoggerFactory.getLogger(this.getClass());
		
		@Pointcut("within(@org.springframework.web.bind.annotation.RestController *)")
		public void controller() {
		}
		
		@Around("controller()")
		public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
				log.info("Enter: {}.{}() with argument[s] = {}", joinPoint.getSignature().getDeclaringTypeName(),
								joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()));
				
				try {
						Object result = joinPoint.proceed();
						log.info("Exit: {}.{}() with result = {}", joinPoint.getSignature().getDeclaringTypeName(),
										joinPoint.getSignature().getName(), result);
						return result;
				} catch (IllegalArgumentException e) {
						log.error("Illegal argument: {} in {}.{}()", Arrays.toString(joinPoint.getArgs()),
										joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
						throw e;
				}
		}
}

