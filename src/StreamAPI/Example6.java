package StreamAPI;

import java.util.List;

public class Example6 {
    //Sort the List and print all elements
	public static void main(String[] args) {
		List.of(1,0,2,9,3,8,4,7,5,6,1,0,2,9,3,8,4,7,5,6).stream().
		sorted().forEach(e->System.out.println(e));
	}

}
