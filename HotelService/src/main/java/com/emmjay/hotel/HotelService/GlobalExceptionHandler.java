package com.emmjay.hotel.HotelService;

import com.emmjay.hotel.HotelService.exception.ResourceNotFoundExceptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundExceptions.class)
    public ResponseEntity<Map<String, Object>> handleResourceNotFound(ResourceNotFoundExceptions ex) {

        Map<String, Object> response = new HashMap<>();
        response.put("message", ex.getMessage());
        response.put("success", false);
        response.put("status", HttpStatus.NOT_FOUND.value());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
}