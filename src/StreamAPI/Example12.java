package StreamAPI;

import java.util.List;

public class Example12 {
//Find the max and min element in the List
	public static void main(String[] args) {
		//Print Maximum
		System.out.println(List.of(11,41,36,74,69,10,25,47,36,92,14).stream()
		.max((n1,n2)->Integer.compare(n1, n2)));
		
		//Print Minimum(without Optional)
		System.out.println(List.of(11,41,36,74,69,10,25,47,36,92,14).stream()
				.min((n1,n2)->Integer.compare(n1, n2)).get());

	}

}
