package ch.mutlumelik.todolist.todolist.service;

import ch.mutlumelik.todolist.todolist.model.ToDoList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoListService {

    private List<ToDoList> toDoLists = new ArrayList<>();
    public List<ToDoList> findAll() {
        return toDoLists;
    }
    public ToDoList add(ToDoList toDoList) {
        return toDoList;
    }

    public void delete(int id) {
    }
}
