package com.example.designpattern.protypepattern;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Student student = new Student();
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Student s = (Student) student.clone();
            s.setName("学生" + i);
            s.setAge(20 + i);
            list.add(s);
        }
        System.out.println(list);
    }

}