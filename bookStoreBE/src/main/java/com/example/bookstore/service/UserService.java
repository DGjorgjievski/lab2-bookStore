package com.example.bookstore.service;

import com.example.bookstore.entity.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findByUsername(String username);

    void deleteById(Long id);
}
