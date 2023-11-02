package com.examplelibrary.Library.Management.System.Models;

import com.examplelibrary.Library.Management.System.Enum.Genre;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    Genre genre;
    boolean availability;
    @ManyToOne
    @JoinColumn
    Author author;
    @ManyToOne
    @JsonIgnore
    @JoinColumn
    Student student;
    @JsonIgnore
    @ManyToOne
    Card card;
}
