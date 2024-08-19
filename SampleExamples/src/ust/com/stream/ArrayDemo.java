package ust.com.stream;

import java.util.Scanner;

public class ArrayDemo {
	
	public void getMaxArray()
	{
		
	}
	
	public static void main(String[] args)
	{
		int maxvalue=0;
		int minvalue=0;
		int size=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size of array");
		size=scn.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter elements of array");
		for(int i=0;i<size;i++)
		{
			arr[i]=scn.nextInt();
		}
		
		System.out.println("Array Elements");
		System.out.println("---------------");
		for(int j=0;j<size;j++)
		{
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		System.out.println();
		maxvalue=arr[0];
		System.out.println("Maximum Value in Array: ");
		System.out.println("------------------------");
		for(int k=1;k<size;k++)
		{
			
			if(arr[k]>maxvalue)
				maxvalue=arr[k];
		}
		
		System.out.println(maxvalue+" ");
		
		System.out.println("Minimum Value in Array: ");
		System.out.println("------------------------");
		minvalue=arr[0];
		for(int m=1;m<size;m++)
		{
			
			if(arr[m]<minvalue)
				minvalue=arr[m];
		}
		
		System.out.println(minvalue+" ");
		scn.close();
	
		
	}

}
