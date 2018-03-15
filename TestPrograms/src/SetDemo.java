import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> value = new HashSet<>();
		value.add(5);
		value.add(11);
		value.add(3);
		value.add(2);
		value.add(11);
		
		//True
		System.out.println(value.add(8));
		
		//False
		System.out.println(value.add(2));
		
		System.out.println(value);
		
	}

}
