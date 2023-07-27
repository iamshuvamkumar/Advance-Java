package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class BackWardHasPrevious {

	public static void main(String[] args) {
     ArrayList<Integer> al = new ArrayList<Integer>();
     for(int i=0;i<=5;i++) {
    	 al.add(i);
     }
      ListIterator<Integer> litr = al.listIterator();
     
      while(litr.hasNext()) {
     	 System.out.println(" "+litr.nextIndex()+" "+litr.next());
      }
      while(litr.hasPrevious()) {
    	 System.out.println(" "+litr.previousIndex()+" "+litr.previous());
     }
      
	}

}
