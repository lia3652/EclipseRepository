package ust.com.practice;

import java.util.Scanner;

public class DateInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a date in the format DD/MM/YYYY
        System.out.print("Enter a date (DD/MM/YYYY): ");
        String date = scanner.nextLine();

        // Split the input string by the '/' delimiter
        String[] parts = date.split("/");

        // Ensure there are exactly three parts (day, month, year)
        if (parts.length == 3) {
            String day = parts[0];
            String month = parts[1];
            String year = parts[2];

            // Print the result
            System.out.println("Day: " + day);
            System.out.println("Month: " + month);
            System.out.println("Year: " + year);
        } else {
            System.out.println("Invalid date format. Please use DD/MM/YYYY.");
        }

        // Close the Scanner
        scanner.close();
    }
}
