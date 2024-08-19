package ust.com.practice;

import java.util.Scanner;

public class SubStringFinder {

    // Method to find the smallest and largest substrings of length k
    public static String getSmallestAndLargest(String s, int k) {
        // Initialize smallest and largest substrings
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Loop through the string to find all substrings of length k
        for (int i = 1; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);

            // Update smallest and largest substrings
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        // Return the result as a string with smallest and largest substrings
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
    	
    	  System.out.println("Enter the input");
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Read the string and the integer k
        String s = scanner.nextLine().trim();
        int k = scanner.nextInt();

        // Get the smallest and largest substrings
        String result = getSmallestAndLargest(s, k);

        // Print the result
        System.out.println(result);

        // Close the Scanner
        scanner.close();
    }
}
