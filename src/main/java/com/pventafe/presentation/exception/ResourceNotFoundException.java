package com.pventafe.presentation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    private static final long serieVersionID = 1l;

    public ResourceNotFoundException(String mensaje) {
        super(mensaje);
    }

}
