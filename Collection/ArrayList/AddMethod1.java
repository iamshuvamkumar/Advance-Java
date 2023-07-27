/* add Method element in using index  it's work on the index element when you pass any index value it was take a index postion and current index value shift 1 index  */
package Collection.ArrayList;

import java.util.ArrayList;

public class AddMethod1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		System.out.println("Check ArrayList Before IsEmpty :=> " + al.isEmpty());
		System.out.println("Size of array " + al.size());

		al.add(55);
		al.add(1);
		al.add(5);
		al.add(85);
		al.add(95);
		System.out.println("Befor Shifting Value " + al);
		/*------------------------add index method ------------------------*/
		al.add(1, 10); // index no 1 and add value is 10
		System.out.println("After add Index Method Shifting Value " + al);

		System.out.println("Check ArrayList Before IsEmpty :=> " + al.isEmpty());
		System.out.println("Size of array " + al.size());

	}

}
