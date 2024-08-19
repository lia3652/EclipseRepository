package ust.com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramDemo {
    public static void main(String[] args) {
    	System.out.println("Enter string1");
        // Create a Scanner object for reading input
        Scanner scanner = new Scanner(System.in);

        // Read the two strings
        String str1 = scanner.next();
        System.out.println("Enter string2");
        String str2 = scanner.next();

        // Convert both strings to lowercase to ensure case-insensitive comparison
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check if the strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

        // Close the Scanner
        scanner.close();
    }

    // Method to check if two strings are anagrams
    private static boolean areAnagrams(String str1, String str2) {
        // If lengths are different, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create frequency counters for both strings
        Map<Character, Integer> frequencyMap1 = createFrequencyMap(str1);
        Map<Character, Integer> frequencyMap2 = createFrequencyMap(str2);

        // Compare frequency maps
        return frequencyMap1.equals(frequencyMap2);
    }

    // Method to create a frequency map for a string
    private static Map<Character, Integer> createFrequencyMap(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
    }
}
