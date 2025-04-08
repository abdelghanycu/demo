package com.sci.demo.services;

import com.sci.demo.models.Student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

  private List<Student> students = new ArrayList<>();

  public List<Student> getStudents() {
    return students;
  }

  public Student getStudent( int id) {
    for (Student student : students) {
      if (student.getId() == id) {
        return student;
      }
    }
    return null;
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void updateStudent( int id, String name) {
    Student foundStudent = null;
    for (Student s : students) {
      if (s.getId() == id) {
        foundStudent = s;
      }
    }
    if (foundStudent != null) {
      foundStudent.setName(name);
    }
  }

  public void updateStudent( int id,  Student stdRequest) {
    Student foundStudent = null;
    for (Student s : students) {
      if (s.getId() == id) {
        foundStudent = s;
      }
    }
    if (foundStudent != null) {
      foundStudent.setName(stdRequest.getName());
      foundStudent.setAge(stdRequest.getAge());
    }
  }

  public void deleteStudent(int id) {
    for (Student s : students) {
      if (s.getId() == id) {
        students.remove(s);
      }
    }
  }
}
