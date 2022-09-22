package com.reinan.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reinan.bookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
