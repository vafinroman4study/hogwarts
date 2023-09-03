package pro.sky.java.course3.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.java.course3.school.model.Faculty;

import java.util.List;

public interface FacultyRepository extends JpaRepository<Faculty,Long> {
    List<Faculty> findByColorIgnoreCase(String color);
    List<Faculty> findByNameIgnoreCase(String name);
}
