package com.ironman.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ironman.project.pojo.User;

import java.util.List;

public interface UserService extends IService<User> {
		List<User>findAll();
		
		User findById(Integer Id);
		
		boolean save(User user);
		
		void delById(Integer id);
		
		void update(User user);
		
		List<User> selectAllUserAndOrder();
}
