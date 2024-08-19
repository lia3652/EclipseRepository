package ust.com.streamapi;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {

	    public static void main(String[] args) {
	    	
	 
	        // Create a list of integers
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	        
	        // Use Stream API to process the list
	        List<Integer> result = numbers.stream() // Convert the list to a stream
	            .filter(n -> n % 2 != 0) // Filter out even numbers
	            .map(n -> n * n) // Square each remaining number
	            .collect(Collectors.toList()); // Collect the results into a new list
	        
	        // Print the result
	        System.out.println(result); // Output: [1, 9, 25, 49, 81]
	        
	        List<Integer> res = numbers.stream() // Convert the list to a stream
		            .filter(n -> n % 2 == 0) // Filter out odd numbers
		            .map(n -> n * n) // Square each remaining number
		            .collect(Collectors.toList()); // Collect the results into a new list
		        
		        // Print the result
		        System.out.println(res); 
	        
		       /* List<Integer> r=numbers.stream()
		        		.filter(n->n%2==0)
  	        		     .map(n->n*2)
		        		.collect(Collectors.toSet());*/
	        
	    }
	    
	    
	}


