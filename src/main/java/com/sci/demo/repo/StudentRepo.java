package com.sci.demo.repo;

import com.sci.demo.models.Student;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student, Serializable> {

  List<Student> findByName(String name);
  List<Student> findByAge(int age);
  List<Student> findByNameAndAge(String name, int age);
  List<Student> findByAgeGreaterThan(int age);

  List<Student> findAll();
}
