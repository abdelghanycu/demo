package com.sci.demo.services;

import com.sci.demo.dto.StudentCreateRequest;
import com.sci.demo.models.Student;
import com.sci.demo.repo.StudentRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class StudentService {

  private final StudentRepo studentRepo;

  @Autowired
  public StudentService(StudentRepo studentRepo) {
    this.studentRepo = studentRepo;
  }

  public List<Student> getStudents() {
    return studentRepo.findAll();
  }

  public Student getStudent(int id) {
    return studentRepo.findById(id).orElse(null);
  }

  public Object addStudent(StudentCreateRequest request) {
    if (request.getName().equals("mohsen")) {
      throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Name cannot be mohsen");
    }
    Student student = studentRepo.save(new Student(null, request.getName(), request.getAge()));
    return student;
  }

  public void updateStudent(int id, String name) {
    Student foundStudent = getStudent(id);
    if (foundStudent != null) {
      foundStudent.setName(name);
      studentRepo.save(foundStudent);
    }
  }

  public void updateStudent(int id, Student stdRequest) {
    Student foundStudent = getStudent(id);
    if (foundStudent != null) {
      foundStudent.setName(stdRequest.getName());
      foundStudent.setAge(stdRequest.getAge());
      studentRepo.save(foundStudent);
    }
  }

  public void deleteStudent(int id) {
    studentRepo.deleteById(id);
  }

  public List<Student> getStudentByName(String name) {
    return studentRepo.findByName(name);
  }
}
