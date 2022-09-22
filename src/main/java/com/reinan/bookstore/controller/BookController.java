package com.reinan.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reinan.bookstore.dto.MessageResponseDTO;
import com.reinan.bookstore.entity.Book;
import com.reinan.bookstore.service.BookService;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

	private BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}

	@PostMapping
	public MessageResponseDTO create(@RequestBody Book book) {
		
		return bookService.create(book); 
	}

}
