package StreamAPI;

import java.util.List;

public class Example8 {
//Find the square of all distinct elements in the list.
	public static void main(String[] args) {
		List.of(10,14,14,10,5,7,6).stream()
		.distinct().map(e->e*e)
		.forEach(e->System.out.println(e));
	}

}
