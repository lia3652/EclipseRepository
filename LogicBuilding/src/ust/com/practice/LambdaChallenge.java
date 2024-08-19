package ust.com.practice;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class LambdaChallenge {

    // Define the PerformOperation interface
    @FunctionalInterface
    interface PerformOperation {
        boolean check(int number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of test cases
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // For each test case
        for (int i = 0; i < t; i++) {
            // Read the operation type and the number
            String operationType = scanner.nextLine().trim();
            int number = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            PerformOperation operation = null;

            // Determine the lambda expression based on the operation type
            switch (operationType) {
                case "odd":
                    operation = (n) -> n % 2 != 0;
                    break;
                case "prime":
                    operation = (n) -> isPrime(n);
                    break;
                case "palindrome":
                    operation = (n) -> isPalindrome(n);
                    break;
            }

            // Check the number using the chosen operation
            if (operation.check(number)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        // Close the scanner
        scanner.close();
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    // Helper method to check if a number is a palindrome
    private static boolean isPalindrome(int n) {
        String str = Integer.toString(n);
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
