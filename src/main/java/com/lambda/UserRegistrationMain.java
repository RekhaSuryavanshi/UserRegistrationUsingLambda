package com.lambda;

import java.util.regex.Pattern;

public class UserRegistrationMain {

    @FunctionalInterface
    public interface lambdaFunction {
        boolean matches(String pattern, String input);
    }

    lambdaFunction inputMatch = ((pattern, input) -> Pattern.compile(pattern).matcher(input).matches());
    private static final String first_Name_Pattern = "(^[A-Z]{1}[a-z]{2,}$)";
    private static final String email_Pattern="^[a-zA-Z0-9+.-]*+[a-zA-Z0-9+]*@[a-zA-Z0-9+.,]*+$";
    private static final String phoneNo_Pattern="^[0-9]{2} [0-9]{10}$";
    private static final String password_Pattern="^(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#$%^&*()_+]).{8,}";

    public boolean checkFirstName(String fname) throws UserRegistrationException {
        boolean result = inputMatch.matches(first_Name_Pattern, fname);
        if (result) {
            System.out.println(fname + " is valid firstname");
            return true;
        }
        else {
            throw new UserRegistrationException("please enter valid proper input");
        }
    }

    public boolean checkEmailId(String email) throws UserRegistrationException {
        boolean result = inputMatch.matches(email_Pattern, email);
        if (result) {
            System.out.println(email + " is valid email");
            return  true ;
        }
        else {
            throw new UserRegistrationException("please enter valid proper input");
        }
    }

    public boolean checkPhoneNo(String phno) throws UserRegistrationException {
        boolean result = inputMatch.matches(phoneNo_Pattern, phno);
        if (result) {
            System.out.println(phno + " is valid PhoneNo");
            return  true ;
        }
        else {
            throw new UserRegistrationException("please enter valid proper input");
        }
    }

    public boolean checkPassword(String password) throws UserRegistrationException {
        boolean result = inputMatch.matches(password_Pattern, password);
        if (result) {
            System.out.println(password + " is valid password");
            return  true ;
        }
        else {
            throw new UserRegistrationException("please enter valid proper input");
        }
    }
}



