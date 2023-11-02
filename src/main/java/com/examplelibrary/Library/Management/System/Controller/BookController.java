package com.examplelibrary.Library.Management.System.Controller;

import com.examplelibrary.Library.Management.System.Enum.Genre;
import com.examplelibrary.Library.Management.System.Models.Book;
import com.examplelibrary.Library.Management.System.Services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("Book")
@RestController
public class BookController {

    @Autowired
    BookServices bookServices;

    @GetMapping("/getBook")
    public List<Book> getBook(@RequestBody Book book){
        return bookServices.getBook(book.getGenre().toString(),book.isAvailability(),book.getAuthor());
    }

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book){
        return bookServices.addBook(book);
    }

}
