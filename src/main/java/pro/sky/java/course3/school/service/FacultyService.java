package pro.sky.java.course3.school.service;

import pro.sky.java.course3.school.model.Faculty;

import java.util.List;

public interface FacultyService {
    Faculty addFaculty(Faculty faculty);

    Faculty getFaculty(Long id);

    void deleteFaculty(Long id);

    Faculty updateFaculty(Faculty faculty);

    List filterByColor(String color);

    List<Faculty> getAllFaculties();
}
