package com.examplelibrary.Library.Management.System.Services;

import com.examplelibrary.Library.Management.System.Models.Book;
import com.examplelibrary.Library.Management.System.Models.Card;
import com.examplelibrary.Library.Management.System.Repository.BookRepository;
import com.examplelibrary.Library.Management.System.Repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServices {

    @Autowired
    BookRepository bookRepository;
    @Autowired
    CardRepository cardRepository;


    //assign the book to the given card
    public void  issueBook(int cardId,int bookId){

        Card card=cardRepository.findById(cardId).get();
        Book book=bookRepository.findById(bookId).get();
        List<Book> books=card.getBookList();
        books.add(book);
        card.setBookList(books);
        book.setCard(card);
        book.setAvailability(false);
        bookRepository.save(book);
        cardRepository.save(card);

    }

    //Given cardId and bookId, return the book from the given card

    public Book returnBook(int cardId,int bookId){
        Card card=cardRepository.findById(cardId).get();
        Book book=bookRepository.findById(bookId).get();
        List<Book> books=card.getBookList();
        books.remove(book);
        card.setBookList(books);
        book.setAvailability(true);
        book.setCard(null);
        bookRepository.save(book);
        cardRepository.save(card);

        return book;
    }


}
