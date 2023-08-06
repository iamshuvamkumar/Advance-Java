package StreamAPI;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountMethod {

	public static void main(String[] args) {

		Stream<Integer> stm = Stream.of(21,55,56,32,54,32);

		Stream<String> stm2 = Stream.of("ama","mama","lama","kama","mamaba","mama");

		long count = stm2.collect(Collectors.counting());
		long count1 = stm.collect(Collectors.counting());
		System.out.println("Couting  word "+count);
		System.out.println("Couting  Number "+count1);
		
		
	}
}
