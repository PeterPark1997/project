package com.ironman.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ironman.project.pojo.User;

import java.util.List;

public interface UserService extends IService<User> {
		
		User findById(Integer id);
		
		List<User> findAll();
		
		Integer addUser(User user);
		
		boolean delById(Integer id);
		
		boolean updateUser(User user);
}
