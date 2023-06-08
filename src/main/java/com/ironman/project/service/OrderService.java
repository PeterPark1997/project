package com.ironman.project.service;


import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ironman.project.pojo.Order;

import java.util.List;

public interface OrderService extends IService<Order> {
		
		List<Order> findAll();
		
		List<Order> selectByUid(Integer uid);
		
		List<Order> selectAllOrderAndUsers();
}
