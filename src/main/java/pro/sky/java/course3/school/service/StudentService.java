package pro.sky.java.course3.school.service;

import pro.sky.java.course3.school.model.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);

    Student getStudent(Long id);

    Student updateStudent(Student student);

    void deleteStudent(Long id);

    List filterByAge(int age);

    List filterByAgeBetween(int min, int max);

    List<Student> getAllStudents();

    String getFacultyName(Long id);
}
