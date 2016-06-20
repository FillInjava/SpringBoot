package com.springboot.SpringAPP.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.SpringAPP.domain.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/getUser")
	public User getUser(){	
		User user = new User();
		user.setUsername("lg");
		user.setUuid("1111");
		
		return user;
	}
	
	@RequestMapping("/zeroException")
	public int zeroException(){
	    return 100/0;
	}
}
