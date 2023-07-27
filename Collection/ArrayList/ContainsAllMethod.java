/* ContainsAll Method is (compaier / check ) list1 elements to check list2 element is exist or not  
 * containsAll method is a boolean type method he's give only true or false */

package Collection.ArrayList;

import java.util.ArrayList;

public class ContainsAllMethod {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("list al1 size is "+al.size()+" isEmpty "+al.isEmpty());

		al.add(40);
		al.add(41);
		al.add(42);
		al.add(43);
		al.add(44);

		System.out.println("list al1 size is "+al.size()+" isEmpty "+al.isEmpty());

		ArrayList<Integer> al1 = new ArrayList<Integer>();
	
		System.out.println("list al1 size is "+al1.size()+" isEmpty "+al1.isEmpty());
		
		al1.add(10);
		al1.add(10);
		al1.add(10);
		al1.add(10);
		al1.add(10);
		al1.add(10);
		al1.add(10);

		System.out.println("List al1 size "+al1.size()+" isEmpty "+al1.isEmpty());
	    System.out.println("ContainAll "+al.containsAll(al1)); // give ans is false becouse list al check list al1
		
	    al1.add(40);
		al1.add(41);
		al1.add(42);
		al1.add(43);
		al1.add(44);
	
		 System.out.println("ContainAll "+al1.containsAll(al)); //give ans is true becouse list al1 check al
			
	}
}
