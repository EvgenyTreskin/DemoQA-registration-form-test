package junit;

import org.junit.jupiter.api.*;

public class RegistrationFormTest {
    @BeforeAll
    static void beforeAll() {
        
    }

    @BeforeEach
    void beforeEach() {
    }

    @AfterAll
    static void afterAll() {

    }

    @Test
    void firstTest() {
        Assertions.assertTrue(3 > 2);
    }
}
