package com.examplelibrary.Library.Management.System.Models;

import com.examplelibrary.Library.Management.System.Enum.TransactionStatus;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Transaction {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            int id;
    TransactionStatus status;
    @OneToOne
    @JoinColumn
    Card card;

}
