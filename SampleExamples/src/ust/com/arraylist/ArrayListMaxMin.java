package ust.com.arraylist;

import java.util.ArrayList;

public class ArrayListMaxMin {
	
	public static  void  printList(ArrayList<Integer> arrlist)
	{
		System.out.println("ArrayList Elements");
        for(int listElement: arrlist){
            System.out.println(listElement);
        }
	}
	
	public static  void  getMaxList(ArrayList<Integer> arrlist)
	{
		int maxvalue=0;
		maxvalue=arrlist.get(0);
		System.out.println("Maximum Value in ArrayList: ");
		System.out.println("------------------------");
		 int listSize = arrlist.size();
		for(int k=1;k<listSize;k++)
		{
			
			if(arrlist.get(k)>maxvalue)
				maxvalue=arrlist.get(k);
		}
		
		System.out.println(maxvalue+" ");
	}
	
	
	public static void  getMinList(ArrayList<Integer> arrlist)
	{
		 int size = arrlist.size();
		int minvalue=0;
		minvalue=arrlist.get(0);
		System.out.println("Minimum Value in ArrayList: ");
		System.out.println("------------------------");
		for(int m=1;m<size;m++)
		{
			
			if(arrlist.get(m)<minvalue)
				minvalue=arrlist.get(m);
		}
		
		System.out.println(minvalue+" ");
	}
	
	
	public static void main(String[] args)
	{
		
		
		  ArrayList<Integer> arrlist = new ArrayList<>();
		  arrlist.add(10);
		  arrlist.add(22);
		  arrlist.add(340);
		  arrlist.add(44);
	        arrlist.add(5);
	        arrlist.add(75);
	        printList(arrlist);
	        getMaxList(arrlist);
	        getMinList(arrlist);
	        
	}

}
