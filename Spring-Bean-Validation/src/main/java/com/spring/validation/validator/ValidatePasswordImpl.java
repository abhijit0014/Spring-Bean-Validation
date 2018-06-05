package com.spring.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidatePasswordImpl implements ConstraintValidator<ValidatePassword, String> {

	@Override
	public boolean isValid(String password, ConstraintValidatorContext context) {
        
		// Password should be less than 15 and more than 8 characters in length.
        if (password.length() > 15 || password.length() < 8) return false;
        
        // System.out.println("Password Should not be same as user name");
        // if (password.indexOf(userName) > -1) return false;

        // Password should contain atleast one upper case alphabet
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars )) return false;

        // Password should contain atleast one lower case alphabet
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars ))  return false;

        // Password should contain atleast one number.
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers )) return false;
  
        // Password should contain atleast one special character
        String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
        if (!password.matches(specialChars )) return false;
  
        return true;
	}

}
