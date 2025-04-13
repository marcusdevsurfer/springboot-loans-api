package com.markdev.springboot_loans_api.exceptions;

public class IlegalArgumentException extends RuntimeException {
    public IlegalArgumentException(String message) {
        super(message);
    }
}
