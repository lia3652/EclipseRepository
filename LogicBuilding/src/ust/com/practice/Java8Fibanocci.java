package ust.com.practice;
import java.util.stream.Stream;

public class Java8Fibanocci {
	
	

	public class FibonacciStream {

	    public static void main(String[] args) {
	        // Number of Fibonacci numbers to generate
	        int count = 10;

	        // Generate Fibonacci sequence
	        Stream<Long> fibonacciStream = Stream.iterate(
	            new long[]{0, 1}, // Initial seed
	            t -> new long[]{t[1], t[0] + t[1]}, // Next element
	            t -> t[1] <= 100 // Optional condition to limit the stream (can be adjusted)
	        ).map(t -> t[0]);

	        // Print first `count` Fibonacci numbers
	        fibonacciStream.limit(count).forEach(System.out::println);
	    }
	}


}
