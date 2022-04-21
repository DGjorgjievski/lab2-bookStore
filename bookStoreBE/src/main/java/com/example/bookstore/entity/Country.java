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
@Table(name="country")
public class Country {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String continent;

    @OneToMany
    private List<Author> authorList;

}
