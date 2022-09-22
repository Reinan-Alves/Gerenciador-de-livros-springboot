package com.reinan.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reinan.bookstore.dto.MessageResponseDTO;
import com.reinan.bookstore.entity.Book;
import com.reinan.bookstore.repository.BookRepository;

@Service
public class BookService {
	
	private BookRepository bookRepository;

	@Autowired
	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}
	
	
	
	public MessageResponseDTO create(Book book) {

		Book savedBook = bookRepository.save(book);
		return MessageResponseDTO.builder().message("Book Create with id " + savedBook.getId()).build();
	}
	

}
