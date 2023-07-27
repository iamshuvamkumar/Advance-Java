package Collection.HasSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

class LinkedHashSetMethod{
    public static void main (String[]args) {
    	
    	LinkedHashSet <Integer> set = new  LinkedHashSet<Integer>();
    	
    	 System.out.println("\n  isempty  "+set.isEmpty());
		 System.out.println("\n  Size   "+set.size());
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
		 System.out.print(" "+n);
		 System.out.print(" "+n.intValue());
		 }
    }
}