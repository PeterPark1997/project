package com.ironman.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ironman.project.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
//使用MybatisPlus的话，这里可以继承BaseMapper<User>
public interface UserMapper extends BaseMapper<User> {
		
		User findById(Integer id);
		
		List<User> findAll();
		
		Integer addUser(User user);
		
		User findByName(String username);
		
		boolean delById(Integer id);
		
		boolean updateUser(User user);
}