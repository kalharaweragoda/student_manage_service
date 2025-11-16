package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    final StudentService service;

    //http://localhost:8080/student/add
    @PostMapping("/add")
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
        //System.out.println(student);
    }
}
