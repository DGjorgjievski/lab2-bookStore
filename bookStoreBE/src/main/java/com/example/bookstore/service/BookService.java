package com.example.bookstore.service;

import com.example.bookstore.entity.Book;

import java.util.List;

public interface BookService {

    Book findById(Long id);

    List<Book> findAll();

    List<Book> findByAuthorId(Long id);

    void deleteById(Long id);

    Book updateBook(Long id, Book book);
}
