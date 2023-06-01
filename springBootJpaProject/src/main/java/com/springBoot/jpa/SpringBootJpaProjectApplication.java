package com.springBoot.jpa;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import javax.swing.text.html.HTMLDocument.Iterator;

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
		
		//Create a single user
//		Users user = new Users();
//		user.setName("Neha");
//		user.setCity("Mandya");
//		user.setStatus("Currently working on Spring Boot");
//		
//		Users user1 = userRepository.save(user);
//		System.out.println(user1);
//		
//		Users user2 = new Users();
//		user2.setName("Neha");
//		user2.setCity("Manglore");
//		user2.setStatus("A java programmer");
//		
//		Users user1 = new Users();
//		user1.setName("Ananya");
//		user1.setCity("Mysore");
//		user1.setStatus("A Python programmer");
		
//		Users result = userRepository.save(user1);
		
//		List<Users> result =List.of(user1,user2);
		//here we are saving multiple objects by using saveAll. And traversing it by using Iterable.
//		Iterable<Users> resultIterator = userRepository.saveAll(result);
//		
//		resultIterator.forEach(users ->{
//			System.out.println(resultIterator);
//		});
//		
//		System.out.println(result);
		
//		Update value of Neha with id 4
		
//		Optional<Users> option = userRepository.findById(4);
//		Users user = option.get();
//		
//		user.setName("Neha P");
//		Users result = userRepository.save(user);
//		
//		System.out.println(result);
		
		//to get data by findById
//		Optional<Users> option1 = userRepository.findById(2);
//		Users  user1 = option1.get();
//		System.out.println(user1);
		
		//to get data by findAll
		
//		Iterable<Users> itr = userRepository.findAll();
//		java.util.Iterator<Users> iterator= itr.iterator();
//		
//		while(iterator.hasNext()) {
//			
//			Users user = iterator.next();
//			System.out.println(user);
//		}
		
//		itr.forEach(new Consumer<Users>(){
//			
//			public void accept(Users t) {
//				System.out.println(t);
//			}
//		});
		// best way to find data is by lambda funtion
//		itr.forEach(user ->{System.out.println(user);});
		
		//delete user
		
//		userRepository.deleteById(1);
//		System.out.println("deleted");
		
		Iterable<Users> allusers = userRepository.findAll();
		userRepository.deleteAll(allusers);
	}

}
