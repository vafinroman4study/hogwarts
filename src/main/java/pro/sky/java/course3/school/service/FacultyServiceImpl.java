package pro.sky.java.course3.school.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course3.school.model.Faculty;
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
        return facultyRepository.findByColor(color);
    }

    @Override
    public List<Faculty> getAllFaculties() {
        return facultyRepository.findAll();
    }
}
