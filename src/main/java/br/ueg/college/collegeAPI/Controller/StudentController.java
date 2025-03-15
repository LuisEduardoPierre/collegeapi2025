package br.ueg.college.collegeAPI.Controller;


import br.ueg.college.collegeAPI.Model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @GetMapping("/getall")
    public List<Student> getAllStudents() {
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
}
