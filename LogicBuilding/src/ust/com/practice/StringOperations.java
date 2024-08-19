package ust.com.practice;

import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the strings");

        // Read the first string
        String str1 = scanner.next();
        // Read the second string
        String str2 = scanner.next();

        System.out.println(str1);
        System.out.println(str2);

        
        // Task 1: Calculate the sum of the lengths
        int lengthSum = str1.length() + str2.length();
        System.out.println(lengthSum);

        // Task 2: Compare the two strings lexicographically
        if (str1.compareTo(str2) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
      String capstring1=str1.substring(0,1).toUpperCase()+ str1.substring(1,str1.length());
      System.out.println(capstring1);
      String capstring2=str2.substring(0,1).toUpperCase()+ str2.substring(1,str2.length());
      System.out.println(capstring2);

        // Task 3: Capitalize the first letter of both strings and print them
        /*String capitalizedStr1 = str1.substring(0, 1).toUpperCase() + str1.substring(1);
        String capitalizedStr2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
        System.out.println(capitalizedStr1 + " " + capitalizedStr2);
        scanner.close();*/
    }
}
