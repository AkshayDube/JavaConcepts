package StreamAPI;

import java.util.List;

public class Example4 {

	//WAF to find the sum of all elements in the list using FP
	public static void main(String[] args) {
		List<Integer> list=List.of(10,20,30,40,50,60,70,80,90,100);
		int result=findTheSum(list);
		System.out.println(result);

	}

	//Function to return the sum of elements in the list
	private static Integer findTheSum(List<Integer> list) {
		return list.stream().reduce(0, (n1,n2)->n1+n2);
	}

}
