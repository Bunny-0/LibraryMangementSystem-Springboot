package com.examplelibrary.Library.Management.System.Controller;


import com.examplelibrary.Library.Management.System.Models.Author;
import com.examplelibrary.Library.Management.System.Models.Book;
import com.examplelibrary.Library.Management.System.Repository.AuthorRepository;
import com.examplelibrary.Library.Management.System.Services.AuthorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("author")
@RestController
public class AuthorController {

    @Autowired
    AuthorServices authorServices;


    @PostMapping("/addAuthor")

    public Author addAuthor(Author author){

        return authorServices.addAuthor(author);

    }

    @GetMapping("/getBooks")
    public List<Book> getByAuthor(@RequestBody Author author){
        return authorServices.getByAuthor(author);
    }

}
