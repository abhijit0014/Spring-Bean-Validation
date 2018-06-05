package com.spring.validation.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = {ValidateUsernameImpl.class})
@Target({FIELD})
@Retention(RUNTIME)
public @interface ValidateUsername {
    String message();
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
