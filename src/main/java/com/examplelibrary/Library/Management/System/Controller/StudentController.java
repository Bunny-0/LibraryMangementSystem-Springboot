package com.examplelibrary.Library.Management.System.Controller;

import com.examplelibrary.Library.Management.System.Models.Book;
import com.examplelibrary.Library.Management.System.Models.Student;
import com.examplelibrary.Library.Management.System.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentServices studentServices;

    @PostMapping("/addStudent")

    public Student addStudent(@RequestBody Student student){
        studentServices.addStudent(student);
        return student;
    }
    @PostMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return studentServices.updateStudent(student);
    }

    @DeleteMapping("/deleteStudent")
    public void deleteStudent(@RequestBody Student student){
        studentServices.deleteStudent(student);
    }

    @GetMapping("/studentByEmail")
    public Student getstudentByEmail(String email){
        return studentServices.getStudentByEmail(email);
    }
    @GetMapping("/studentById/{id}")
    public Student getstudentById(@PathVariable int id){
        return studentServices.getById(id);
    }
}
