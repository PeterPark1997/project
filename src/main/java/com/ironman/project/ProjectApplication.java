package com.ironman.project;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@MapperScan(basePackages = "com.ironman.project.mapper", annotationClass = Mapper.class)
public class ProjectApplication {
		
		public static void main(String[] args) {
				log.info("Starting application");
				SpringApplication.run(ProjectApplication.class, args);
		}
		
}
