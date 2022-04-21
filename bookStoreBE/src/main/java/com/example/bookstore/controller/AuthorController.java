package com.example.bookstore.controller;

import com.example.bookstore.entity.Author;
import com.example.bookstore.service.AuthorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/api/authors")
    public List<Author> findAll() {
        return authorService.findAll();
    }
}
