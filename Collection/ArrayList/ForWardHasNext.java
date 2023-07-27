/*Has next and has privious tis use to backward and forward  */
package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ForWardHasNext {
 public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(11);
	al.add(12);
	al.add(13);
	al.add(14);
	al.add(15);
	
	Iterator<Integer> itr = al.iterator();
	while (itr.hasNext()) {
		Integer in =(Integer) itr.next();
		System.out.println(" "+in);
	}
	ListIterator<Integer> litr1 = al.listIterator();
	while (litr1.hasNext()) {
		System.out.println(" "+litr1.nextIndex()+" "+litr1.next());
	}
	ListIterator< Integer> litr = al.listIterator();
	System.out.println("\n Forward ");
     while (litr.hasNext()) {
    	System.out.println("list ["+litr.nextIndex()+"] = "+litr.next()); 
	}	
   System.out.println("BackWard");    
     while (litr.hasPrevious()) {
     	System.out.println("list ["+litr.previousIndex()+"] = "+litr.previous()); 
 	}	
}
}
