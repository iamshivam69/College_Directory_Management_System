package com.example.CollegeDirectory.Service;

import com.example.CollegeDirectory.Entities.AdministratorProfile;
import com.example.CollegeDirectory.Repository.AdministratorProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdministratorProfileService {

    @Autowired
    private AdministratorProfileRepository administratorProfileRepository;

    public Optional<AdministratorProfile> getAdministratorProfile(Long userId) {
        return administratorProfileRepository.findById(userId);
    }

    public AdministratorProfile saveAdministratorProfile(AdministratorProfile administratorProfile) {
        return administratorProfileRepository.save(administratorProfile);
    }
}