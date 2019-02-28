package controller;

import com.google.gson.Gson;
import model.TodoItem;
import model.TodoList;

import java.io.*;
import java.util.HashSet;
import java.util.Set;


public class Persistence {

    private static final String fileName = "todoList.json";
    private static final Gson gson = new Gson();

    public static String generateJsonFromTodoList(TodoList todoList) {
        return gson.toJson(todoList);
    }

    public static void write(String json) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(json);
            writer.close();
        } catch (IOException ignored) {
        }
    }

    public static String read()  {
        String json = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            json = reader.readLine();
            reader.close();
            return json;
        } catch (IOException ignored) {
        }
        return json;
    }

    public static TodoList generateTodoListFromJson(String readJson) {
        return gson.fromJson(readJson, TodoList.class);
    }
}
