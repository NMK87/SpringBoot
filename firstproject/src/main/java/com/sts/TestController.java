package com.sts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {


		// TODO Auto-generated method stub

		@ResponseBody
		@RequestMapping("/test")
		public String handler() {
			
			return "my first STS project";
		
	}

}
