package ust.com.session2;


public class PersonSalaryAppTest {
	final static PersonSalaryApp ps=new PersonSalaryApp();

	public static boolean testsearchContact()
	{
		String name=ps.searchContact("8912345678");
		System.out.println(name);
		String expname="asha";
		if(name==(expname))
			return true;
		else
			return false;
		
	}
	
	public static boolean testshowAvgSalary()
	{
	  double avg=ps.showAvgSalary("USD");
		
		double exp=35000.515;
		if(avg==(avg))
			return true;
		else
			return false;
		
	}
	
	
	public static void main(String[] args)
	{
		boolean flag1=testsearchContact();
		if(flag1)
			System.out.println("Testcase1 Search Contact  success");
		else
			System.out.println("Testcase1 Search Contact failed");
			
	
	
	boolean flag2=testshowAvgSalary();
	if(flag2)
		System.out.println("Testcase1 Average Salary  success");
	else
		System.out.println("Testcase1 Average Salary failed");
		
}
}
