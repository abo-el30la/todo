package com.proprog.todo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ToDoExceptionHandler {

    @ExceptionHandler(value = {ToDoNotFoundException.class})
    public ResponseEntity<Object> handleToDoException(ToDoNotFoundException notFoundException) {

        ToDoException exception = new ToDoException(
                HttpStatus.NOT_FOUND.value(),
                notFoundException.getMessage(),
                notFoundException.getCause()
        );
        return new ResponseEntity<>(exception, HttpStatus.NOT_FOUND);
    }

}
