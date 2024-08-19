package ust.com.practice;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    
    public static boolean isAnagram(String a, String b) {
        // Convert both strings to lower case to make the comparison case-insensitive
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        // If lengths are different, they cannot be anagrams
        if (a.length() != b.length()) {
            return false;
        }
        
        // Convert both strings to char arrays
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        
        // Sort the char arrays
        Arrays.sort(aArray);
        Arrays.sort(bArray);
        
        // Check if sorted arrays are equal
        return Arrays.equals(aArray, bArray);
    }
    
    public static void main(String[] args) {
    	
    	System.out.println("Enter strings");      
    	Scanner scanner = new Scanner(System.in);
        
        // Read input strings
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        
        // Check if the strings are anagrams and print the result
        if (isAnagram(a, b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
        
        scanner.close();
    }
}
