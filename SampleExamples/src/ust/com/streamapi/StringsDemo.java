package ust.com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;


public class StringsDemo {
	public static void main(String[] args)
	{
		List<String> fruits= Arrays.asList("apple","banana","orange","orange");
	    List<String> fruitsupper = fruits.stream()
	    		.map(String::toUpperCase)
	    		//.map(String::ToUpperCase)
                
                
                .collect(Collectors.toList());

        
        System.out.println("Fruits in Uppercase   " + fruitsupper);
         
        System.out.println("Enter the character");
        Scanner scn=new Scanner(System.in);
        //char ch='b';
        String st=scn.nextLine();
       //char ch=st.charAt(0);
        List<String> fruitselect = fruits.stream()
                
        		   .filter(s->s.startsWith(st))
	              
	                .collect(Collectors.toList()); 

    // Print the results
    System.out.println("Selected Fruit " + fruitselect);

		
	}

}
