package ust.com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
public class StreamApiDemo {
 
	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "kv", "lemon","berry","blackberry","blueberry","bhel");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
 
        // 1. Filter
        System.out.println("1. Fruits starting with 'b':");
        fruits.stream()
                .filter(f -> f.startsWith("b"))
                .forEach(System.out::println);
 
        // 2. Map
        System.out.println("\n2. Fruit names in uppercase:");
        fruits.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
 
        // 3. Collect
        System.out.println("\n3. Even numbers collected to a new list:");
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
 
        // 4. ForEach
        System.out.println("\n4. Printing squares of numbers:");
        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);
        System.out.println();
 
        // 5. Sum
        System.out.println("\n5. Sum of all numbers:");
        int sum = numbers.stream()
                        .mapToInt(Integer::intValue)
                        .sum();
        System.out.println(sum);
 
        // 6. Limit
        System.out.println("\n6. First 3 fruits:");
        fruits.stream()
                .limit(3)
                .forEach(System.out::println);
 
        // 7. Skip
        System.out.println("\n7. Fruits after skipping first 5:");
        fruits.stream()
                .skip(5)
                //.limit(2)
                .forEach(System.out::println);
 
        // 8. Distinct
        System.out.println("\n8. Distinct numbers:");
        Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5)
                .stream()
                .distinct()
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
 
        // 9. Sorted
        System.out.println("\n9. Fruits sorted alphabetically:");
        fruits.stream()
                .sorted()
                .forEach(System.out::println);
 
        System.out.println("\n9. Numbers sorted :");
 
        Arrays.asList(9, 8, 7, 6, -1000, 3005, 5, 1)
                .stream()
                .sorted()
                .forEach(System.out::println);
 
        // 10. anyMatch, allMatch, noneMatch
        System.out.println("\n10. Matching operations:");
        boolean anyStartWithA = fruits.stream().anyMatch(f -> f.startsWith("a"));
        boolean allLongerThan2 = fruits.stream().allMatch(f -> f.length() >= 2);
        boolean noneStartWithX = fruits.stream().noneMatch(f -> f.startsWith("x"));
 
        System.out.println("Any fruit starts with 'a': " + anyStartWithA);
        System.out.println("All fruits are longer than 2 characters: " + allLongerThan2);
        System.out.println("No fruit starts with 'x': " + noneStartWithX);
		
		
	}
 
}