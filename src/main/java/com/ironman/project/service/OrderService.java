package com.ironman.project.service;


import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ironman.project.pojo.Order;
import org.aspectj.weaver.ast.Or;

import java.util.List;

public interface OrderService extends IService<Order> {
		
		Order findById(Integer id);
		
		List<Order> findAll();
		
		boolean addOrder(Order order);
		
		boolean deleById(Integer id);
		
		void delByIds(List<Integer> ids);
		
		Order updateOrder(Order order);
}
