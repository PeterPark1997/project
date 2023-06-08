package com.ironman.project.controller;

import com.ironman.project.config.Result;
import com.ironman.project.pojo.Order;
import com.ironman.project.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

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
		
		/**
		 * 查询
		 */
		@GetMapping("/findById/{id}")
		public Result findById(@PathVariable Integer id) {
				Order order = orderService.findById(id);
				return Result.success(200, "查询成功", order);
		}
		
		/**
		 * 查询所有
		 */
		@GetMapping("/findAll")
		public Result findAll() {
				List<Order> orders = orderService.findAll();
				return Result.success(200, "查询成功", orders);
		}
		
		
		/**
		 * 删除
		 */
		@DeleteMapping("/delById/{id}")
		public Result deleById(@PathVariable Integer id) {
				orderService.deleById(id);
				return Result.success(200, "删除成功", id);
		}
		
		
		/**
		 * 批量删除
		 */
		
		@DeleteMapping("/delByIds/{ids}")
		public Result delByIds(@PathVariable List<Integer> ids) {
				orderService.delByIds(ids);
				return Result.success(200, "批量删除成功", ids);
		}
		
		/**
		 * 修改
		 * */
		@PostMapping("/updateOrder")
		public Result updateOrder(Order order) {
				orderService.updateOrder(order);
				return Result.success(200, "修改成功", order);
		}
		
		
		
		/**
		 * 新增
		 */
		@PutMapping("/addOrder")
		public Result addOrder(Order order) {
				orderService.addOrder(order);
				return Result.success(200, "新增成功", order);
		}
		
		
}
