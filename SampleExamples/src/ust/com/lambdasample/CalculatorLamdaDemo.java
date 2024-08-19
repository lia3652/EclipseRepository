package ust.com.lambdasample;




public class CalculatorLamdaDemo {
	
	public static void main(String[] args)
	{
     
	ITwoOperation add=(x,y)-> x+y;
	ITwoOperation subtract=(x,y)-> x-y;
	ITwoOperation mult=(x,y)-> x*y;
	ITwoOperation divide=(x,y)->{
		double res=0.0;
		if(y==0)
			System.out.println("Division by zero is not possible");
		else
			 res= x/y;
		
		return res;
	};
	ITwoOperation power=(x,y)->
	{
		double result=1.0;
		for(int i=0;i<y;i++)
		{
			result=result*x;
		}
		return result;
	};
	
	ITwoOperation abs=(x,y)-> x>=0?x:-x;
	
	IPrinter printObj=message->System.out.println(message);
	
	printObj.print("Addition Result:"+add.put(3.4,2.5));
	printObj.print("Subtraction Result:"+subtract.put(3.4,2.5));
	printObj.print("Multiplication Result:"+mult.put(3.4,2.5));
	printObj.print("Division Result:"+divide.put(3.4,2.5));
	printObj.print("Absolute value Result:"+abs.put(-9.0,0));
	printObj.print("Power value Result:"+power.put(4.0,2.0));
   
	}
}
