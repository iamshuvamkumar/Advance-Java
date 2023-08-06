package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShortedMethod {
  public static void main(String[] args) {
	  List<Integer> alist = Arrays.asList(0,1,4,6,3,7,2,5,9,8);
		
		System.out.println(" Squar ");
		List<Integer> mp = alist.stream().map(i->i*i).collect(Collectors.toList());
	    mp.forEach(e->System.out.print(" "+e));
	   System.out.println("\n Sorted");
	    Stream<Integer> sot = mp.stream().sorted();
	    sot.forEach(e->System.out.print(" "+e));
	    
}
}
