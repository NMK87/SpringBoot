package com.springBoot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		
		int a=8;
		int b=5;
		int c=2;
		int d=1;
		return("Its for testing sum of two numbers are:"+ (a+b+c+d));
	}

}
