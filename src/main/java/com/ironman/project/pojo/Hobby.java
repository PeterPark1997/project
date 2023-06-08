package com.ironman.project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Superhero
 * @doto 2023/6/5 15:51 com.ironman.project.pojo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hobby {
		private List<String> hobbys;
		private Integer id;
		

}
