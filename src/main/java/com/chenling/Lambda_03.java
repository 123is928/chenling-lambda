package com.chenling;

import com.chenling.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda_03 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(1);

        Student s2 = new Student();
        s2.setAge(1);
        s2.setName("2");

        Student s3 = new Student();
        s3.setAge(1);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        boolean b = students.stream().map(Student::getName).allMatch(Objects::isNull);
        System.out.println(b);

    }

    private static void sets1Name(Student student) {
        student.setName("1");
    }
}
