package com.example.CollegeDirectory.Service;


import com.example.CollegeDirectory.Entities.Enrollment;
import com.example.CollegeDirectory.Repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public List<Enrollment> getEnrollmentsForStudent(Long studentId) {
        return enrollmentRepository.findByStudentId(studentId);
    }

    public Enrollment enrollStudentInCourse(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    public void removeEnrollment(Long enrollmentId) {
        enrollmentRepository.deleteById(enrollmentId);
    }
}
