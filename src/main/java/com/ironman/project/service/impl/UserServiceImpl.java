package com.ironman.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ironman.project.mapper.UserMapper;
import com.ironman.project.pojo.User;
import com.ironman.project.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Superhero
 * @doto 2023/6/5 14:42 com.ironman.project.service.impl
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
		@Resource
		private UserMapper userMapper;
		
		@Override
		public User findById(Integer id) {
				return userMapper.findById(id);
		}
		
		@Override
		public List<User> findAll() {
				return userMapper.findAll();
		}
		
		@Override
		public Integer addUser(User user) {
				//1.先从数据库中拿去数据判断用户是否已经存在
				User userMapperByName = userMapper.findByName(user.getUsername());
				if (userMapperByName != null) {
						//2.如果用户存在,则返回-1
						return -1;
				}
				//3.如果用户不存在,则添加用户
				return userMapper.addUser(user);
		}
		
		@Override
		public boolean delById(Integer id) {
				return userMapper.delById(id);
		}
		
		@Override
		public boolean updateUser(User user) {
				return userMapper.updateUser(user);
		}
		
}

