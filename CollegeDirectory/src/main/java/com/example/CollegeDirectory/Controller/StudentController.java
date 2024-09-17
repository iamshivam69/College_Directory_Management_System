package com.example.CollegeDirectory.Controller;

import com.example.CollegeDirectory.Entities.StudentProfile;
import com.example.CollegeDirectory.Service.StudentProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentProfileService studentProfileService;

    @GetMapping("/profile/{userId}")
    public StudentProfile getProfile(@PathVariable Long userId) {
        return studentProfileService.getStudentProfile(userId).orElseThrow();
    }

    // Other endpoints like viewing enrolled courses, etc.
}