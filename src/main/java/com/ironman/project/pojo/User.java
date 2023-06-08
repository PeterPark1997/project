package com.ironman.project.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

/**
 * @author Superhero
 * @doto 2023/6/5 14:38 com.ironman.project.pojo
 */
@Data
@TableName("user")
public class User {
		
		//		@TableId:指定主键的生成策略
		private Integer id;
		
		//		@TableField:指定数据库中的字段名
		@TableField("username")
		private String username;
		private String password;
		private String address;
		@TableField(exist = false)
		private List<Order> orders;
}
