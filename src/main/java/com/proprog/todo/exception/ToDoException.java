package com.proprog.todo.exception;

public class ToDoException {

    public int statusCode;
    public String message;

    public Throwable throwable;

    public ToDoException(int statusCode, String message, Throwable throwable) {
        this.statusCode = statusCode;
        this.message = message;
        this.throwable = throwable;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }
}
