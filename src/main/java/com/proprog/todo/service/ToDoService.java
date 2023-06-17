package com.proprog.todo.service;

import com.proprog.todo.model.ToDo;
import com.proprog.todo.model.ToDoList;

public interface ToDoService {
    ToDo create(ToDo toDo);

    ToDoList getAllTodos();

    ToDo findById(Long id);

    void deleteTodo(Long id);

}
