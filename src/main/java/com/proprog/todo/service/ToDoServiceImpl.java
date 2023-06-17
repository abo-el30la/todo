package com.proprog.todo.service;

import com.proprog.todo.exception.ToDoNotFoundException;
import com.proprog.todo.model.ToDo;
import com.proprog.todo.model.ToDoList;
import com.proprog.todo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoServiceImpl implements ToDoService {

    @Autowired
    ToDoRepository repository;


    @Override
    public ToDo create(ToDo toDo) {
        return repository.save(toDo);
    }

    @Override
    public ToDoList getAllTodos() {
        List<ToDo> toDoList = repository.findAll();
        return new ToDoList(toDoList);
    }

    @Override
    public ToDo findById(Long id) {
        Optional<ToDo> optionalToDo = repository.findById(id);
        if (optionalToDo.isEmpty()) {
            throw new ToDoNotFoundException("there is no todo with this id " + id);
        }
        return optionalToDo.get();
    }

    @Override
    public void deleteTodo(Long id) {
        repository.deleteById(id);
    }

}
