package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArryList1 {

	public static void main(String[] args) {
	  ArrayList<Integer> al  = new ArrayList<Integer>();
	  int x[] = {1,2,3,4,5,6,7,8,9,-1,-2,-3,-4,-5,-6,-7,-8,-9};
	  for(int i=0;i<x.length;i++) {
		  al.add(x[i]);
	  }
   //  System.out.println(al);
   Iterator  itr = al.iterator();
   while (itr.hasNext()) {
	Integer num = (Integer) itr.next();
	//System.out.println(num.intValue());
	if(num.intValue()<0) {
		itr.remove();
	}
}
   Iterator  itr1 = al.iterator();
   while (itr1.hasNext()) {
   System.out.print(" "+((Integer)itr1.next()).intValue());
	
}
	  
	}
}
