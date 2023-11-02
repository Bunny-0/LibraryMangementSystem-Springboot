package com.examplelibrary.Library.Management.System.Models;

import com.examplelibrary.Library.Management.System.Enum.CardStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    CardStatus status;
    @OneToOne
    @JoinColumn
    Student student;
    @OneToOne(mappedBy = "card",cascade = CascadeType.ALL)
    @JsonIgnore
    Transaction transaction;

    @JsonIgnore
    @OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
    List<Book> bookList;
}
