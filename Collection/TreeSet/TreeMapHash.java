package Collection.TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapHash {

	public static void main(String[] args) {
		TreeMap<Integer, String> ts = new TreeMap<Integer, String>();
		
		ts.put(6,"ff");
		ts.put(7,"gg");
		ts.put(8,"hh");
		ts.put(9,"ii");
		ts.put(10,"jj");
		
		ts.put(1,"aa");
		ts.put(2,"bb");
		ts.put(3,"cc");
		ts.put(4,"dd");
		ts.put(5,"ee");
		
		System.out.println(" "+ts);
       Set<Integer> keyset = ts.keySet();
		 Iterator<Integer> ite = keyset.iterator();
		 while (ite.hasNext()) {
			Integer in = (Integer) ite.next();
			System.out.println("  "+in+" "+ts.get(in));
		}
		 System.out.println(" Remove ob "+ts.remove(4));
//		 System.out.println(ts.remove(3, "cc"));

		 Set<Integer> k2 = ts.keySet();
		 Iterator<Integer> ite1 = k2.iterator();
		 for(Object ob : k2 ) {
			 System.out.println(" "+ob+" "+ts.get(ob));
		 }
		 System.out.println(" First Key "+ts.firstKey());
		 System.out.println(" Last Key "+ts.lastKey());
		 
		 System.out.println(" Head map Before  "+ts.headMap(3));
		 System.out.println(" Head map Before  "+ts.headMap(6));
		 
		 System.out.println(" TailMap From 6 "+ts.tailMap(6));
		 System.out.println(" TailMap From 8 "+ts.tailMap(8));
		 
		 System.out.println(" Sub Map "+ts.subMap(7, 9));
		 
		 System.out.println(" FloorKey "+ts.floorKey(5));
        
		 System.out.println(" Replace  "+ts.replace(5, "zz"));
		 
		  Set<Integer> k3 = ts.keySet();
		  Iterator<Integer> itr3 = k3.iterator();
		  for(Object ob : k3) {
			  System.out.println(" "+ob + " "+ts.get(ob));
		  }
		  
		  System.out.println(" ContainsKey "+ts.containsKey(5));
		  
		  System.out.println(" LowerKey "+ts.lowerKey(3));
		  System.out.println(" higherKey "+ts.higherKey(6));
		  
		  System.out.println(" ceilingEntry "+ts.ceilingEntry(6));
		  
		  System.out.println(" descendingKeySet "+ts.descendingKeySet());
		  System.out.println(" descendingMap " +ts.descendingMap());
		  
	}

}
