package com.example.CollegeDirectory.Repository;

import com.example.CollegeDirectory.Entities.StudentProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long> {
}
