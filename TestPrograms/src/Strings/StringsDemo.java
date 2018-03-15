package Strings;

public class StringsDemo {

	public static void main(String[] args) {
		String s1 = "hamsa1";
		String s2 = "hamsa";
		String s3 = new String("hamsa");
		//gives length 0-5 since \n counts this
		//compareTo gives 0 if equal -1 if not
		System.out.println(s3.length()+" "+s3.charAt(0)+" "+s3.compareTo(s1));
		
		StringBuilder s5 = new StringBuilder("ham");
		String s4="";
		if ( s1.equals(s4)){
			//It compares value in string pool
			System.out.println("value comparison");
		}else if(s1 == s3){
			//It compares the object reference
			System.out.println("object comparison");
		}
		else{
		System.out.println("not matching");
		}

	}

}
