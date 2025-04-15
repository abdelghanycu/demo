package com.sci.demo.error;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

@ControllerAdvice
public class ApiExceptionHandler {

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<?> getMethodArgumentNotValidException(
      final MethodArgumentNotValidException ex) {
    List<String> errorsList = new ArrayList<>();
    for (ObjectError error : ex.getBindingResult().getAllErrors()) {
      errorsList.add(error.getDefaultMessage());
    }
    return new ResponseEntity<>(errorsList, HttpStatus.CONFLICT);
  }

  @ExceptionHandler(ResponseStatusException.class)
  public ResponseEntity<?> getResponseStatusException(final ResponseStatusException ex) {
    System.err.println("here");
    return new ResponseEntity<>(ex.getReason(), ex.getStatusCode());
  }
}
