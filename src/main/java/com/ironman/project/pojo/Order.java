package com.ironman.project.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Superhero
 * @doto 2023/6/7 15:19 com.ironman.project.pojo
 */
@Data
public class Order {
		@TableId(type = IdType.AUTO)
		private Integer orderId;
		private LocalDateTime orderTime;
		private BigDecimal total;
		private Integer uid;
		@TableField(exist = false)
		private User user;
}
