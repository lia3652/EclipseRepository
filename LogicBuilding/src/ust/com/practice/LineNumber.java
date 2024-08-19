package ust.com.practice;
import java.util.Scanner;

public class LineNumber {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int lineNumber = 1;

	        // Loop until there are no more lines to read
	        while (scanner.hasNextLine()) {
	            String line = scanner.nextLine(); // Read the next line
	            System.out.println(lineNumber + " " + line); // Print line number and content
	            lineNumber++; // Increment the line number
	        }

	        scanner.close(); // Close the scanner when done
	    }
	}



