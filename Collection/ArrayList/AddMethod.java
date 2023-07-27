package Collection.ArrayList;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AddMethod {
  public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();  //Integer is genric 
	/*-------------------------add-Method-----------------------------------*/
	al.add(45);  //add method to add a value in arraylist etc.
	al.add(44);
	al.add(47);
	al.add(84);
   

	/*-------------------------add-Method-----------------------------------*/
	System.out.println("Add Element In ArrayList Using add Method ");
	System.out.println(" "+al);
	
	al.add(1,33);
	
	 Object[] arr = al.toArray();
	for(int i=0 ;i<arr.length;i++) {
		System.out.println(i+" "+arr[i] );
	}
	
	ListIterator<Integer> itr = al.listIterator();
	while(itr.hasNext()) {
		Integer nt = itr.next();
		System.out.print(" "+nt.intValue());
	}
	System.out.println();
	//itr.add(40);
	itr.remove();
	ListIterator<Integer> itr1 = al.listIterator();
	while(itr1.hasNext()) {
		Integer nt = itr1.next();
		System.out.print(" "+nt.intValue());
	}
	System.out.println();
	itr.add(10);
	
	while(itr.hasPrevious()) {
		Integer pre = itr.previous();
	   System.out.print(" "+pre);
	}
	System.out.println();
	itr.set(90);
	System.out.println( " "+al );
    System.out.println(" "+al.indexOf(47));
    System.out.println(" "+al.lastIndexOf(44));
}
}
