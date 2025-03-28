package br.ueg.college.collegeAPI.Controller;


import br.ueg.college.collegeAPI.Model.Student;
import br.ueg.college.collegeAPI.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getall")
    public List<Student> getAllStudents() {
        return studentService.listAll();
    }
}
