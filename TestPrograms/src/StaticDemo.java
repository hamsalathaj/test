
public class StaticDemo {
	
	int i =3;
	public static void main (String[] args){
		//gives error cannot call a non static variable in static method
		//i=4;
		A a = new A();
		//Can assign value without creating object
		A.m=5;
		a.show();
		System.out.println(A.m);
		
	}
}

class A {
	
	int k;
	static int m;
	public void show(){
		k++;
		//We can use a static variable in a non static method
		m++;
		System.out.println(k+" "+m);
	}
}