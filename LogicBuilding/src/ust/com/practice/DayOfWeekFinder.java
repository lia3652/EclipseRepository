package ust.com.practice;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class DayOfWeekFinder {

    /*public static String findDay(int month, int day, int year) {
        // Create a LocalDate object from the provided month, day, and year
        LocalDate date = LocalDate.of(year, month, day);
        
        // Get the day of the week from the LocalDate object
        String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        
        // Return the day of the week in uppercase
        return dayOfWeek.toUpperCase();
    }*/
	
	public static String findDay(int month, int day, int year)
	{
		LocalDate localdate=LocalDate.of(year,month,day);
		String sday=localdate.getDayOfWeek().toString();
		System.out.println(sday);
		return sday;
		
	}

    public static void main(String[] args) {
    	
    	System.out.println("Enter input");
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the input line
        String input = scanner.nextLine();
        
        String[] parts=input.split("/");
        
        // Split the input line into month, day, and year
        //String[] parts = input.split(" ");
        int month =Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        
        // Find and print the day of the week
        String dayOfWeek = findDay(month, day, year);
        System.out.println(dayOfWeek);
    }
}
