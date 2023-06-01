package com.springBoot.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springBoot.jpa.dao.UserRepository;
import com.springBoot.jpa.entites.Users;

@SpringBootApplication
public class SpringBootJpaProjectApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context= SpringApplication.run(SpringBootJpaProjectApplication.class, args);
		UserRepository userRepository= context.getBean(UserRepository.class);
		
		Users user = new Users();
		user.setName("neha");
		user.setCity("mandya");
		user.setStatus("read");
		
		Users user1 = userRepository.save(user);
		
		System.out.println(user1);
		
	}

}
