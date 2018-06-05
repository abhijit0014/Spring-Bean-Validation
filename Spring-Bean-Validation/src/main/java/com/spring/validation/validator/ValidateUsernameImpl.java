package com.spring.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidateUsernameImpl implements ConstraintValidator<ValidateUsername, String> {

	@Override
	public boolean isValid(String username, ConstraintValidatorContext context) {
		// RULE-----------------
		// Length >=3
		// Valid characters: a-z, A-Z, 0-9, points, dashes and underscores.
        String upperCaseChars = "^[a-zA-Z0-9._-]{3,}$";
        if (username.matches(upperCaseChars )) 
        	return true;		
		return false;
	}

}
