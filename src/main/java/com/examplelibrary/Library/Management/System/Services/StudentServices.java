package com.examplelibrary.Library.Management.System.Services;

import com.examplelibrary.Library.Management.System.Models.Student;
import com.examplelibrary.Library.Management.System.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {

    @Autowired
    StudentRepository studentRepository;

    public Student addStudent(Student student){
        studentRepository.save(student);
        return  student;
    }

    public Student updateStudent(Student student){
        Student student1=studentRepository.findById(student.getId()).get();
        student1.setName(student.getName());
        student1.setEmail(student.getEmail());
        studentRepository.save(student1);
        return student;
    }
    public void deleteStudent(Student student){
        studentRepository.deleteById(student.getId());
    }

    public Student getStudentByEmail(String email){
       Student student=studentRepository.findByEmail(email);
       return student;
    }
    public Student getById(int id){
        Student student=studentRepository.findById(id).get();
        return student;
    }




}
