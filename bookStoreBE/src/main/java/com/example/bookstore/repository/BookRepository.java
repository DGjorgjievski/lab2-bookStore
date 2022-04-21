package com.example.bookstore.repository;

import com.example.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Long> {

    List<Book> findAll();

    Optional<Book> findById(Long id);

    List<Book> findByAuthorId(Long id);

    void deleteById(Long id);
}
