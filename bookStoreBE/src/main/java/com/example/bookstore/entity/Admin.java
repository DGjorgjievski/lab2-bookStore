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
@Table(name="admin")
public class Admin {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String username;

    @Column
    private String password;

    @OneToMany(mappedBy = "admin")
    private List<Book> books;
}
