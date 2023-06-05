package com.springBoot.webController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	
//	@RequestMapping(value = "/books", method= RequestMethod.GET)
//	@ResponseBody
	@GetMapping("/")
	public String getBooks() {
		
		return "this is my api project";
	}
}
