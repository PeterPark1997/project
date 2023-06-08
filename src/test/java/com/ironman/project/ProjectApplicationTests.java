package com.ironman.project;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootTest
class ProjectApplicationTests {
		@Test
		public void test() {
				List<String> list = Arrays.asList("1", "2", "3");
				Collections.reverse(list);
				list.forEach(System.out::println);
				
				
		}
}
