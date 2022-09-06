package ch.mutlumelik.todolist.todolist.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("/todolist")
public class ToDoListController {

    @GetMapping("/")
    public ResponseEntity getToDoList(){
        return ResponseEntity.ok(Arrays.asList("List"));
    }

}
