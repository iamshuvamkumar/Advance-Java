/*AddAllIndex it to add (Element/Value )  when you pass index number to add value and current value every index value to shift */
package Collection.ArrayList;

import java.util.ArrayList;

public class AddAllIndexMethod {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		System.out.println("Check ArrayList Before IsEmpty :=> " + al.isEmpty());
		System.out.println("Size of array " + al.size());
       
		al.add(12);
		al.add(14);
		al.add(13);
		al.add(47);
		al.add(21);
		System.out.println("before add " + al);

		System.out.println("Check ArrayList Before IsEmpty :=> " + al.isEmpty());
		System.out.println("Size of array " + al.size());

		ArrayList<Integer> al1 = new ArrayList<Integer>();

		System.out.println("Check ArrayList Before IsEmpty :=> " + al1.isEmpty());
		System.out.println("Size of array " + al1.size());

		al1.add(78);
		al1.add(44);
		al1.add(56);
		al1.add(1);
		al1.add(3);
		al1.add(8);
		
		System.out.println("After add " + al.addAll(1, al1));
		System.out.println("Addall (element) al1 to al " + al);

		System.out.println("Check ArrayList Before IsEmpty :=> " + al.isEmpty());
		System.out.println("Size of array " + al.size());

	}

}
