package com.basicspringapp.controller;


import com.basicspringapp.pojo.StudentDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/springproject/v1")
public class BasicSpringApp {

    @GetMapping("/retrievedetails")
    public StudentDetails getStudentDetails() {
        StudentDetails studentDetails = new StudentDetails();
        studentDetails.getId();
        studentDetails.getName();
        studentDetails.getCollegename();
        studentDetails.getDepartmentname();
        return studentDetails;
    }
}
