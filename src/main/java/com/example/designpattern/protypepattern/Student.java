package com.example.designpattern.protypepattern;

import lombok.Data;

import java.util.Date;

/**
 * @author zhangquanwei
 */
@Data
public class Student implements Cloneable {
    private String name;
    private int age;
    private Date birthday;
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        // 引用类型深克隆
        Date birthday = (Date) student.getBirthday().clone();
        student.setBirthday(birthday);
        return student;
    }
}
