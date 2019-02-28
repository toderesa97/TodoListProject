package model;

import java.util.Objects;

public class TodoItem {

    private static int id = 0;
    private boolean done;
    private int internalId;
    private String description;

    public TodoItem(boolean done, String description) {
        this.done = done;
        internalId = id++;
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public int getInternalId() {
        return internalId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return this.internalId == todoItem.getInternalId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "done=" + done +
                ", internalId=" + internalId +
                ", description='" + description + '\'' +
                '}';
    }
}

