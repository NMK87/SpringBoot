package com.springBoot.web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Autowired
	private  JdbcTemplate jdbcTemplate;
	
	public UserDao() {
		
	}
	
	public int createTable() {
		
		String query = "CREATE TABLE IF NOT EXISTS User( id int PRIMARY KEY, name Varchar(200), age int, city VARCHAR(200))";
		int update = this.jdbcTemplate.update(query);
		System.out.println("Done");
		return update;
	}
	
	public int insertQuery(Integer id, String name, Integer age, String city) {
		
		String query = "insert into user(id, name, age, city) values(?,?,?,?)";
		
		int update = this.jdbcTemplate.update(query, new Object[] {id, name, age, city});
		return update;
	}

}
