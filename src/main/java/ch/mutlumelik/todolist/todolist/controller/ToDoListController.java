package ch.mutlumelik.todolist.todolist.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("/todolist/")
public class ToDoListController {

    @GetMapping("list/")
    public ResponseEntity getToDoList(){
        return ResponseEntity.ok(Arrays.asList("List"));
    }
    @PostMapping("add/")
    public ResponseEntity add(){
        return ResponseEntity.ok().body("The object has been created.");
    }
    @DeleteMapping("delete/")
    public ResponseEntity delete(){
        return ResponseEntity.ok().body("the object has been deleted");
    }
}
