package Collection.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetMethod {
	public static void main(String[] args) {
		//TreeSet ts = new TreeSet();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(12);
		ts.add(1);
		ts.add(9);
		ts.add(3);
		ts.add(3);
		/*try {
			ts.add("sdss");
		} catch (ClassCastException e) {
			e.printStackTrace();
		}*/
		ts.add(13);
		ts.add(12);
		ts.add(2);
		ts.add(4);
		ts.forEach(e -> System.out.print(" " + e));
		System.out.println("\nChech size " + ts.size());
		System.out.println("IsEmpty " + ts.isEmpty());
		System.out.println("contains " + ts.contains(3));
		System.out.println("Floor " + ts.floor(5)); // check the element lessthan ,equale which number you pass
        System.out.println("headhSet "+ts.headSet(9));  // headsetgire the list of element when you pass any no he was retarn less than every element
	    System.out.println("TailSet "+ts.tailSet(9)); //oposid to headset
        System.out.println("subSet  "+ts.subSet(2, 9));  //subSet its used to pass start num and ending number you get a range list 	
	   Iterator<Integer> itr = ts.iterator();
	    while (itr.hasNext()) {
			Integer ir = (Integer) itr.next();
			System.out.print(" "+ir.intValue());
		}
	
	}
}
