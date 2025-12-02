package com.emmjay.hotel.HotelService.exception;

//import com.emmjay.user.service.exception.ResourceNotFoundException;

public class ResourceNotFoundExceptions extends RuntimeException {
    public ResourceNotFoundExceptions(String s) {
        super(s);
    }
    public ResourceNotFoundExceptions() {
        super("Resource Not Found Exception");
    }
}
