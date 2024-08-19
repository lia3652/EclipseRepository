package ust.com.arraylist;
import java.util.*;

	public class LinkedListDemo {


	      //1000
	     //   fx123  fx200 fx069 fx350
	    //head-Obj1-Obj2-tail
	    public static void main(String[] args) {


	        LinkedList<Integer> linkedList = new LinkedList<>();
	        linkedList.add(1);
	        linkedList.add(2);
	        linkedList.add(3);
	        linkedList.add(4);
	        linkedList.add(5);
	        // 1 2 3 4 5
	// Access element
	        int element = linkedList.get(1);
	        System.out.println(element);
	// Add element at the beginning
	        // 0 1 2 3 4 5
	        linkedList.addFirst(0);
	        System.out.println(linkedList.getFirst());
	// Add element at the end
	        // 0 1 2 3 4 5 3
	        linkedList.addLast(3);
	        System.out.println(linkedList.getLast());
	// Remove first element


	        linkedList.removeFirst();
	        //1 2 3 4 5 3
	        System.out.println(linkedList.getFirst());

	        linkedList.add(3,100);

	        int listSize = linkedList.size();
	        System.out.println("Looping using for loop");
	        for(int index=0;index<listSize;++index){
	            System.out.println(linkedList.get(index));
	        }
	        System.out.println("Looping using for-each loop");
	        for(int listElement: linkedList){
	            System.out.println(listElement);
	        }
	    }
	}
	 