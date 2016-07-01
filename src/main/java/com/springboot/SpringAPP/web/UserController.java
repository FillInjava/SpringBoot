package com.springboot.SpringAPP.web;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.springboot.SpringAPP.domain.User;
import com.springboot.SpringAPP.service.SpringdataService;
import com.springboot.SpringAPP.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;
	@Resource
	private SpringdataService springdataService;
	
	@RequestMapping("/getUser")
	public User getUser(){	
		User user = new User();
		user.setUsername("lg");
		user.setUsercode("1111");
		
		return user;
	}
	
	@RequestMapping("/zeroException")
	public int zeroException(){
	    return 100/0;
	}
	
	@RequestMapping("/getFastJSON")
	public String getFastJSON(){
		User user = new User();
		user.setUsername("ly");
		user.setUsercode("2222");
		
		return JSONObject.toJSONString(user);
	}
	
	@RequestMapping("/save")
	public String save(User user){
		userService.save(user);
		//springdataService.save(user);
		return "success";
	}
	
	@RequestMapping("/getById")
	public String getById(int id){
		
		return JSONObject.toJSONString(userService.getById(id));
	}
}
