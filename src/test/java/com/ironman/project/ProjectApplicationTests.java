package com.ironman.project;

import com.ironman.project.pojo.Order;
import com.ironman.project.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootTest
class ProjectApplicationTests {
		@Resource
		private OrderService orderService;
		@Test
		public void test() {
				List<String> list = Arrays.asList("1", "2", "3");
				Collections.reverse(list);
				list.forEach(System.out::println);
		}
		@Test
		public void test1(){
//				orderService.findAll().forEach(System.out::println);
				Order order = new Order();
				boolean b = orderService.saveOrUpdate(order);
				System.out.println(b);
		}
}
