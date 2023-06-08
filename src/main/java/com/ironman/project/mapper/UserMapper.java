package com.ironman.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ironman.project.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
//使用MybatisPlus的话，这里可以继承BaseMapper<User>
public interface UserMapper extends BaseMapper<User> {
		List<User> findAll();
		
		User findById(Integer Id);
		
		void save(User user);
		
		void delById(Integer id);
		
		void update(User user);
		
		@Select("select * from user")
		@Results(
						{
										@Result(column = "id", property = "id"),
										@Result(column = "username", property = "username"),
										@Result(column = "password", property = "password"),
										@Result(column = "uid", property = "orders", javaType = List.class,
//														@Many:一对多 select:指定调用的方法 selectByUid:指定调用的方法名 column:指定传入的参数 property:指定接收的参数 javaType:指定接收的参数类型
														many = @Many(select = "com.ironman.project.mapper.OrderMapper.selectByUid")
										)
						}
		)
		List<User> selectAllUserAndOrder();
}
