package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArryList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		al.add(17);
		al.add(18);
		al.add(19);
		al.add(20);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al);
		
		System.out.println();
		Object[] in = al.toArray();
		for(int i =0 ; i<in.length;i++) {
			System.out.println(in[i]);
		}
		System.out.println();
		for(Integer ing : al) {
			System.out.println(ing);
		}
		System.out.println();
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Integer iobj = (Integer)itr.next();
			System.out.println(iobj.intValue());
		}
		
		

	}

}
