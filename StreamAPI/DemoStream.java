
package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
	public static void main(String[] args) {
		 List <Integer> al = List.of(3,5,6,2,4,56,5,44,35,24,75,88,97,93);
	System.out.println("Even num");
		 List<Integer> l = al.stream().filter(e->e%2==0).collect(Collectors.toList());
		  l.forEach(e->System.out.print(" "+e));
		  System.out.println("\nOdd Num");
		  List<Integer> l1 = al.stream().filter(e->e%2==1).collect(Collectors.toList());
		  l1.forEach(e->System.out.print(" "+e));
	}
}
