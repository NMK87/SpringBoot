package com.springBoot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.web.entity.Book;
import com.springBoot.web.services.Bookservices;

@RestController
public class BookController {
	
	@Autowired
	private Bookservices bookservices;
	
//	@RequestMapping(value = "/books", method= RequestMethod.GET)
//	@ResponseBody
	@GetMapping("/books")
	public List<Book> getBooks() {
		
//		Book book = new Book();
//		book.setBook_id(123);
//		book.setTitle("the alchimeist");
//		book.setAuthor("planeo");
		return this.bookservices.getBooks();
	}
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int Book_id) {
		
		return bookservices.getSingleBook(Book_id);
		
	}
	
	
}
