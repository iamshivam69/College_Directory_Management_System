import com.example.CollegeDirectory.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testValidateCredentials() {
        boolean isValid = userService.validateCredentials("testUser", "testPassword");
        assertTrue(isValid);
    }
}