package pro.sky.java.course3.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.java.course3.school.model.Avatar;

import java.util.Optional;

public interface AvatarRepository extends JpaRepository<Avatar, Long> {
    Optional<Avatar> findByStudentId(Long studentId);
}
