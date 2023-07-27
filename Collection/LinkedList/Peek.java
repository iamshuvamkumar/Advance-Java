package Collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Peek {

	public static void main(String[] args) {
		
//peek,-pool
		LinkedList<Integer> al = new LinkedList<Integer>();
		int a = 5;
		for(int i=0;i<10;i++) {
			al.add(i*a+2);
		}
		Iterator<Integer> itr = al.iterator();
	  while (itr.hasNext()) {
		System.out.print(" "+itr.next().intValue());
	}
	
	  System.out.println("\n "+al.peek());
	  al.forEach(e->System.out.print(" "+e));
	  System.out.println("\nPeekFirst() "+al.peekFirst());  //peek method work on find the text value 
	  System.out.println("\nPeekLast() "+al.peekLast());
	}

}
