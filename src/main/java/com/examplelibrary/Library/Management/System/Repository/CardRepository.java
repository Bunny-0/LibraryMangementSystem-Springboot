package com.examplelibrary.Library.Management.System.Repository;

import com.examplelibrary.Library.Management.System.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer> {
}
