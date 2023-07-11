package pro.sky.java.course3.school.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.java.course3.school.model.Faculty;
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
    public Faculty addFaculty(@RequestParam String name, String color) {
        Faculty faculty = new Faculty(0L, name, color);
        return facultyService.addFaculty(faculty);
    }

    @DeleteMapping("delete")
    public Faculty deleteStudent(@RequestParam Long id) {
        return facultyService.deleteFaculty(id);
    }

    @PutMapping("update")
    public Faculty updateStudent(@RequestBody Faculty faculty) {
        return facultyService.updateFaculty(faculty);
    }

    @GetMapping("get")
    public Faculty getStudent(@RequestParam Long id) {
        return facultyService.getFaculty(id);
    }

    @GetMapping("color/{color}")
    public List filterByAge(@PathVariable("color") String color) {
        return facultyService.filterByColor(color);
    }

}
