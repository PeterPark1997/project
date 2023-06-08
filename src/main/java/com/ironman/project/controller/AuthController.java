//package com.ironman.project.controller;
//
//import cn.hutool.jwt.JWT;
//import com.ironman.project.config.Result;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.annotation.Resource;
//import java.nio.charset.StandardCharsets;
//
///**
// * @author Superhero
// * @doto 2023/6/7 16:02 com.ironman.project.controller
// */
//@RestController
//@RequestMapping("/auth")
//public class AuthController {
//		@RequestMapping("/login")
//		public Result login() {
//				return Result.success("登录成功");
//		}
//		@Resource
//		AuthenticationManager authenticationManager;
//
//		@PostMapping("/login")
//		public String login(@RequestBody SignInReq req) {
//
//				UsernamePasswordAuthenticationToken authenticationToken =
//								new UsernamePasswordAuthenticationToken(req.getUsername(), req.getPassword());
//				authenticationManager.authenticate(authenticationToken);
//
//				//上一步没有抛出异常说明认证成功，我们向用户颁发jwt令牌
//				String token = JWT.create()
//								.setPayload("username", req.getUsername())
//								.setKey(MyConstant.JWT_SIGN_KEY.getBytes(StandardCharsets.UTF_8))
//								.sign();
//
//				return token;
//		}
//}
