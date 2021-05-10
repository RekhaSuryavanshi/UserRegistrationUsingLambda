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
}



