package model;

import java.util.HashSet;
import java.util.Set;

public class TodoList {

    private Set<TodoItem> todoItems;
    private String todoListName;

    public TodoList(String todoListName) {
        todoItems = new HashSet<>();
        this.todoListName = todoListName;
    }

    public Set<TodoItem> getTodoItems() {
        return todoItems;
    }

    public String getTodoListName() {
        return todoListName;
    }

    public void setTodoListName(String todoListName) {
        this.todoListName = todoListName;
    }

    public void addTodoItem(TodoItem todoItem) {
        this.todoItems.add(todoItem);
    }

    public void removeTodoItem(TodoItem todoItem) {
        this.todoItems.remove(todoItem);
    }
}
