package br.ueg.college.collegeAPI.Service.impl;

import br.ueg.college.collegeAPI.Model.Student;
import br.ueg.college.collegeAPI.Service.StudentService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> listAll() {
        Student student = new Student();
        student.setId(1L);
        student.setName("John");
        student.setRegisterNumber("123");
        student.setRegisterDate(LocalDate.now().toString());
        student.setCourse("Java");

        Student student2 = Student.builder()
                .id(2L)
                .name("Jane")
                .registerNumber("456")
                .registerDate(LocalDate.now().toString())
                .course("Java")
                .build();

        List<Student> students = Arrays.asList(student, student2);

        return students;
    }

    @Override
    public Student create(Student student) {
        return null;
    }

    @Override
    public Student getById(int id) {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Student update(Student student) {
        return null;
    }
}
