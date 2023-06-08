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
		public List<User> findAll() {
				return userMapper.findAll();
		}
		
		@Override
		public User findById(Integer Id) {
				return userMapper.findById(Id);
		}
		
		@Override
		public boolean save(User user) {
				userMapper.save(user);
				return false;
		}
		
		@Override
		public void delById(Integer id) {
				userMapper.delById(id);
		}
		
		@Override
		public void update(User user) {
				userMapper.update(user);
				
		}
		
		@Override
		public List<User> selectAllUserAndOrder() {
				return userMapper.selectAllUserAndOrder();
		}
}
