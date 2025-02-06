package com.enviro.assessment.grad001.lehlonolomokoena.waste_sorting_api.exception;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.validation.MethodArgumentNotValidException;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
 // Handle validation errors (DTO and entity validation)
 @ExceptionHandler(MethodArgumentNotValidException.class)
 @ResponseStatus(HttpStatus.BAD_REQUEST)
 public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
     Map<String, String> errors = new HashMap<>();
     ex.getBindingResult().getFieldErrors().forEach(error -> 
         errors.put(error.getField(), error.getDefaultMessage()));
     return ResponseEntity.badRequest().body(errors);
 }

 // Handle constraint violations (e.g., @NotNull, @Size)
 @ExceptionHandler(ConstraintViolationException.class)
 @ResponseStatus(HttpStatus.BAD_REQUEST)
 public ResponseEntity<Map<String, String>> handleConstraintViolation(ConstraintViolationException ex) {
     Map<String, String> errors = new HashMap<>();
     ex.getConstraintViolations().forEach(error ->
         errors.put(error.getPropertyPath().toString(), error.getMessage()));
     return ResponseEntity.badRequest().body(errors);
 }

 // Handle invalid URL path variable or request parameter type mismatches
 @ExceptionHandler(MethodArgumentTypeMismatchException.class)
 @ResponseStatus(HttpStatus.BAD_REQUEST)
 public ResponseEntity<String> handleTypeMismatch(MethodArgumentTypeMismatchException ex) {
     String errorMessage = "Invalid value: '" + ex.getValue() + "' for parameter '" + ex.getName() + "'. Expected type: " + ex.getRequiredType().getSimpleName();
     return ResponseEntity.badRequest().body(errorMessage);
 }

 // Handle generic exceptions
 @ExceptionHandler(Exception.class)
 @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
 public ResponseEntity<String> handleGeneralExceptions(Exception ex) {
     return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + ex.getMessage());
 }
}
