package ust.com.samples;

public class CalculatorTest {
	
	final static CalculatorApp calc=new CalculatorApp();
	
	public static boolean testAdd()
	{
		double result=calc.getAdd(0.0, 3.0);
		double expresult=3.0;
		if(result==expresult)
			return true;
		else
			return false;
		
	}
	
	public static boolean testAdd2()
	{
		double result=calc.getAdd(-8.0, -8.0);
		double expresult=-16.0;
		if(result==expresult)
			return true;
		else
			return false;
		
	}
	
	public static boolean testDiff()
	{
		double result=calc.getDiff(5.0, 3.0);
		double expresult=2.0;
		if(result==expresult)
			return true;
		else
			return false;
		
	}
	public static boolean testMult()
	{
		double result=calc.getMult(2.0, 3.0);
		double expresult=6.0;
		if(result==expresult)
			return true;
		else
			return false;
		
	}

	public static boolean testDiv()
	{
		double result=calc.getDiv(6.0, 2.0);
		double expresult=3.0;
		if(result==expresult)
			return true;
		else
			return false;
		
	}
	public static boolean testDiv2()
	{
		double result=calc.getDiv(60.2, -2);
		double expresult=-30.1;
		if(result==expresult)
			return true;
		else
			return false;
		
	}
	
	public static boolean testAbsolute()
	{
		double result=calc.getAbsolute(-3.0);
		double expresult=3.0;
		if(result==expresult)
			return true;
		else
			return false;
		
	}
	
	public static boolean testAbsolute2()
	{
		double result=calc.getAbsolute(0.0);
		double expresult=0.0;
		if(result==expresult)
			return true;
		else
			return false;
		
	}
	
	public static boolean testPower()
	{
		double result=calc.getPower(0, 3);
		double expresult=0.0;
		if(result==expresult)
			return true;
		else
			return false;
		
	}
	
	public static boolean testPower2()
	{
		double result=calc.getPower(3, -2);
		double expresult=1.0;
		if(result==expresult)
			return true;
		else
			return false;
		
	}

	
	public static void main(String[] args)
	{
		boolean flag1=testAdd();
		if(flag1)
			System.out.println("Testcase1 Addition  success");
		else
			System.out.println("Testcase1 Addition failed");
			
		boolean flag10=testAdd2();
		if(flag10)
			System.out.println("Testcase2 Addition  success");
		else
			System.out.println("Testcase2 Addition failed");
			
		boolean flag2=testDiff();
		if(flag2)
			System.out.println("Testcase Subtraction success");
		else
			System.out.println("Testcase Subtraction failed");
			
		boolean flag3=testMult();
		if(flag2)
			System.out.println("Testcase Multiplication success");
		else
			System.out.println("Testcase Multiplication failed");
		
		boolean flag4=testDiv();
		if(flag4)
			System.out.println("Testcase1 Division success");
		else
			System.out.println("Testcase1 Division failed");
		
		boolean flag8=testDiv2();
		if(flag8)
			System.out.println("Testcase2 Division success");
		else
			System.out.println("Testcase2 Division failed");
		
		boolean flag5=testAbsolute();
		if(flag5)
			System.out.println("Testcase1 Absolute success");
		else
			System.out.println("Testcase1 Absolute failed");
		
		boolean flag9=testAbsolute2();
		if(flag9)
			System.out.println("Testcase2 Absolute success");
		else
			System.out.println("Testcase2 Absolute failed");
		boolean flag6=testPower();
		if(flag6)
			System.out.println("Testcase 1 Power Operation success");
		else
			System.out.println("Testcase 1 Power operation failed");
		
		boolean flag7=testPower2();
		if(flag7)
			System.out.println("Testcase 2 Power Operation success");
		else
			System.out.println("Testcase 2 Power operation failed");
		
		
		
	}
}
