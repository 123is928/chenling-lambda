package com.chenling;

import com.chenling.entity.Student;
import com.chenling.interfae.StudentDao;

public class Lambda_Student_01 {
    public static void main(String[] args) {

        StudentDao studentDao = (student) -> {
            System.out.println("插入:" + student);
        };

        StudentDao studentDao1 = new StudentDao() {
            @Override
            public void insert(Student student) {
                System.out.println("插入1:" + student);
            }
        };
        // ========================上下写法一样===========================
        Student student = new Student();
        studentDao.insert(student);
        studentDao1.insert(student);



    }
}
