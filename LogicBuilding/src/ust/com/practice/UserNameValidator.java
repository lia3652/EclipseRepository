package ust.com.practice;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserNameValidator {
    public static void main(String[] args) {
    	
    	 System.out.println("Enter the input");
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        
        // Read the username input
        String username = scanner.next();
        
        // Define the regular expression pattern
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{5,29}$";
        
        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        
        // Create a matcher for the username
        Matcher matcher = pattern.matcher(username);
        
        // Check if the username is valid
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        
        // Close the Scanner
        scanner.close();
    }
}
