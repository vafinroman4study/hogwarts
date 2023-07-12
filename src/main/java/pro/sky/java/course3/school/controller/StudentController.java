package pro.sky.java.course3.school.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.java.course3.school.model.Student;
import pro.sky.java.course3.school.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("add")
    public Student addStudent(@RequestBody Student student) {
        //Student student = new Student(0L, name, age);
        return studentService.addStudent(student);
    }

    @DeleteMapping("delete")
    public ResponseEntity<Student> deleteStudent(@RequestParam Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @GetMapping("get")
    public Student getStudent(@RequestParam Long id) {
        return studentService.getStudent(id);
    }

    @GetMapping()
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("age/{age}")
    public List filterByAge(@PathVariable("age") int age) {
        return studentService.filterByAge(age);
    }
    @GetMapping("age/")
    public List filterByAgeBetween(@RequestParam int min, int max) {
        return studentService.filterByAgeBetween(min, max);
    }
    @GetMapping("faculty/{id}")
    public String filterByAgeBetween(@PathVariable("id") Long id) {
        return studentService.getFacultyName(id);
    }
}
