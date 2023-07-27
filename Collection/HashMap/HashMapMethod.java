package Collection.HashMap;

import java.io.ObjectInputStream.GetField;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMethod {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		System.out.println("Size "+hm.size());
		System.out.println("Isempty "+hm.isEmpty());
		System.out.println(hm);
		hm.put(121, "Ram");
		hm.put(122, "Rm");
		hm.put(123, "Rm");
		hm.put(124, "mam");
		hm.put(101, null);
		hm.put(null, null);
		hm.put(125, "kam");
		hm.put(126, "aam");
		
		System.out.println("Size "+hm.size());
		System.out.println("Isempty "+hm.isEmpty());
		
		System.out.println(hm);
		
		hm.put(null, "Abc");
		
		Set<Entry<Integer, String>> eSet = hm.entrySet();
		
		Iterator<Entry<Integer, String>> itr = eSet.iterator();
		
		System.out.println("\nkey \t value");
	
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>)itr.next(); 
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+" \t "+value);
		}
		Set<Integer> kset = hm.keySet();
         Iterator<Integer> itr1 = kset.iterator();
		System.out.println();
         while(itr1.hasNext()) {
		 Integer key =  itr1.next();
		 System.out.println(key+" "+hm.get(key));
		}
         System.out.println();
         
         Collection<String> str = hm.values();
         Iterator<String> itr2 = str.iterator();
        	while(itr2.hasNext()) {
        		System.out.print(" "+itr2.next());
        	}
        	
        	System.out.println("\nContainKey  "+hm.containsKey(111));
        	System.out.println("ContainKey  "+hm.containsKey(121));
        	System.out.println("ContainValue  "+hm.containsValue("hm"));
        	System.out.println("ContainKey  "+hm.containsValue("Ram"));
        	System.out.println("Remove "+hm.remove(111));
        	System.out.println("Remove "+hm.remove(123));
        	System.out.println("remove "+ hm.remove(121, "ram"));
        	System.out.println("remove "+ hm.remove(11, "Ram"));
        	System.out.println("remove "+ hm.remove(121, "Ram"));
        	System.out.println(hm);
        	System.out.println("Replace "+hm.replace(122, "ram"));
      HashMap<Integer , String> fi = new HashMap< Integer,String>();
      fi.put( 154,"a");
      fi.put(153,"b");
      fi.put(152,"c");
      fi.put(151,"d");
        hm.putAll(fi);	
       System.out.println(); 
        Set<Entry<Integer, String>> efi = hm.entrySet();
        Iterator<Entry<Integer, String>> it = efi.iterator();
        while(it.hasNext()) {
        	Map.Entry<Integer, String> etr = (Map.Entry<Integer, String>)it.next();
        	System.out.println(etr.getKey()+" "+etr.getValue());
        }
        
        System.out.println("\nForEach \n");
        
        Set<Integer> keySt = hm.keySet();
        Iterator<Integer> foi = keySt.iterator();
        for(Object ob : keySt) {
        	System.out.println(ob+" "+hm.get(ob));
        }
	}

}
