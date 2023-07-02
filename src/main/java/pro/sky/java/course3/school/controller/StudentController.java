package pro.sky.java.course3.school.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.java.course3.school.model.Student;
import pro.sky.java.course3.school.service.StudentService;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("add")
    public Student addStudent(@RequestParam String name, int age) {
        Student student = new Student(0L, name, age);
        return studentService.addStudent(student);
    }

    @DeleteMapping("delete")
    public Student deleteStudent(@RequestParam Long id) {
        return studentService.deleteStudent(id);
    }

    @PutMapping("update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @GetMapping("get")
    public Student getStudent(@RequestParam Long id) {
        return studentService.getStudent(id);
    }

    @GetMapping("age/{age}")
    public List filterByAge(@PathVariable("age") int age) {
        return studentService.filterByAge(age);
    }
}
