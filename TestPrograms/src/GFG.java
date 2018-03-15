import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
 
class GFG {
     
    // prints all the number containing 1, 2, 3 
    // in any order
    private static String printNumbers(int[] numbers)
    {
    	//reversing the linked list
         LinkedList<Integer> arraylinked = new LinkedList<>();
         arraylinked.add(50);
         arraylinked.add(59);
         arraylinked.add(5);
         
         Collections.reverse(arraylinked);
         System.out.println("linked list"+arraylinked);
         
         LinkedList<String> arraylink = new LinkedList<>();
         arraylink.add("ham");
         arraylink.add("59");
         arraylink.add("5");
         
         Collections.reverse(arraylink);
         System.out.println("linked list"+arraylink);
         
         
        ArrayList<Integer> array = new ArrayList<>();
        for (int number : numbers) {
             
            // check if the number contains 1, 
            // 2 & 3 in any order
            if (findContainsOneTwoThree(number))
                array.add(number);
        }
 
        // sort all the numbers
        Collections.sort(array);
        
        System.out.println("array is" +array);
         
        StringBuffer strbuf = new StringBuffer();
        Iterator it = array.iterator();        
        while (it.hasNext()) {
             
            int value = (int)it.next();
            if (strbuf.length() > 0)
                strbuf.append(", ");
                 
            strbuf.append(Integer.toString(value));
        }
         
        return (strbuf.length() > 0) ? 
                     strbuf.toString() : "-1";
    }
 
    // convert the number to string and find 
    // if it contains 1, 2 & 3.
    private static boolean findContainsOneTwoThree(
                                         int number)
    {
         
        String str = Integer.toString(number);        
        return (str.contains("1") && str.contains("2") && 
                                    str.contains("3"));
    }
 
    public static void main(String[] args) 
    {        
        int[] numbers = { 123, 1232, 456, 234, 32145 };        
        System.out.println(printNumbers(numbers));
    }
}