package pro.sky.java.course3.school.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course3.school.model.Faculty;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FacultyServiceImpl implements FacultyService{
    private HashMap<Long, Faculty> faculties = new HashMap();
    private long facultyId = 0;

    @Override
    public Faculty addFaculty(Faculty faculty) {
        facultyId++;
        faculty.setId(facultyId);
        return faculties.put(facultyId, faculty);
    }

    @Override
    public Faculty getFaculty(Long id) {
        return faculties.get(id);
    }
    @Override
    public Faculty deleteFaculty(Long id) {
        return faculties.remove(id);
    }
    @Override
    public Faculty updateFaculty(Faculty faculty) {
        return faculties.put(faculty.getId(), faculty);
    }

    @Override
    public List filterByColor(String color) {
        return faculties.values().stream()
                .filter(e->color.equals(e.getColor()))
                .collect(Collectors.toList());
    }
}
