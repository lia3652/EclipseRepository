package ust.com.streamapi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamDemo {
	
	    public static void main(String[] args) {
	        // Create a list of integers
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	        List<Integer> evenNumSquared = new ArrayList<>();
	        int oddNumberTotal=0;

	        /*(for(int element: numbers){
	            if(element%2==0){//even
	                evenNumSquared.add(element*element);
	            }
	        }

	        System.out.println(evenNumSquared);

	        for(int element: numbers){
	            if(element%2==1){//odd
	                oddNumberTotal+=element;
	            }
	        }

	        System.out.println(oddNumberTotal);

	    */



	        // Use Stream API to process the list
	        List<Integer> evenNumbers = numbers.stream()
	                .filter(n -> n % 2 == 0) // Filter even numbers
	                .map(n -> n * n)// Square each number
	                .collect(Collectors.toList()); // Collect results into a list

	        // Print the results
	        System.out.println("Even numbers squared: " + evenNumbers);

	        // Additional Stream operations: sum of all odd numbers
	        int sumOfOddNumbers = numbers.stream()
	                .filter(n -> n % 2 != 0) // Filter odd numbers
	                .mapToInt(Integer::intValue) // Convert to IntStream
	                .sum(); // Calculate sum

	        // Print the sum
	        System.out.println("Sum of odd numbers: " + sumOfOddNumbers);
	        System.out.println("For each on streams");
	        numbers.stream()
	                .forEach(n->{
	                    System.out.println(n);
	                });
	        System.out.println("Printing from Qualifier");
	        numbers.stream().forEach(System.out::println);
	    }
	}



