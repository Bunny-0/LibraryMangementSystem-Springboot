package com.examplelibrary.Library.Management.System.Repository;

import com.examplelibrary.Library.Management.System.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    public Student findByEmail(String email);
}
