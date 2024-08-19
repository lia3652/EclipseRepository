package ust.com.session4;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read an integer
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        
      
        // Consume the leftover newline character
        scanner.nextLine();
        
        // Read a string
        System.out.print("Enter a string: ");
        String stringValue1 = scanner.nextLine();
        
        // Read a double
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("Enter a string: ");
        String stringValue2 = scanner.nextLine();
        System.out.println("String: " + stringValue1);
        // Print the values
        System.out.println("Integer: " + intValue);
       System.out.println("Double: " + doubleValue);
        
        System.out.println("String: " + stringValue2);
        
        // Close the scanner
        scanner.close();
    }
}