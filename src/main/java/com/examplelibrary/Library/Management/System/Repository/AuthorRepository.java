package com.examplelibrary.Library.Management.System.Repository;


import com.examplelibrary.Library.Management.System.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,String> {
}
