package StreamAPI;

import java.util.Collection;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToCollectionMethod {

	public static void main(String[] args) {
		Stream<String> stm = Stream.of("21","55","56","32","54","32");
		TreeSet<String> tn = stm.collect(Collectors.toCollection(TreeSet::new));
		System.out.println("Collection "+tn);
		
		Stream<String> stm1 = Stream.of("re","sd","df","re");
		TreeSet<String> tn1 = stm1.collect(Collectors.toCollection(TreeSet::new));
		System.out.println("COllection "+tn1);
		
	}

}
