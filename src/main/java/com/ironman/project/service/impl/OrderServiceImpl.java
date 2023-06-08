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
		public List<Order> findAll() {
				return orderMapper.findAll();
		}
		
		@Override
		public List<Order> selectByUid(Integer uid) {
				return orderMapper.selectByUid(uid);
		}
		
		@Override
		public List<Order> selectAllOrderAndUsers() {
				return orderMapper.selectAllOrderAndUsers();
		}
		
}
