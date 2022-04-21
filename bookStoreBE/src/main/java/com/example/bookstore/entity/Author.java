package com.example.bookstore.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="author")
public class Author {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String surname;

    @ManyToOne
    private Country country;

    @OneToMany(mappedBy = "author")
    private List<Book> books;
}
