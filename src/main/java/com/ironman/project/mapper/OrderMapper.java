package com.ironman.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ironman.project.pojo.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Superhero
 * @doto 2023/6/7 15:25 com.ironman.project.mapper
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
		List<Order> findAll();
		
		@Select("select * from `order` where uid=#{uid}")
		List<Order> selectByUid(Integer uid);
		
		@Select("select * from `order`")
		@Results(
						{
										@Result(column = "orderId", property = "orderId"),
										@Result(column = "orderTime", property = "order_time"),
										@Result(column = "total", property = "total"),
										@Result(column = "uid", property = "user", javaType = List.class,
														one = @One(select = "com.ironman.project.mapper.UserMapper.findById")) //一对多
//										one = @One(select = "com.ironman.project.mapper.UserMapper.selectById")) //一对多
						
						}
		)
		List<Order> selectAllOrderAndUsers();
}
