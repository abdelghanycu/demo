package com.sci.demo.validate;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NumberNotDivisibleByFiveValidator.class)
public @interface NumberNotDivisibleByFiveConstraint {

  String message() default "Invalid age number";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
