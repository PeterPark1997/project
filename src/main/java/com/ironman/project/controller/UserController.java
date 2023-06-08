package com.ironman.project.controller;

import com.ironman.project.config.Result;
import com.ironman.project.mapper.UserMapper;
import com.ironman.project.pojo.Address;
import com.ironman.project.pojo.User;
import com.ironman.project.service.UserService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Superhero
 * @doto 2023/6/5 14:41 com.ironman.project.controller
 */
@RestController
@RequestMapping("/user")
public class UserController {
		@Resource
		private UserService userService;
		
		/**
		 * 简单的查询数据库ironman的user表信息
		 * localhost:8080/user/findAll
		 */
		@RequestMapping("/findAll")
		public Result<List<User>> findAll() {
				List<User> users = userService.findAll();
				if (users != null) {
						return Result.success(users);
				} else {
						return Result.error("服务错误,请重新尝试");
				}
		}
		
		
		/**
		 * 简单的查询http页面数据请求格式
		 * localhost:8080/user/find?name=Superhero&password=123456
		 */
		@RequestMapping("/find")
		public Result find(@RequestParam("name") String name, @RequestParam("password") String password) {
				System.out.println(name + password);
				return Result.success("Hello World");
		}
		
		/**
		 * 查询出来的数据封装到实体类中
		 * localhost:8080/user/findUser
		 */
		@RequestMapping("/findUsers")
		public Result findUsers(User user) {
				user.setId(1);
				user.setUsername("Superhero");
				user.setPassword("123456");
				System.out.println(user);
				return Result.success(user);
		}
		
		/**
		 * 将address封装到User类中,在User中设置address属性
		 * localhost:8080/user/findUserAndAddress
		 */
//		@RequestMapping("/findUserAndAddress")
//		public Result findUserAndAddress(User user, Address address) {
//				user.setId(1);
//				user.setUsername("Superhero");
//				user.setPassword("123456");
//				address.setProvince("广东省");
//				address.setCity("深圳市");
//				user.setAddress(address);
//				return Result.success(user);
//		}
		
		/**
		 * 使用集合来封装hobby多选数据
		 * localhost:8080/user/findListHobby?hobby=game&hobby=computer&hobby=reading
		 */
		@RequestMapping("/findListHobby")
		public Result findListHobby(@RequestParam("hobby") List<String> hobby) {
				System.out.println(hobby);
				return Result.success(hobby);
		}
		
		/**
		 * 使用DateTimeFormat来格式化时间
		 * %20:表示空格
		 * http://localhost:8080/user/findLocalTime?updateTime=1992-12-26%2012:12:12
		 */
		@RequestMapping("/findLocalTime")
		public Result findLocalTime(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime) {
				System.out.println(updateTime);
				return Result.success(updateTime);
		}
		
		/**
		 * Json格式数据
		 * 将方法返回值直接响应，如果返回值类型是 实体对象/集合，将会转换为SON格式响应
		 *
		 * @RequestBody:将Json格式数据封装到实体类中 http://localhost:8080/user/findJson
		 */
		@RequestMapping("/findJson")
		public Result findJson(@RequestBody User user) {
				/*user.setId(1);
				user.setUsername("Superhero");
				user.setPassword("123456");
				user.setAddress(new Address("广东省","深圳市"));*/
				System.out.println(user);
				return Result.success(user);
		}
		
		
		/**
		 * 路径参数数据
		 * http://localhost:8080/user/findPath/{{id}}/{{username}}/{{password}}
		 *
		 * @Pathvariable:将路径中的变量与形参动态绑定在一起,需要在路径中使用{}来占位;
		 */
		@RequestMapping("/findPath/{id}/{username}/{password}")
		public Result findPath(@PathVariable Integer id, @PathVariable String username, @PathVariable String password) {
				System.out.println(id + username + password);
//				return Result.success(id + username + password);
				return Result.success(200, "请求成功", id + username + password);
		}
		
		/**
		 * 修改
		 */
		@PutMapping
		public Result update(User user) {
				userService.update(user);
				return Result.success("修改成功");
		}
		
		
		/**
		 * 删除
		 */
		@DeleteMapping("/{id}")
		public Result delById(@PathVariable("id") Integer Id) {
				userService.delById(Id);
				return Result.success("删除成功");
		}
		
		/**
		 * 新增
		 */
		@PostMapping
		public Result save(User user) {
				userService.save(user);
				return Result.success("新增成功");
		}
		
		/**
		 * 查询
		 */
		@GetMapping("/{id}")
		public Result findById(@PathVariable("id") Integer Id) {
				return Result.success(userService.findById(Id));
		}
		
		@GetMapping()
		public Result findMPAll(){
				return Result.success(userService.findAll());
		}
		
		@GetMapping("/selectAllUserAndOrder")
		public Result selectAllUserAndOrder(){
				return Result.success(userService.selectAllUserAndOrder());
		}
		
		
}
