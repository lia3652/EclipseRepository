package ust.com.practice;

import java.util.Scanner;
import java.util.regex.*;

public class UsrnameValid {
	
	public static void main(String[] args) {
		
	final String pattern="^[a-zA-Z][a-zA-Z0-9_]{7,}$";
   	 System.out.println("Enter the input");
       // Create a Scanner object for reading input
       Scanner scanner = new Scanner(System.in);

       // Read the number of test cases
       String input = scanner.next();
       
       
       if(input.matches(pattern))
    	   System.out.println("valid");
       else
    	   System.out.println("invalid");
       
       
       
	}
      


}
