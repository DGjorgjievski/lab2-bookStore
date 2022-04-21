package com.example.bookstore.controller;

import com.example.bookstore.entity.Book;
import com.example.bookstore.service.BookService;
import com.example.bookstore.service.BookServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    private BookService bookService;

    private BookServiceImpl bookServiceImpl;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/api/books")
    public Book createBook(@RequestBody CreateBookRequest request) {
        return bookServiceImpl.createBook(request.name, request.authorId);
    }

    public static class CreateBookRequest {

        public String name;

        public Long authorId;
    }

    @GetMapping("/api/books/{id}")
    public Book findBookById(@PathVariable Long id) {
        return bookService.findById(id);
    }

    @GetMapping("/api/books")
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @GetMapping("/api/authors/{authorId}/books")
    public List<Book> findBooksByAuthorId(@PathVariable Long authorId) {
        return bookService.findByAuthorId(authorId);
    }

    @DeleteMapping("/api/books/{id}")
    public void deleteById(@PathVariable Long id) {
        bookService.deleteById(id);
    }

    @PutMapping("/api/books/{id}")
    public Book updateBook(@PathVariable("id") Long id, @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }
}
