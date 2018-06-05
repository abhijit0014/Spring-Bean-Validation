package com.spring.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidatePhoneNumberImpl implements ConstraintValidator<ValidatePhoneNumber, String> {

	@Override
	public boolean isValid(String phoneNumber, ConstraintValidatorContext context) {
		
		//matches numbers only
		String regexStr = "^[0-9]*$";
		return phoneNumber.length()>= 10 &&
				phoneNumber.length()<= 12 &&
				phoneNumber.matches(regexStr);
	}

}
