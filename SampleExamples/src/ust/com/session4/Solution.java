package ust.com.session4;

import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                /*String s2=String.valueOf(x);
                StringBuilder sb=new StringBuilder();
                
                    int len=s2.length();
                    int exp=3;
                    
                    if(len<3)
                    {
                       int cnt= exp-len;
                       
                    
                    for(i=0;i<cnt;i++)
                    {
                        sb.append(0);
                    }
                    }
                    sb.append(s2);
                    System.out.println(s1+"       "+sb.toString());*/
                
                // Print the formatted output
                // %-15s: Left-align the string in a 15-character wide field
                // %03d: Print the integer with at least 3 digits, padded with leading zeros
                System.out.printf("%-15s%03d%n", s1, x);
               
            }
            System.out.println("================================");

    }
}


