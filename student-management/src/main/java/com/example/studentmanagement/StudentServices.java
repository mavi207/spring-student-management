package com.example.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {

    @Autowired
    StudentRepository studentRepository;

    public Student getStudent(int regNo){

        System.out.println("Repo bean called in service: "+studentRepository);
        Student student = studentRepository.getStudent(regNo);
        return student;
    }

    public String addStudent(Student student) {
        studentRepository.addStudent(student);
        return "Student added successfully";
    }

    public Student getStudentUsingPath(int regNo) {
        return studentRepository.getStudentUsingPath(regNo);
    }

    public Student updateAge(int regNo, int newAge) {
        return studentRepository.updateAge(regNo,newAge);
    }
}