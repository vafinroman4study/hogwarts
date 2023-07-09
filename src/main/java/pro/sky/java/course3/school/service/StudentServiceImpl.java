package pro.sky.java.course3.school.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course3.school.model.Student;
import pro.sky.java.course3.school.repositories.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }
    @Override
    public Student getStudent(Long id) {
        return studentRepository.findById(id).get();
    }
    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List filterByAge(int age) {
        return studentRepository.findByAge(age);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
