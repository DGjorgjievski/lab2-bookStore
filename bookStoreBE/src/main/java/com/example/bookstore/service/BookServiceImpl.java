package com.example.bookstore.service;

import com.example.bookstore.entity.Author;
import com.example.bookstore.entity.Book;
import com.example.bookstore.entity.Category;
import com.example.bookstore.exceptions.ProductNotFoundException;
import com.example.bookstore.repository.AuthorRepository;
import com.example.bookstore.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    private AuthorRepository authorRepository;

    private ArrayList<Book> books = new ArrayList<>();

    public BookServiceImpl(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> findByAuthorId(Long authorId) {
        return bookRepository.findByAuthorId(authorId);
    }

    @Override
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

    public Book createBook(String name, Long authorId) {
        Author author = authorRepository.findById(authorId).get();
        Book book = new Book(name, author);
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book book) {
        books.stream()
                .forEach(book1 -> {
                    if (book1.getId()== id) {
                        book1.setName(book.getName());
                        book1.setAuthor(book.getAuthor());
                        book1.setAvailableCopies(book.getAvailableCopies());
                        book1.setCategory(book.getCategory());
                    }
                });
        return books.stream().filter(book1 -> book1.getId() == id).findFirst().get();
    }
}
