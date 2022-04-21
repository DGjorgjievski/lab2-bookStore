package com.example.bookstore.controller;

import com.example.bookstore.entity.User;
import com.example.bookstore.security.SecurityService;
import com.example.bookstore.service.UserService;
import com.example.bookstore.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserServiceImpl userService;

    private SecurityService securityService;

    @Autowired
    public UserController(UserServiceImpl userService, SecurityService securityService) {
        this.userService = userService;
        this.securityService = securityService;
    }

    @GetMapping("/api/users")
    public List<User> findUsers()
    {
        return userService.findUsers();
    }

    @GetMapping("/api/users/{id}")
    public User findById(@PathVariable Long id)
    {
        return userService.findById(id);
    }

    @GetMapping("/api/users/me")
    public User findAuthenticatedCustomer()
    {
        return securityService.getAuthenticatedUser();
    }

    @DeleteMapping("/api/users/{id}")
    public void deleteById(@PathVariable Long id) { userService.deleteById(id);}
}
