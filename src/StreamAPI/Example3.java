package StreamAPI;

import java.util.List;

public class Example3 {
//Filter out even and odd number in list using FP
	public static void main(String[] args) {
		List<Integer> list=List.of(1,2,3,4,5,6,7,8,9,10);
		printEvenFilterdElementWithFP(list);
		printOddFilterdElementWithFP(list);

		
	}

private static void printOddFilterdElementWithFP(List<Integer> list) {
	list.stream()
	.filter(element-> element%2==1)
	.forEach(element->System.out.print(element + " "));
	
	System.out.println();
	
}

private static void printEvenFilterdElementWithFP(List<Integer> list) {
	list.stream()
	.filter(element-> element%2==0)
	.forEach(element->System.out.print(element + " "));
	
	System.out.println();
}

}
