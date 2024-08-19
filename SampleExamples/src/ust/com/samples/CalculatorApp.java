package ust.com.samples;

import java.util.Scanner;

public class CalculatorApp {
	
	public static double getAdd(double x,double y)
	{
		double result=0.0;
		 return result=x+y;
	     
	}
	public static double getDiff(double x,double y)
	{
		double result=0.0;
		result=x-y;
       return result;
	}

	public static double getMult(double x,double y)
	{
		double result=0.0;
		result=x*y;
		return result;
      
		
	}

	public static double getDiv(double x,double y)
	{
		double result=0.0;
		  if(y!=0) {
			    result=x/y;
            }
            else           	
             {
            	System.out.println("Division by zero is not allowed");}
		  return result;
		
	}

	public static double getPower(double x,double y)
	{
		double pvalue=1.0;
		
		
        for(int i=0;i<y;i++)
        {
        	pvalue=pvalue*x;
        }
      return pvalue;
		
	}

	public static double getAbsolute(double absno )
	{
		
		
        if(absno<0)
        	absno=-absno;
        return absno;
       
		
	}

	public static void main(String[] args)
	{
		double x=0.0,y=0.0;
		int choice;
		double res=0.0;
		
		
		try
		{
			Scanner scn=new Scanner(System.in);
		System.out.println("Enter the first number");
		x=scn.nextInt();
		System.out.println("Enter the second number");
		y=scn.nextInt();
		boolean running=true;
		while(running)
				{
		System.out.println("Choose the operation to be performed");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Power ");
		System.out.println("6.Absolute value");
		System.out.println("7.Exit");
		
		choice=scn.nextInt();
		
		switch(choice)
		{
		case 1:res=getAdd(x,y);
		System.out.println("Addition result:"+res);
		        break;
		case 2: 
			res=getDiff(x,y);
			 System.out.println("Subtraction result:"+res);
                break;
		case 3: res=getMult(x,y);
		  System.out.println("multiplication result:"+res);
                 break;
		case 4:
			    
			 res=getDiv(x,y);
			 System.out.println("Division result:"+res);
                break;
		case 5: 
			res=getPower(x,y);
			System.out.println("Power of x^y"+res);
		        break;
		case 6: 

			double absno=0.0;
			System.out.println("Enter the number");
			Scanner scn1=new Scanner(System.in);
			absno=scn1.nextInt();
			res=getAbsolute(absno);
			  System.out.println("Result:"+res);
             break;
		case 7:
			 System.out.println("Exit");
			running=false;
			 break;
		default: 
                 System.out.println("Please enter correct choice");
                  break;
		
		        
		}
		}
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
	
}
}
