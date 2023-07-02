package pro.sky.java.course3.school.service;

import pro.sky.java.course3.school.model.Faculty;

import java.util.List;

public interface FacultyService {
    public Faculty addFaculty(Faculty faculty);

    Faculty getFaculty(Long id);

    Faculty deleteFaculty(Long id);

    Faculty updateFaculty(Faculty faculty);

    List filterByColor(String color);
}
