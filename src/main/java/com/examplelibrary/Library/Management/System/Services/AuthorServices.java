package com.examplelibrary.Library.Management.System.Services;

import com.examplelibrary.Library.Management.System.Models.Author;
import com.examplelibrary.Library.Management.System.Models.Book;
import com.examplelibrary.Library.Management.System.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServices {

    @Autowired
    AuthorRepository authorRepository;

    public Author addAuthor(Author author){
        return authorRepository.save(author);

    }

    public List<Book> getByAuthor(Author author){
     Author author1=authorRepository.findById(author.getName()).get();
     return author1.getBooks();
    }
}
