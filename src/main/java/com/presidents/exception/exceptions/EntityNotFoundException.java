package com.presidents.exception.exceptions;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String message) {
        super(message);
    }

    public class EntityNotFoundExceptionByName extends RuntimeException {
        public EntityNotFoundExceptionByName(String message1) {
            super(message1);
        }

    }
}
