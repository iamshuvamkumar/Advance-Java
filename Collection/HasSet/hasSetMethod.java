/* HashSet cant be add smae (element/ value)  */

package Collection.HasSet;

import java.util.HashSet;
import java.util.Iterator;

public class hasSetMethod {
  public static void main(String[]args) {
	  HashSet<Integer> set = new HashSet<Integer>();
		 System.out.println("isempty  "+set.isEmpty());
		 System.out.println("Size   "+set.size());
		 System.out.println("add  "+set.add(10));
		 set.add(4);
		 set.add(6);
		 set.add(7);
		 System.out.println("add  "+set.add(10));
		 System.out.println("add  "+set.add(null));
		   set.add(11);
		 System.out.println("set  "+set);
		 set.add(14);
		 set.add(16);
		 set.add(17);
		 Iterator<Integer> itr = set.iterator();
		 while (itr.hasNext()) {
		 Integer n = itr.next();
			// System.out.print(" "+n.intValue());
		 System.out.print(" "+n);
		 System.out.println("\n"+set.remove(10));
		 System.out.println(set);
		 }
  }
}
