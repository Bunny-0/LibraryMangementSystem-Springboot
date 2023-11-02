package com.examplelibrary.Library.Management.System.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.awt.geom.GeneralPath;
import java.util.List;

@Data
@Entity
public class Author {

    @Id
    String Name;
    @JsonIgnore
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    List<Book> books;
}
