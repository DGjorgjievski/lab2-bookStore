package com.example.bookstore.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="user")
public class User {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String username;

    @Column
    private String password;

}
