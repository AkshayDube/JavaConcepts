package StreamAPI;

import java.util.List;

public class Example2 {
//2. Print all element in a list if it ends with "at"
	public static void main(String[] args) {
		
		List<String> list=List.of("Apple","Rat","Cat","Hen","Bat","Hut");
		printFilterdElementWithFP(list);

	}

//Function to filter and print the list
private static void printFilterdElementWithFP(List<String> list) {
	list.stream()
	.filter(element->element.endsWith("at"))
	.forEach(element->System.out.println(element));
}

}
