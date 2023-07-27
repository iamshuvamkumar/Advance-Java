/*Remove all method it's remove only  same value in list al to list al1 if you pass like this al.removeall(al1) in this case al value is remove which match al1 and 
 * al1 is also remove 
 * and if you pass like this al1.removeall(al)  in this case al1 value is remove which match al */
// note :-  only who's value is exist in list  does not  match  
package Collection.ArrayList;

import java.util.ArrayList;

public class RemoveAllMethod {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		
		al.forEach(e->System.out.print(" "+e));
		System.out.println();
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
	
		al1.add(10);
		al1.add(16);
		al1.add(17);
		al1.add(18);
		al1.add(19);
		
		al.addAll(al1);
		
		al1.forEach(e->System.out.print(" "+e));
		System.out.println();
		al.forEach(e->System.out.print(" "+e));

		System.out.println("\n list al removeall list al1 "+al.removeAll(al1));  //al check al1 an al1 match al remove element
		System.out.println(" \n list al1 removeall list al "+al1.removeAll(al));  //al1 check al an al1 match al1 remove element
		System.out.println();
		
		System.out.print("al => ");
		al.forEach(e->System.out.print(" "+e));
		System.out.println();
		System.out.print("al1 => ");
	    al1.forEach(e->System.out.print(" "+e));
	}
}
