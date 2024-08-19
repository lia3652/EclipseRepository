package ust.com.practice;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RemoveRepeatedWords {
    public static void main(String[] args) {
    	
    	 System.out.println("Enter the input");
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String input = scanner.nextLine().trim();

        // Define the regular expression to match repeated words
        String regex = "\\b(\\w+)\\b(?=.*\\b\\1\\b)";

        // Compile the regular expression with case-insensitivity
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        // Create a matcher for the input string
        Matcher matcher = pattern.matcher(input);

        // Replace all repeated words with the first occurrence
        String result = matcher.replaceAll("$1");

        // Print the result
        System.out.println(result);

        // Close the Scanner
        scanner.close();
    }
}
