package pro.sky.java.course3.school.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course3.school.model.Faculty;
import pro.sky.java.course3.school.model.Student;
import pro.sky.java.course3.school.repositories.FacultyRepository;

import java.util.List;

@Service
public class FacultyServiceImpl implements FacultyService{

    private final FacultyRepository facultyRepository;

    public FacultyServiceImpl(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    @Override
    public Faculty addFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @Override
    public Faculty getFaculty(Long id) {
        return facultyRepository.findById(id).get();
    }
    @Override
    public void deleteFaculty(Long id) {
        facultyRepository.deleteById(id);
    }
    @Override
    public Faculty updateFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    @Override
    public List filterByColor(String color) {
        return facultyRepository.findByColorIgnoreCase(color);
    }
    @Override
    public List filterByName(String name) {
        return facultyRepository.findByNameIgnoreCase(name);
    }

    @Override
    public List<Faculty> getAllFaculties() {
        return facultyRepository.findAll();
    }

    @Override
    public List<Student> getStudents(Long id) {
        Faculty faculty = facultyRepository.findById(id).get();
        return faculty.getStudents();
    }
}
