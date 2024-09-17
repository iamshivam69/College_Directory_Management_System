package com.example.CollegeDirectory.Controller;

import com.example.CollegeDirectory.Entities.AdministratorProfile;
import com.example.CollegeDirectory.Service.AdministratorProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdministratorProfileService administratorProfileService;

    @GetMapping("/profile/{userId}")
    public AdministratorProfile getProfile(@PathVariable Long userId) {
        return administratorProfileService.getAdministratorProfile(userId).orElseThrow();
    }

    // Other endpoints like managing users, courses, etc.
}

