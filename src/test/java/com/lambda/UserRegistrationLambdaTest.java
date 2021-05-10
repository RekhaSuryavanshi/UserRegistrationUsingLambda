package com.lambda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationLambdaTest {

    @Test
    public void givenFirstname_whenNotProper_shouldThrowException() {
        UserRegistrationMain userRegistration = new UserRegistrationMain();
        try {
            boolean result=userRegistration.checkFirstName("Re");
            Assertions.assertTrue(result);

        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenFirstname_whenProper_shouldReturnValid() throws UserRegistrationException {
        UserRegistrationMain userRegistration = new UserRegistrationMain();
         boolean result = userRegistration.checkFirstName("Rekha");
         Assertions.assertTrue(result);
    }
}
