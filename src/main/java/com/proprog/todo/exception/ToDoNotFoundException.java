package com.proprog.todo.exception;

public class ToDoNotFoundException extends RuntimeException {

    public ToDoNotFoundException(String message) {
        super(message);
    }

    public ToDoNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
