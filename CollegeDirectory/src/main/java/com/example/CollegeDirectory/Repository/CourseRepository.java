package com.example.CollegeDirectory.Repository;

import com.example.CollegeDirectory.Entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}

