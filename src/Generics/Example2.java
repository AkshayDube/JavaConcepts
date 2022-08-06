package Generics;

public class Example2 {

	public static void main(String[] args) {
		
		String obj1=returnTheSame("Akshay Dubey");
		Integer obj2=returnTheSame(45);
		Float obj3=returnTheSame(24.5f);
		Object obj4=returnTheSame(new Object());
		System.out.println(obj1 + " " + obj2+" "+ obj3 + " " +obj4);

	}
	
	static <X> X returnTheSame(X element) {
		return element;
	}

}
