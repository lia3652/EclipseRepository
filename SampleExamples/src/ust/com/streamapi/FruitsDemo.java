package ust.com.streamapi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class FruitsDemo {
	
	public static void getUpperCase(ArrayList<String> fruits)
	{
		ArrayList<String> upper = new ArrayList<>();
		for(String f:fruits) {
 
			upper.add(f.toUpperCase());
		}
		System.out.println(upper);
	}
		
	
	public static void  getSelectFruit(ArrayList<String> fruits, char ch)
	{
		System.out.println("Output:");
		ArrayList<String> selected = new ArrayList<>();
		for(String f:fruits) {
		if(f.charAt(0) == ch) {
 
			selected.add(f);
		}
		}
		System.out.println(selected);
	}
	

	public static void main(String[] args)
	{
		ArrayList<String> fruits= new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("cherry");
		fruits.add("orange");
		fruits.add("orange");
		getUpperCase(fruits);
		char ch='a';
		getSelectFruit(fruits,ch);

}
}