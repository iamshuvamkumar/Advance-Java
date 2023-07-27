/* HasCode method give the object memory location code  and a same object are same value he's provide same location in heap memory location
 *  than any value has been change he's provide defrent hasCode  -> hasadecimealcode*/
package Collection.ArrayList;

import java.util.ArrayList;

public class HasCodeMethod {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Size of arraylist is => "+al.size()+" <= Is arrylist is empty => "+al.isEmpty()+" <= hascode of arraylist => "+al.hashCode());
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(13);
		System.out.println("Size of arraylist is => "+al.size()+" <= Is arrylist is empty => "+al.isEmpty()+" <= hascode of arraylist => "+al.hashCode());
	
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		System.out.println("Size of arraylist1 is => "+al1.size()+" <= Is arrylist1 is empty => "+al1.isEmpty()+" <= hascode of arraylist1 => "+al1.hashCode());
		al1.add(10);
		al1.add(11);
		al1.add(12);
		al1.add(13);
		System.out.println("Size of arraylist1 is => "+al1.size()+" <= Is arrylist1 is empty => "+al1.isEmpty()+" <= hascode of arraylist1 => "+al1.hashCode());
       System.out.println(" Equal mehtod"+al.equals(al1));
		al1.add(10);
		al1.add(12);
		al1.add(1);
		al1.add(13);
		
		System.out.println("Size of arraylist1 is => "+al1.size()+" <= Is arrylist1 is empty => "+al1.isEmpty()+" <= hascode of arraylist1 => "+al1.hashCode());
		
		
	}
}
