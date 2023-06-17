package com.springBoot.web.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springBoot.web.entity.Book;

@Component
public class Bookservices {

	
	private static List<Book> list = new ArrayList<>();
	
	
	static {
		list.add(new Book(1,"java","Stepan"));
		list.add(new Book(2,"python","harris"));
		list.add(new Book(3,"html","fang lang"));
		
	}
	
	//get all books
	public List<Book> getBooks(){
		
		return list;
	}
	
	//get single book
	public Book getSingleBook(int Book_id){
		
		Book book=null;
		book = list.stream().filter(e->e.getBook_id()==Book_id).findFirst().get();
		return book;
	}
}
