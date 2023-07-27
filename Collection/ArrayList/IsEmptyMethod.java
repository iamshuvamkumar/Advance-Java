/* NOTE-:- isEmpty method to  check a Array is empty or not he's return boolean value true and false 
		 * |-in my language khali hai ya bhara hai */
		 
package Collection.ArrayList;
import java.util.ArrayList;

public class IsEmptyMethod {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		/*----------------------IsEmpty-Method -------------------------------------*/
		 System.out.println("Check ArrayList Before IsEmpty :=> "+al.isEmpty());
		 System.out.println("Size of array "+al.size());
		 
			al.add(45);  
			al.add(44);
			al.add(47);
			al.add(84);
			System.out.println("Size of array "+al.size());
			System.out.println("Check after Add Some value / element in arrayList :=> "+al.isEmpty());
			
	}

}
