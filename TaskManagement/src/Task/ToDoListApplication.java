package Task;
import java.util.ArrayList;
import java.util.List;

public class ToDoListApplication {
    private List<String> tasks;

    public ToDoListApplication() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void updateTask(int index, String newDescription) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, newDescription);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        ToDoListApplication todo = new ToDoListApplication();
        todo.addTask("Buy groceries");
        todo.addTask("Clean the house");
        todo.displayTasks();
        todo.updateTask(0, "Buy groceries and snacks");
        todo.removeTask(1);
        todo.displayTasks();
    }
}
