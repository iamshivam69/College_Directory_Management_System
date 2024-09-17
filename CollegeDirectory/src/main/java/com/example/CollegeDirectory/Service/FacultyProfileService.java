package com.example.CollegeDirectory.Service;

import com.example.CollegeDirectory.Entities.FacultyProfile;
import com.example.CollegeDirectory.Repository.FacultyProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FacultyProfileService {

    @Autowired
    private FacultyProfileRepository facultyProfileRepository;

    public Optional<FacultyProfile> getFacultyProfile(Long userId) {
        return facultyProfileRepository.findById(userId);
    }

    public FacultyProfile saveFacultyProfile(FacultyProfile facultyProfile) {
        return facultyProfileRepository.save(facultyProfile);
    }
}
