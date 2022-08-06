package StreamAPI;

import java.util.List;

public class Example11 {
//Print the length of each element in String List
	public static void main(String[] args) {
		List.of("Akshay","Dubey","Akshay Dubey").stream()
		.map(element->element.length())
		.forEach(element->System.out.println(element));
	}

}
