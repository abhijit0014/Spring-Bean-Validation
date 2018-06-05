package com.spring.validation;

import javax.validation.Validator;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
public class config {
	
	@Bean(name="messageSource")
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}	
	
	@Bean
	public Validator validator(MessageSource messageSource) {
	    LocalValidatorFactoryBean factory = new LocalValidatorFactoryBean();
	    factory.setValidationMessageSource(messageSource);
	    return factory;
	}

}

