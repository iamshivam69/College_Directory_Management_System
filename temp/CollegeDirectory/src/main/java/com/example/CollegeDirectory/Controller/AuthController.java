package com.example.CollegeDirectory.Controller;

import com.example.CollegeDirectory.Entities.User;
import com.example.CollegeDirectory.Service.UserService;
import com.example.CollegeDirectory.Enums.Role; // Import the Role enum
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        if (userService.validateCredentials(username, password)) {
            User user = userService.findByUsername(username).orElse(null);
            if (user != null) {
                switch (user.getRole()) {
                    case STUDENT:
                        return "redirect:/student/dashboard";
                    case FACULTY_MEMBER:
                        return "redirect:/faculty/dashboard";
                    case ADMINISTRATOR:
                        return "redirect:/admin/dashboard";
                    default:
                        return "error";
                }
            } else {
                return "User not found";
            }
        } else {
            return "Invalid credentials";
        }
    }
}
