package com.examplelibrary.Library.Management.System.Repository;

import com.examplelibrary.Library.Management.System.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
