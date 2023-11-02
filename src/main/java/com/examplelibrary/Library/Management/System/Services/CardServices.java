package com.examplelibrary.Library.Management.System.Services;

import com.examplelibrary.Library.Management.System.Models.Book;
import com.examplelibrary.Library.Management.System.Models.Card;
import com.examplelibrary.Library.Management.System.Repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServices {

    @Autowired
    CardRepository cardRepository;

    public Card addCard(Card card){
        return cardRepository.save(card);
    }
    public List<Book> getBooks(int id){
        return cardRepository.findById(id).get().getBookList();
    }

}
