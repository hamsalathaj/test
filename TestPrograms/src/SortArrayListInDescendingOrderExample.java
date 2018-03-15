/*
  Sort Java ArrayList in descending order using comparator example
  This java example shows how to sort elements of Java ArrayList in descending order
  using comparator and reverseOrder method of Collections class.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortArrayListInDescendingOrderExample {

	public static void main(String[] args) {
	
		 //create an ArrayList object
	    ArrayList<String> arrayList = new ArrayList<>();
	   
	    //Add elements to Arraylist
	    arrayList.add("A");
	    arrayList.add("F");
	    arrayList.add("C");
	    arrayList.add("D");
	    arrayList.add("E");
	    arrayList.add("B");
	    
	     System.out.println("Before sorting ArrayList : "+ arrayList);
	 
	     Collections.sort(arrayList);
	    
	     System.out.println("sorting ArrayList in ascending order : "+ arrayList);
		  
	     Collections.reverse(arrayList);
	     System.out.println("sorting ArrayList in decending order : "+ arrayList);
	    
	     /*or
		    To get comparator that imposes reverse order on a Collection use
		    static Comparator reverseOrder() method of Collections class
	
		    To sort an ArrayList using comparator use,
		    static void sort(List list, Comparator c) method of Collections class.
		  */
		  Comparator<String> comparator = Collections.reverseOrder();
		  Collections.sort(arrayList,comparator);
		  System.out.println("descending order using comparator: "+ arrayList);
		  
		  
		    List<Integer> arrayList1 = new ArrayList<>();
			   
		    //Add elements to Arraylist
		    arrayList1.add(569);
		    arrayList1.add(348);
		    arrayList1.add(964);
		    arrayList1.add(247);
		    arrayList1.add(836);
		    arrayList1.add(471);
		    
		    System.out.println("second list comparator before: "+ arrayList1);
		    Comparator<Integer> comm = (o1, o2) -> {
				if (o1%100>o2%100)
					return 1;
				return -1;
		    };
		    
		    Collections.sort(arrayList1,comm);
		    System.out.println("second list comparator After: "+ arrayList1);
	}
}
