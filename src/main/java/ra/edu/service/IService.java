package ra.edu.service;

import ra.edu.entity.Student;

import java.util.List;

public interface IService { // JPA

    List<Student> findAll();
}
