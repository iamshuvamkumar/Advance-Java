/*Contain Method to check the element is exist in arrayList or not this contain is boolean */
package Collection.ArrayList;

import java.util.ArrayList;

public class ContainsMethod {

	public static void main(String[] args) {
     ArrayList<Integer> al = new ArrayList<Integer>();

     System.out.println(al.isEmpty());
     System.out.println(al.size());
     
     al.add(15);
     al.add(14);
     al.add(12);
     al.add(13);
     al.add(11);

      System.out.println(al.isEmpty());
      System.out.println(al.size());

      System.out.println(al.contains(14));
      System.out.println(al.contains(10));
      al.forEach(e->System.out.print(" "+e));
	}

}
