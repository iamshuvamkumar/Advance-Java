package StreamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class ToArrayMethod {

	public static void main(String[] args) {
		Stream<Integer> obj = Stream.of(21,55,56,32,54,32);
		Object[] aobj = obj.toArray(Object[]::new);
		System.out.println("Array "+Arrays.toString(aobj));
	}

}
