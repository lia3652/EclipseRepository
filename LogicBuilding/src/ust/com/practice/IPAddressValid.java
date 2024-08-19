package ust.com.practice;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	import java.util.Scanner;

	public class IPAddressValid {
	    public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        while(in.hasNext()){
	            String IP = in.next();
	            System.out.println(IP.matches(new MyRegex().pattern));
	        }

	    }
	}
	
	 class MyRegex {
	    // Regular expression pattern to validate an IP address
	   public static final String pattern = 
	        "^([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\."
	        + "([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\."
	        + "([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\."
	        + "([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])$";
		 
	 }
/*
 * 
 * ^ and $ denote the start and end of the string, respectively.
([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5]) matches an octet:
[01]?[0-9][0-9]? matches numbers from 0 to 199.
2[0-4][0-9] matches numbers from 200 to 249.
25[0-5] matches numbers from 250 to 255.
The \\. is used to match the dot . between octets.
 */
