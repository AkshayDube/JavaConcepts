package Generics;

import java.util.ArrayList;
import java.util.List;

public class Example5 {
//Create a generic method that accepts a Number list and return the sum of all element.
	
	static double sumOfNumberList(List<? extends Number> list) {
		double result=0.0;
		for(Number number:list) {
			result+=number.doubleValue();
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Number> list=new ArrayList<>();
		list.add(12);
		list.add(14.5f);
		list.add(25.6);
		list.add(26L);
		System.out.println(sumOfNumberList(list));

	}

}
