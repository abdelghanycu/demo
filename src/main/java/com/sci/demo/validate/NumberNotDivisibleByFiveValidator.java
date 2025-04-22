package com.sci.demo.validate;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NumberNotDivisibleByFiveValidator implements ConstraintValidator<NumberNotDivisibleByFiveConstraint, Integer> {

  @Override
  public void initialize(NumberNotDivisibleByFiveConstraint contactNumber) {
  }

  @Override
  public boolean isValid(Integer age, ConstraintValidatorContext cxt) {
    return age % 5 != 0;
  }
}