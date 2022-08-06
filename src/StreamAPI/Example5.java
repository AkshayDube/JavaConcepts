package StreamAPI;

import java.util.List;

public class Example5 {
//WAF to sum the even and odd elements separately in the list using FP
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list=List.of(1,2,3,4,5,6,7,8,9,10);
		int odd_result=findTheOddSum(list);
		int even_result=findTheEvenSum(list);
		
		System.out.println("Even Sum is : "+even_result +"  Odd sum is : "+odd_result);
	}

	//Function to find the even elements Sum
private static int findTheEvenSum(List<Integer> list) {
	return list.stream()
			.filter(element->element%2==0)
			.reduce(0,(n1,n2)->n1+n2);
}
 //Function to find the odd element sum
private static int findTheOddSum(List<Integer> list) {
	return list.stream()
			.filter(element->element%2==1)
			.reduce(0,(n1,n2)->n1+n2);
}

}
