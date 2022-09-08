package ch.mutlumelik.todolist.todolist.model;

import java.util.Arrays;
import java.util.List;

public class ToDoList {
    private int id;
    private String toDoList;

    public ToDoList() {
    }

    public ToDoList(int id, String toDoList) {
        this.id = id;
        this.toDoList = toDoList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToDoList() {
        return toDoList;
    }

    public void setToDoList(String toDoList) {
        this.toDoList = toDoList;
    }

}
