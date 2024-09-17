package com.example.CollegeDirectory.Service;


import com.example.CollegeDirectory.Entities.StudentProfile;
import com.example.CollegeDirectory.Repository.StudentProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentProfileService {

    @Autowired
    private StudentProfileRepository studentProfileRepository;

    public Optional<StudentProfile> getStudentProfile(Long userId) {
        return studentProfileRepository.findById(userId);
    }

    public StudentProfile saveStudentProfile(StudentProfile studentProfile) {
        return studentProfileRepository.save(studentProfile);
    }
}