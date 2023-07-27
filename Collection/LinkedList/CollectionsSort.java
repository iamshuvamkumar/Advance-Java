package Collection.LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsSort {

	public static void main(String[] args) {
		LinkedList <Integer> al = new LinkedList<Integer>();
		al.add(15);
		al.add(25);
		al.add(5);
		al.add(1);
		al.add(10);
		al.add(3);
        
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.print("  "+itr.next());
		}
		System.out.println("Sort list ");
		Collections.sort(al);
		al.forEach(e->System.out.print(" "+e));
	}

}
