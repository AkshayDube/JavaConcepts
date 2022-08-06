package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
	//Print all elements in a list with FP and non-FP
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruits=new ArrayList<>(List.of("Apple","Banana","Mango","Kiwi"));
		printWithoutFP(fruits);
		printWithFP(fruits);
	}

	private static void printWithFP(List<String> fruits) {
		fruits.stream().forEach(e->System.out.print(e +" "));
	}

	private static void printWithoutFP(List<String> fruits) {
		// TODO Auto-generated method stub
		//System.out.println(fruits.toString());//one way
		for(String s:fruits) {
			System.out.print(s+" ");
		}
		System.out.println();
	}

}
