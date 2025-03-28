package br.ueg.college.collegeAPI.Service;

import br.ueg.college.collegeAPI.Model.Student;

import java.util.List;

public interface StudentService {

    List<Student> listAll();
    Student create (Student student);
    Student getById(int id);
    void deleteById(int id);
    Student update(Student student);
}
