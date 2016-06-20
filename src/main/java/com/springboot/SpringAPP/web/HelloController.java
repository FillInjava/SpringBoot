package com.springboot.SpringAPP.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/he")
public class HelloController {
	@RequestMapping(value="/hello")
	public String hello(){
		return "Hello World";
	}
}
