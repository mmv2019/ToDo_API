package com.example.api.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {
    @Autowired
 private ToDoRepository toDoRepository;




    public ToDoModel getDataById(String id) {
       return toDoRepository.findById(id).get();
    }

    public ToDoModel save(ToDoModel todo) {
        return toDoRepository.insert(todo);
    }

    public void delete(String id)
    {
      toDoRepository.deleteById(id);
    }
}
