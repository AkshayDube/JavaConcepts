package Generics;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculate(98.6,14L));
	}
	
	//One way
	static <X extends Number,Y extends Number> double calculate(X a,Y b) {
		return a.doubleValue()+b.doubleValue();
	}
	
	//Another way
	static <X extends Number> double calculate1(X a,X b) {
		return a.doubleValue()+b.doubleValue();
	}

}
