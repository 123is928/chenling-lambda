package com.chenling.interfae;

import com.chenling.entity.Student;

@FunctionalInterface
public interface StudentDao {
    void insert(Student student);
}
