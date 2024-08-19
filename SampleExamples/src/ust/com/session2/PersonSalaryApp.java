package ust.com.session2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PersonSalaryApp {
	
	private static Person[] persons=new Person[10];
	private static Salary[] salaries=new Salary[10];
	static int pcount=0;
	static int scount=0;
	
	public static void displayPersons()
	{
		for(Person p: persons)
		{
			if(p!=null)
			{
			System.out.println(p.toString());
			}
		}
	}
	
	public static void displaySalaries()
	{
		for(Salary s: salaries)
		{
			if(s!=null)
			{
			System.out.println(s.toString());
			}
		}
	}
	
	// Method to sort array
	 static void arraySort(double[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    
	                    double temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }
	 
	public static void addSalary()
	{
		//Adding Salary details
	salaries[scount++]=new Salary(1, 50000.78, "USD");
	salaries[scount++]=new Salary(2, 45000.49, "EUR");
	salaries[scount++]=new Salary(3, 60000.23, "INR");
	salaries[scount++]=new Salary(4, 70000.12, "INR");
	salaries[scount++]=new Salary(5, 20000.25, "USD");
	salaries[scount++]=new Salary(6, 30000.50, "EUR");
	
		
	}

	public  static void addPerson()
	{
		
		//Adding Person Details
		persons[pcount++]=new Person(1, 1, "8921964366", "hema@gmail.com", "hema");
		persons[pcount++]=new Person(2, 2, "9747267270", "rada@gmail.com", "rada");
		persons[pcount++]=new Person(3, 3, "9074398700", "pinky@gmail.com", "pinky");
		persons[pcount++]=new Person(4, 4, "8943567890", "sneha@gmail.com", "sneha");
		persons[pcount++]=new Person(5, 5, "9089089087", "meka@gmail.com", "meka");
		persons[pcount++]=new Person(6, 6, "8912345678", "asha@gmail.com", "asha");
		
	}
	
	public static String searchContact(String contact)
	{
		
		for(Person p: persons)
		{
			if(p!=null && p.contact.equals(contact))
				return p.name;
		}
		return null;
		
	}
	
	public static double showAvgSalary(String currency)
	{
		double sum=0.0;
		double avg=0.0;
		int cnt=0;
		
		for(Salary s:salaries)
		{
			if(s!=null)
			{
			//System.out.println(s.toString());
			if(currency!=null && s.currency.equals(currency))
			{
				sum=sum+s.amount;
				cnt++;
				
			}
			}
		}
		avg=sum/cnt;
		//System.out.println(avg);
		return cnt > 0 ? avg : 0.0;
		
	}
	
	public static Person personHighestSal() {
		
		double[] salamts=new double[10];
		int i=0;
		  for (Salary s : salaries) {
			  if(s!=null)
			  {
			  salamts[i++]=s.amount;
			  }
		  }
		  arraySort(salamts);
		int n=salamts.length;
		 
		double hsal=salamts[n-1];
		Person h=getPersonBySalaryAmount(hsal);
		return h;
		
		
		
		
		
	}
	public static Person personLowestSal() {
		double[] lowamts=new double[10];
		int i=0;
		  for (Salary s : salaries) {
			  if(s!=null)
			  {
			  lowamts[i++]=s.amount;
			System.out.println(lowamts[i]); 
			  }
		  }
		  arraySort(lowamts);
		
		
		double lsal=lowamts[0];
		//System.out.println(lsal);
		Person l=getPersonBySalaryAmount(lsal);
		return l;
	}
	
	
	public static Person getPersonBySalaryAmount(double sal) {
		int sid=0;
		 for (Salary s : salaries) {
	            if (s != null && s.amount == sal) {
	               sid =s.salary_id;
	            }
	        }
		 Person p=getPersonBySalaryId(sid);
	        return p;
	    }
		
	public static Person getPersonBySalaryId(int sid) {
		  for (Person person : persons) {
	            if (person != null && person.salary_id==sid) {
	                return person;
	            }
	        }
	        return null;
	    }
	
	public static int getSalaryIdForPersonId(int pid) {
		  for (Person person : persons) {
	            if (person != null && person.person_id == pid) {
	                return person.salary_id;
	            }
	        }
	        return -1;
	    }
	
	public static void main(String[] args)
	{
		addSalary();
		addPerson();
		 Scanner scanner = new Scanner(System.in);
		   System.out.println("***Details of Persons***"); 
		 displayPersons();//display array of persons
		 
		 System.out.println("***Details of Salaries***"); 
		 displaySalaries();//display array of persons

	        // Search by contact
	        System.out.println("Enter contact number to search:");
	        String contact = scanner.nextLine();
	        String name = searchContact(contact);
	        if (name != null) {
	            System.out.println("Person found: " + name);
	        } else {
	            System.out.println("Person not found.");
	        }
	        
	        System.out.println("Enter currency to calculate average salary:");
	        String currency = scanner.nextLine();
	        double avgSalary = showAvgSalary(currency);
	        System.out.println("Average Salary in " + currency + ": " + avgSalary);
	        
	        // Show person with highest salary amount
	        Person highestSalPerson = personHighestSal();
	        if (highestSalPerson != null) {
	            System.out.println("Person with highest salary: " + highestSalPerson.name);
	        } else {
	            System.out.println("salary data unavailable .");
	        }
	        
	        // Show person with lowest salary amount
	        Person lowestSalPerson = personLowestSal();
	        if (lowestSalPerson != null) {
	            System.out.println("Person with lowest salary: " + lowestSalPerson.name);
	        } else {
	            System.out.println("salary data unavailable.");
	        }
	        
	        // Show salary ID for a given person ID
	        System.out.println("Enter person ID to get salary ID:");
	        int personId = scanner.nextInt();
	        int salaryId = getSalaryIdForPersonId(personId);
	        if (salaryId != -1) {
	            System.out.println("Salary ID: " + salaryId);
	        } else {
	            System.out.println("Person not found.");
	        }

	        scanner.close();
	
		
	}
}
