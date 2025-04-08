package com.sci.demo.controllers;

import com.sci.demo.models.Student;
import com.sci.demo.services.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

  private final StudentService studentService;

  @Autowired
  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping
  public List<Student> getStudents() {
    return studentService.getStudents();
  }

  @GetMapping("/{id}")
  public Student getStudent(@PathVariable int id) {
    return studentService.getStudent(id);
  }

  @PostMapping
  public void addStudent(@RequestBody Student student) {
    studentService.addStudent(student);
  }

  @PatchMapping("/{id}/name/{name}")
  public void updateStudent(@PathVariable int id, @PathVariable String name) {
    studentService.updateStudent(id, name);
  }

  @PutMapping("/{id}")
  public void updateStudent(@PathVariable int id, @RequestBody Student stdRequest) {
    studentService.updateStudent(id, stdRequest);
  }

  @DeleteMapping("/{id}")
  public void deleteStudent(@PathVariable int id) {
    studentService.deleteStudent(id);
  }
}
