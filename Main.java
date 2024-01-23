import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	ToDoList toDoList = new ToDoList();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display To-Do List");
            System.out.println("2. Add Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                	toDoList.displayTasks();
                    break;
                    
                case 2:
                    scanner.nextLine(); 
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    System.out.print("Enter due date (yyyy-mm-dd): ");
                    String dueDate = scanner.nextLine();
                    Task newTask = new Task(taskName, dueDate, false);
                    toDoList.addTask(newTask);
                    break;
                    
                case 3:
                    System.out.print("Enter the index of the task to mark as completed: ");
                    int index = scanner.nextInt();
                    toDoList.markTaskAsCompleted(index - 1);
                    break;
                    
                case 4:
                	System.out.println("Exiting program. Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);
    }
}
