package StreamAPI;

import java.util.List;

public class Example7 {
//Print all the distinct elements in the list
	public static void main(String[] args) {
		List.of(1,0,2,9,3,8,4,7,5,6,1,0,2,9,3,8,4,7,5,6).stream().
		distinct().forEach(e->System.out.println(e));
	}

}
