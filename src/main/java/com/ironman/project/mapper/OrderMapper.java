package com.ironman.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ironman.project.pojo.Order;
import com.ironman.project.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Superhero
 * @doto 2023/6/7 15:25 com.ironman.project.mapper
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
		
		Order findById(Integer id);
		
		List<Order> findAll();
		
		boolean addOrder(Order order);
		
		boolean delById(Integer id);
		
		void  delByIds(List<Integer> ids);
		
		Order updateOrder(Order order);
}
