package com.example.bookstore.service;

import com.example.bookstore.entity.User;
import com.example.bookstore.exceptions.UserNotFoundException;
import com.example.bookstore.repository.UserRepository;
import com.example.bookstore.security.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl {

    private UserRepository userRepository;
    private SecurityService securityService;

    @Autowired

    public UserServiceImpl(UserRepository userRepository,SecurityService securityService) {
        this.userRepository = userRepository;
        this.securityService=securityService;
    }

    public List<User> findUsers()
    {
        return  userRepository.findAll();
    }

    public User findById(Long id)
    {
        return this.userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));

    }

    public User findAuthenticatedUser()
    {
        return securityService.getAuthenticatedUser();
    }


    public Long getCurrentUserId() {
        return this.findAuthenticatedUser().getId();
    }


    public void deleteById(Long id)
    {
        userRepository.deleteById(id);
    }
}
