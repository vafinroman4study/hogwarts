package pro.sky.java.course3.school.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.java.course3.school.model.Faculty;
import pro.sky.java.course3.school.model.Student;
import pro.sky.java.course3.school.service.FacultyService;

import java.util.List;

@RestController
@RequestMapping("faculty")
public class FacultyController {
    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @PostMapping("add")
    public Faculty addFaculty(@RequestBody Faculty faculty) {
        //Faculty faculty = new Faculty(0L, name, color);
        return facultyService.addFaculty(faculty);
    }

    @DeleteMapping("delete")
    public ResponseEntity<Faculty> deleteFaculty(@RequestParam Long id) {
        facultyService.deleteFaculty(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("update")
    public Faculty updateFaculty(@RequestBody Faculty faculty) {
        return facultyService.updateFaculty(faculty);
    }

    @GetMapping("get")
    public Faculty getFaculty(@RequestParam Long id) {
        return facultyService.getFaculty(id);
    }
    @GetMapping()
    public List<Faculty> getAllFaculties() {
        return facultyService.getAllFaculties();
    }

    @GetMapping("color/{color}")
    public List filterByColor(@PathVariable("color") String color) {
        return facultyService.filterByColor(color);
    }

    @GetMapping("students/{id}")
    public List<Student> getStudents(@PathVariable("id") Long id) {
        return facultyService.getStudents(id);
    }
}
