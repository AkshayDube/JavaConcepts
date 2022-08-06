package StreamAPI;

import java.util.stream.IntStream;

public class Example9 {
//Print square of first 10 numbers using IntStream.range(1,11)
	public static void main(String[] args) {
	IntStream.range(1, 11).map(e->e*e)
	.forEach(e->System.out.println(e));

	}

}
