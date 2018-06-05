package com.spring.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidateNameImpl implements ConstraintValidator<ValidateName, String> {

	@Override
	public boolean isValid(String name, ConstraintValidatorContext context) {
		// RULE-----------------
		// Length >=3
		// Valid characters: a-z, A-Z
        String upperCaseChars = "^[a-zA-Z]{3,}$";
        if (name.matches(upperCaseChars )) 
        	return true;		
		return false;
	}

}
