package Collection.LinkedList.vactor;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VactorAddElement {

	public static void main(String[] args) {
		Vector<Integer> voc = new Vector<Integer>();
		System.out.println("Size " + voc.size());
		System.out.println("Capacity " + voc.capacity());
		voc.addElement(10);
		voc.addElement(20);
		voc.addElement(30);
		voc.addElement(40);
		voc.addElement(50);
		voc.addElement(60);
		voc.addElement(70);
		voc.addElement(80);
		voc.addElement(90);
		voc.addElement(100);
		
		System.out.println("Size " + voc.size());
		System.out.println("Capacity " + voc.capacity());
		
		Enumeration<Integer> eum = voc.elements();
		
		while (eum.hasMoreElements()) {
			Integer i = eum.nextElement();
			System.out.print(" " + i.intValue());
		}

		System.out.println();

		Iterator<Integer> itr = voc.iterator();
		
		while (itr.hasNext()) {
			Integer n = itr.next();
			System.out.print(" " + n);
		}

		System.out.println("\nFirst element " + voc.firstElement());
		System.out.println("First last " + voc.lastElement());
		
		System.out.println("index get element" + voc.elementAt(2));
		System.out.println("index get element" + voc.get(3));
		
		voc.removeElementAt(2);
		
		System.out.println(voc);
		
		System.out.println("Remove element " + voc.removeElement(11));
		System.out.println("Remove element " + voc.removeElement(40));
		
		Enumeration<Integer> ele = voc.elements();
		
		while (ele.hasMoreElements()) {
			Integer it = (Integer) ele.nextElement();
			System.out.print(" " + it.intValue());
		}
		
		System.out.println("\nSize " + voc.size());
		System.out.println("Capacity " + voc.capacity());

		Vector<Integer> al = new Vector<Integer>();
		al.add(12);
		al.add(14);
		al.add(13);
		al.add(47);
		al.add(21);

		al.forEach(v -> {
			System.out.print(" " + v);
		});
		voc.addAll(2, al);
		
		voc.forEach(v -> System.out.print(" " + v));
		
		System.out.println("\nSize " + voc.size());
		System.out.println("Capacity " + voc.capacity());
		
		voc.removeAllElements();
	
		System.out.println("\nSize " + voc.size());
		System.out.println("Capacity " + voc.capacity());

		voc.trimToSize();
		
		System.out.println("\nSize " + voc.size());
		System.out.println("Capacity " + voc.capacity());

	}
}
