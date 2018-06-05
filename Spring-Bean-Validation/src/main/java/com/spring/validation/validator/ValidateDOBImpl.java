package com.spring.validation.validator;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidateDOBImpl implements ConstraintValidator<ValidateDOB, Date> {

	@Override
	public boolean isValid(Date date, ConstraintValidatorContext context) {
		// java.sal.date - yyyy/mm/dd 
		// localDate - yyyy/mm/dd 
		LocalDate birthDate = date.toLocalDate();
		//return birthDate.isBefore(LocalDate.parse("1995-01-01"));
		int year = Period.between(birthDate, LocalDate.now()).getYears();
		if(year>=18) return true;
		return false;
	}

}
