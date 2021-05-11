package com.lambda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationLambdaTest {

    @Test
    public void givenFirstname_whenNotProper_shouldThrowException() {
        UserRegistrationMain userRegistration = new UserRegistrationMain();
        try {
            boolean result=userRegistration.checkFirstName("Re1");
            Assertions.assertFalse(result);

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

    @Test
    public void givenEmail_whenNotProper_shouldThrowException() {
        UserRegistrationMain userRegistration = new UserRegistrationMain();
        try {
            boolean result=userRegistration.checkEmailId("Re");
            Assertions.assertFalse(result);

        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_whenProper_shouldReturnValid() throws UserRegistrationException {
        UserRegistrationMain userRegistration = new UserRegistrationMain();
        boolean result = userRegistration.checkEmailId("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPhoneNo_whenNotProper_shouldThrowException() {
        UserRegistrationMain userRegistration = new UserRegistrationMain();
        try {
            boolean result=userRegistration.checkPhoneNo("9121");
            Assertions.assertFalse(result);

        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPhoneNo_whenProper_shouldReturnValid() throws UserRegistrationException {
        UserRegistrationMain userRegistration = new UserRegistrationMain();
        boolean result = userRegistration.checkPhoneNo("91 9741697121");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_whenNotProper_shouldThrowException() {
        UserRegistrationMain userRegistration = new UserRegistrationMain();
        try {
            boolean result=userRegistration.checkPassword("1234");
            Assertions.assertFalse(result);

        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassword_whenProper_shouldReturnValid() throws UserRegistrationException {
        UserRegistrationMain userRegistration = new UserRegistrationMain();
        boolean result = userRegistration.checkPassword("Abcd@1234");
        Assertions.assertTrue(result);
    }
}
