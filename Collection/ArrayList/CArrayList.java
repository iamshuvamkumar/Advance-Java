package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class CArrayList {

	public static void main(String[] args) {
	 ArrayList al = new ArrayList();
     System.out.println("Array is empty :=> "+al.isEmpty()+" <=: Array size :=> "+al.size());
     
	 al.add(454); 
     al.add(54.554f);
     al.add(454842);
     al.add("asas");
     al.add(145.582);
     al.add('s');
     al.add((byte)123);
     al.add(34567L);
     System.out.println("Array is empty :=> "+al.isEmpty()+" <=: Array size :=> "+al.size());
     System.out.println(al);
     
     System.out.println("\nItreate the list using for:each loop");
     
     for(Object obj : al) {
    	 System.out.print(" "+obj);
     }
     
     System.out.println("\n\n`Itreate the list using for loop");
     Object oArr[] = al.toArray();
     for(int i=0;i<oArr.length;i++) {
    	 System.out.print(" "+oArr[i]);
     }
     System.out.println("\n`\n Itreate the list using Itreate while loop");
     Iterator itr = al.iterator();
     while (itr.hasNext()) {
		Object object = (Object) itr.next();
		System.out.print(" "+object);
		
	}
	}
}
