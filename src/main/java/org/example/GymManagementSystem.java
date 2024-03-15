package org.example;

import java.util.Scanner;

public class GymManagementSystem {
    public static void main(String[] args) {
        GymManager manager = new GymManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Add member");
            System.out.println("2. Remove member");
            System.out.println("3. Add Staff");
            System.out.println("4. Remove Staff");
            System.out.println("5. Shcedule Activity");
            System.out.println("6. Generate Bill");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    //add member logic
                    break;
                case 2:
                    //remove member logic
                    break;
                case 3:
                    //add staff logic
                    break;
                case 4:
                    //remove staff logic
                    break;
                case 5:
                    //schedule activity logic
                    break;
                case 6:
                    //Generate Bill logic
                    break;
                case 7:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");

            }
        }
        scanner.close();
    }
}
