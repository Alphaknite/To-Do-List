import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks;

    // Constructor
    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the to-do list.");
        } 
        else {
            System.out.println("To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                System.out.println((i + 1) + ". " + task.getTaskName() +
                                   " (Due: " + task.getDueDate() +
                                   ", Completed: " + task.isCompleted() + ")");
            }
        }
    }
}
