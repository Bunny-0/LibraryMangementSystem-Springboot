package com.examplelibrary.Library.Management.System.Controller;

import com.examplelibrary.Library.Management.System.Services.TransactionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("transaction")
@RestController
public class TransactionController {

    @Autowired
    TransactionServices transactionServices;


    @PostMapping("issueBook/{cardId}/{bookId}")
    public void issueBook(@PathVariable(name = "cardId") int cardId,@PathVariable(name = "bookId") int bookId){
        transactionServices.issueBook(cardId,bookId);
    }

    @GetMapping("returnBook/{cardId}/{bookId}")
    public void returnBook(@PathVariable(name = "cardId") int cardId,@PathVariable(name = "bookId") int bookId){
        transactionServices.returnBook(cardId,bookId);
    }

}
