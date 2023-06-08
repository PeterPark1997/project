package com.ironman.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ironman.project.mapper.OrderMapper;
import com.ironman.project.pojo.Order;
import com.ironman.project.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Superhero
 * @doto 2023/6/7 15:27 com.ironman.project.service.impl
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
		@Resource
		private OrderMapper orderMapper;
		
		
		@Override
		public Order findById(Integer id) {
				return orderMapper.findById(id);
		}
		
		@Override
		public List<Order> findAll() {
				return orderMapper.findAll();
		}
		
		@Override
		public boolean addOrder(Order order) {
				return orderMapper.addOrder(order);
		}
		
		@Override
		public boolean deleById(Integer id) {
				return orderMapper.delById(id);
		}
		
		@Override
		public void delByIds(List<Integer> ids) {
				orderMapper.delByIds(ids);
		}
		
		@Override
		public Order updateOrder(Order order) {
				return orderMapper.updateOrder(order);
		}
}
