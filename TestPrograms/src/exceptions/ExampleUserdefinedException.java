package exceptions;

class ExampleUserdefinedException {
	public static void main (String args[]){
		try {
			System.out.println();
			throw new UserdefinedException("Error Message");
		}
		catch(UserdefinedException exp){
			System.out.println("catch block");
			System.out.println(exp);
		}
	}
}

class UserdefinedException extends Exception {
	String str1;
	public UserdefinedException(String str2) {
		str1=str2;
	}
	public String toString(){
		return ("Userdefined exception has occured" + str1);
	}
}