package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListStream {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(2);
		al.add(3);
		System.out.println(" Even Num");
		List<Integer> a = al.stream().filter(e->e%2==0).collect(Collectors.toList());
        a.forEach(e->System.out.print(" "+e));
        
        System.out.println("\n Odd Num");
        List<Integer> a1 = al.stream().filter(e->e%2==1).collect(Collectors.toList());
        a1.forEach(e->System.out.print(" "+e));
	}

}
