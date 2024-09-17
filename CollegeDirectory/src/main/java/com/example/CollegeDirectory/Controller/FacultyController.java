package com.example.CollegeDirectory.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FacultyController {

    // Mapping for the faculty home page
    @GetMapping("/faculty")
    public String getFacultyHomePage(Model model) {
        // Add any data you need to pass to the view (if necessary)
        model.addAttribute("title", "Faculty Home");
        return "facultyHome";  // This should correspond to facultyHome.html
    }

    // Mapping for viewing faculty details
    @GetMapping("/faculty/details")
    public String getFacultyDetails(Model model) {
        // Logic to get faculty details can be added here
        model.addAttribute("title", "Faculty Details");
        return "facultyDetails";  // This should correspond to facultyDetails.html
    }

    // Mapping for managing courses
    @GetMapping("/faculty/manage-courses")
    public String manageFacultyCourses(Model model) {
        // Logic to manage faculty courses
        model.addAttribute("title", "Manage Courses");
        return "facultyManageCourses";  // This should correspond to facultyManageCourses.html
    }
}

