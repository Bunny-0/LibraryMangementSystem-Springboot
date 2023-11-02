package com.examplelibrary.Library.Management.System.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String email;
    String name;
    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    @JsonIgnore
    Card card;
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    @JsonIgnore
    List<Book> books;


}
