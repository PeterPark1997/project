package com.ironman.project.controller;

import com.ironman.project.config.Result;
import com.ironman.project.pojo.Order;
import com.ironman.project.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Superhero
 * @doto 2023/6/7 15:36 com.ironman.project.controller
 */
@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {
		@Resource
		private OrderService orderService;
		
		@GetMapping("/findAll")
		public Result findAll() {
				List<Order> orderList = orderService.findAll();
				log.info("查询所有订单:{}", orderList);
				return Result.success(200, "查询成功,订单信息如下", orderList);
		}
		
		@GetMapping("/selectByUid/{uid}")
		public Result selectByUid(@PathVariable Integer uid) {
				List<Order> orderList = orderService.selectByUid(uid);
				log.info("查询用户id为{}的所有订单:{}", uid, orderList);
				return Result.success(200, "查询成功,订单信息如下", orderList);
		}
		
		@GetMapping("/selectAllOrderAndUsers")
		public Result selectAllOrderAndUsers() {
				List<Order> orderList = orderService.selectAllOrderAndUsers();
				log.info("查询所有订单及其用户信息:{}", orderList);
				return Result.success(200, "查询成功,订单信息如下", orderList);
		}
		
		
}
