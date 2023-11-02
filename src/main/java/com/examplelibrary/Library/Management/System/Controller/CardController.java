package com.examplelibrary.Library.Management.System.Controller;

import com.examplelibrary.Library.Management.System.Models.Book;
import com.examplelibrary.Library.Management.System.Models.Card;
import com.examplelibrary.Library.Management.System.Services.CardServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("card")
@RestController
public class CardController {

    @Autowired
    CardServices cardServices;

    @PostMapping("/addCard")
    public Card addCard(@RequestBody Card card){
        return cardServices.addCard(card);
    }

    @GetMapping("/getBook/{id}")
    public List<Book> getBook(@PathVariable int id){
        return cardServices.getBooks(id);
    }
}
