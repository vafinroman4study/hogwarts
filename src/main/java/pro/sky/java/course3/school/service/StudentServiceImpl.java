package pro.sky.java.course3.school.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course3.school.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService{

    private HashMap<Long, Student>  students = new HashMap();
    private long id = 0;

    @Override
    public Student addStudent(Student student) {
        id++;
        student.setId(id);
        return students.put(id, student);
    }
    @Override
    public Student getStudent(Long id) {
        return students.get(id);
    }
    @Override
    public Student updateStudent(Student student) {
        return students.put(student.getId(), student);
    }
    @Override
    public Student deleteStudent(Long id) {
        return students.remove(id);
    }

    @Override
    public List filterByAge(int age) {
        return students.values()
                .stream().filter(e->age == e.getAge())
                .collect(Collectors.toList());
    }
}
