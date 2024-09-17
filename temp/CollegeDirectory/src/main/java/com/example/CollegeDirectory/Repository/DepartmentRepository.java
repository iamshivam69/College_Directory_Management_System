package com.example.CollegeDirectory.Repository;

import com.example.CollegeDirectory.Entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    List<Department> findByName(String name);
}