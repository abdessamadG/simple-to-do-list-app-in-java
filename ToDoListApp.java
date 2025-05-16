/*
 * Simple To-Do List Application in Java
 *
 * This program provides a basic to-do list functionality, including:
 * - Adding tasks
 * - Removing tasks by their number
 * - Viewing all current tasks
 * - Exiting the program
 *
 * It uses an ArrayList to store tasks and a Scanner for user input, offering a simple text-based menu system.
 *
 * Future improvements could include saving tasks to a file, adding task priorities, and implementing due dates.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added successfully.");
                }
                case 2 -> {
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to remove.");
                    } else {
                        System.out.println("Enter the task number to remove: ");
                        int taskNumber = scanner.nextInt();
                        scanner.nextLine();
                        if (taskNumber > 0 && taskNumber <= tasks.size()) {
                            tasks.remove(taskNumber - 1);
                            System.out.println("Task removed successfully.");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                }
                case 3 -> {
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}