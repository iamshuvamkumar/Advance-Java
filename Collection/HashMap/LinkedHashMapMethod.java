package Collection.HashMap;

import java.io.ObjectInputStream.GetField;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapMethod {

	public static void main(String[] args) {
		 LinkedHashMap<Integer, String> hm=new LinkedHashMap<Integer, String>(); 
		 hm.put(1, "Binay");
		 hm.put(5, "Ranjeet");
		 hm.put(2, "Ranjeet");
		 hm.put(3, "Bikash");
		 hm.put(6,"Lalu");
		 hm.put(4,"Raju");
		//hm.remove(5);
		 System.out.println(hm);
		 /*Set s=hm.entrySet();
		 Iterator itr= s.iterator();*/
		 
		 Set<Entry<Integer, String>>  s=hm.entrySet();
		 Iterator<Entry<Integer, String>>   itr= s.iterator();
		 System.out.println("Id \t" +" name ");
		 while(itr.hasNext()){
			 Map.Entry<Integer, String> e=(Map.Entry<Integer, String>)itr.next();
			 Integer id=(Integer)e.getKey();
			 String name = (String)e.getValue();
			 System.out.print(id.intValue()+"\t"+name+"\n");     
	     }
 }
}
