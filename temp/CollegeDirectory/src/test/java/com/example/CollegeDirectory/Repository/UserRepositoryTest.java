package com.example.CollegeDirectory.Repository;

import com.example.CollegeDirectory.Entities.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository UserRepository;

    @Test
    public void testFindByUsername() {
        User user = UserRepository.findByUsername("testUser").orElse(null);
        assertNotNull(user);
        assertEquals("testUser", user.getUsername());
    }
}
