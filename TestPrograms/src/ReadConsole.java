import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadConsole {

	public static void main(String[] args) throws IOException {
		/*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = reader.readLine();
		System.out.println("Buffered "+name);
		
		Scanner scan= new Scanner(System.in);
		String s =scan.nextLine();
		int i = scan.nextInt();
		System.out.println("Scanner "+s+i);
		scan.close();*/
		
		//gs code for finding the average
		String[][] sam = { {"ram","87"},
				{"sham","40"},
				{"ham","49"},
				{"sham","100"},
				{"ham","30"},
				{"ham","-20"}
		};
		Map<String, Integer> map = new HashMap<>();
		int val;
		
		for (String[] str: sam){
			if(map.get(str[0]) != null){
				val= Integer.parseInt(map.get(str[0])+str[1])/2;
				map.put(str[0],val);
			} else {
				map.put(str[0],Integer.parseInt(str[1]));
			}
		}
		
		System.out.println(map);	
		
	}

}
