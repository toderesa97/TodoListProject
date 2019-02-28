import controller.Persistence;
import model.TodoItem;
import model.TodoList;

public class Main {

    public static void main(String[] args) {
        TodoItem walkDog = new TodoItem(false, "Walk the fucking dog");
        TodoItem buyFlowers = new TodoItem(false, "Buy flowers for SVs day");
        TodoItem visitDoctor = new TodoItem(false, "Visit the doctor for back pain");

        TodoList todoList = new TodoList("EduardosTodoList");
        todoList.addTodoItem(walkDog);
        todoList.addTodoItem(buyFlowers);
        todoList.addTodoItem(visitDoctor);
        todoList.addTodoItem(visitDoctor);
        String json = Persistence.generateJsonFromTodoList(todoList);

        Persistence.write(json);

        String readJson = Persistence.read();
        System.out.println(readJson);

        TodoList todoListFromJson = Persistence.generateTodoListFromJson(readJson);
    }

}
