package com.springJDBC.SpringJDBC.repo;

import com.springJDBC.SpringJDBC.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    List<Student> students= new ArrayList<>();


    public void save(Student s) {
        students.add(s);
        System.out.println("Added");
    }

    public List<Student> findAll() {
        return students;
    }
}
