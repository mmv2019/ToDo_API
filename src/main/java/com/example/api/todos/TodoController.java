package com.example.api.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/todos/")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

//    @GetMapping(value = {"","/"})
//    public List<ToDoModel> Lists(){
//        return todoService.getData();
//    }

//    @GetMapping(value = {"/list"})
//    public List<ToDoModel> listTodos() {
//    return todoService.getData();
//    }

//    @GetMapping(value = "/{Id}")
//    public ToDoModel getById(@PathVariable int Id )
//    {
//        return todoService.getDataById(Id);
//    }

    @PostMapping(value = {"","/"})
    public ToDoModel createNewTodo(@RequestBody ToDoModel toDoModel)
    {
        return todoService.save(toDoModel);
    }

    @DeleteMapping(value = {"/{id}"})
    public void deleteTodo(@PathVariable String id)
    {
        todoService.delete(id);
    }

}
