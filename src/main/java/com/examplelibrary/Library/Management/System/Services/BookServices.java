package com.examplelibrary.Library.Management.System.Services;

import com.examplelibrary.Library.Management.System.Models.Author;
import com.examplelibrary.Library.Management.System.Models.Book;
import com.examplelibrary.Library.Management.System.Repository.AuthorRepository;
import com.examplelibrary.Library.Management.System.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServices {

@Autowired
    BookRepository bookRepository;
@Autowired
    AuthorRepository authorRepository;

 public Book addBook(Book book){
     authorRepository.save(book.getAuthor());

     return  bookRepository.save(book);
 }



//    Get Books: GET /book/ Pass nullable parameters genre, availability, and author to filter out books For example:
//    i) If genre=”X”, availability = true, and author=null; we require the list of all books which are available and
//    have genre “X”. Note that these books can be written by any author. ii) If genre=”Y”, availability = false, and
//    author=”A”; we require the list of all books which are written by author “A”, have genre “Y”, and are currently
//    unavailable. Return success message wrapped in a ResponseEntity object Controller Name - getBooks

    public List<Book> getBook(String genre, boolean availability, Author author){
     if(author==null){
         return bookRepository.findAll().stream().filter(book -> book.getGenre().toString().equals(genre) && book.isAvailability()==availability).collect(Collectors.toList());
     }
      return bookRepository.findAll().stream().filter(book -> book.getGenre().toString().equals(genre) && book.isAvailability() == availability && book.getAuthor().getName().equalsIgnoreCase(author.getName())).collect(Collectors.toList());
    }



}
