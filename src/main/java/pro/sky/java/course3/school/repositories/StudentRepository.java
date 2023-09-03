package pro.sky.java.course3.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.java.course3.school.model.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByAge(int age);
    List<Student> findByAgeBetween(int min, int max);
}
