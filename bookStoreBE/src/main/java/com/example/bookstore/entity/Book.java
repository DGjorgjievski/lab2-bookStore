package com.example.bookstore.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="book")
public class Book {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    @Enumerated(EnumType.STRING)
    private Category category;

    @ManyToOne
    private Author author;

    @ManyToOne
    private Admin admin;

    @Column
    private Integer availableCopies;

    public Book(String name, Author author) {
    }
}
