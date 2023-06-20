package com.springBoot.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springBoot.web.dao.UserDao;

@SpringBootApplication
public class BootjdbcprojectApplication implements CommandLineRunner {

	@Autowired
	private UserDao userDao;
	
	public static void main(String[] args) {
		SpringApplication.run(BootjdbcprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this.userDao.createTable());
		
		this.createuUser();
		
	}
	
	public void createuUser() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Id: ");
		Integer userId = Integer.parseInt(br.readLine());
		
		System.out.println("Enter User name: ");
		String userName =br.readLine();
		
		System.out.println("Enter age: ");
		Integer userAge = Integer.parseInt(br.readLine());
		
		System.out.println("Enter City: ");
		String userCity =br.readLine();
		
		int i = this.userDao.insertQuery(userId, userName, userAge, userCity);
		
		System.out.println(i+"User added");
		
	}

}