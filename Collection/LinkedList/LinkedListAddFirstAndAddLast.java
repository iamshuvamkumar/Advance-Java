package Collection.LinkedList;

import java.util.LinkedList;

public class LinkedListAddFirstAndAddLast {
   public static void main(String[] args) {
	  LinkedList< Integer> al = new LinkedList<Integer>();
	  al.add(10);
	  al.add(20);
	  al.add(30);
	  al.add(40);
	  al.add(50);
	  al.add(60);
	  al.add(70);
	  System.out.println(" "+al);
	  System.out.println(al.size());
	  al.forEach(l->System.out.print(" "+l));
	  al.addFirst(11);
	  al.addLast(22);
	  System.out.println();
	   Object[] arr = al.toArray();
	   for(int i=0;i<arr.length;i++) {
		   System.out.println(" "+i+" "+arr[i]);
	   }
	   
   }
}
