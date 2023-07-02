package pro.sky.java.course3.school.service;

import pro.sky.java.course3.school.model.Student;

import java.util.List;

public interface StudentService {
    public Student addStudent(Student student);

    Student getStudent(Long id);

    Student updateStudent(Student student);

    Student deleteStudent(Long id);

    List filterByAge(int age);
}
