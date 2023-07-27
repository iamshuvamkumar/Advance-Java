/* RatainAll Mehtod is used to remove to non dublacate value */
package Collection.ArrayList;

import java.util.ArrayList;

public class ReatinAll {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		
		al.forEach(e->System.out.print(" "+e));
		System.out.println();
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
	
		al1.add(10);
		al1.add(16);
		al1.add(17);
		al1.add(18);
		al1.add(19);
		

		al.addAll(al1);
		System.out.println(al);
		System.out.println(al.retainAll(al1));
	    System.out.println(al);
	    
	
	}
}
