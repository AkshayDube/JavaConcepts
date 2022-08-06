package StreamAPI;

import java.util.List;

public class Example10 {
//Map all the elements in the string to lower-case and print them
	public static void main(String[] args) {
		List.of("Akshay","Dubey","Akshay Dubey").stream()
		.map(element->element.toLowerCase())
		.forEach(element->System.out.println(element));

	}

}
