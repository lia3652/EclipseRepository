package ust.com.practice;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexValidator {
    public static void main(String[] args) {
    	 System.out.println("Enter the input");
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int testCaseCount = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after the integer input

        // Process each test case
        for (int i = 0; i < testCaseCount; i++) {
            // Read the regex pattern
            String pattern = scanner.nextLine().trim();

            // Validate the pattern
            if (isValidPattern(pattern)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }

        // Close the Scanner
        scanner.close();
    }

    // Method to check if a regex pattern is valid
    private static boolean isValidPattern(String pattern) {
        try {
            // Try compiling the pattern
            Pattern.compile(pattern);
            return true; // Pattern is valid
        } catch (PatternSyntaxException e) {
            // Pattern is invalid
            return false;
        }
    }
}
