package ch.mutlumelik.todolist.todolist.controller;

import ch.mutlumelik.todolist.todolist.model.ToDoList;
import ch.mutlumelik.todolist.todolist.service.ToDoListService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todolist/")
public class ToDoListController {

    ToDoListService toDoListService;

    public ToDoListController(ToDoListService toDoListService){
        this.toDoListService = toDoListService;
    }

    @GetMapping("list/")
    public ResponseEntity findAll(){
        List toDoList = toDoListService.findAll();
        return ResponseEntity.ok(toDoList);
    }
    @PostMapping("add/")
    public ResponseEntity add(@RequestBody ToDoList toDoList){
        toDoListService.add(toDoList);
        return ResponseEntity.ok().body("Created");

    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity delete(@PathVariable int id){
        toDoListService.delete(id);
        return ResponseEntity.ok().body("the object has been deleted");
    }
}
