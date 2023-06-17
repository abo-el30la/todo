package com.proprog.todo.controller;

import com.proprog.todo.model.ToDo;
import com.proprog.todo.model.ToDoList;
import com.proprog.todo.service.ToDoService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/todo/")
public class ToDoController {

    @Autowired
    ToDoService toDoService;


    @PostMapping("create")
    public ToDo create(@NotNull @RequestBody ToDo toDo) {
        return toDoService.create(toDo);
    }

    @GetMapping("todoList")
    public ToDoList findAllTodos() {
        return toDoService.getAllTodos();
    }

    @GetMapping("{id}")
    public ToDo findById(@PathVariable Long id) {
        return toDoService.findById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        toDoService.deleteTodo(id);
    }

}
