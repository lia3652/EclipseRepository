package ust.com.practice;
import java.util.Scanner;
	
	public class SeriesGenerator {

	    // Method to generate and print the series for given a, b, and n
	    public static void generateSeries(int a, int b, int n) {
	        int currentTerm = a; // Start with the initial value a
	        for (int i = 0; i < n; i++) {
	            System.out.print(currentTerm + " "); // Print the current term
	            currentTerm += b * Math.pow(2, i); // Update currentTerm for the next iteration
	        }
	        System.out.println(); // Move to the next line after printing all terms
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Number of queries
	        int q = scanner.nextInt();
	        // Processing each query
	        for (int i = 0; i < q; i++) {
	            int a = scanner.nextInt();
	            int b = scanner.nextInt();
	            int n = scanner.nextInt();
	            generateSeries(a, b, n);
	        }
	        
	        scanner.close();
	    }
	}
