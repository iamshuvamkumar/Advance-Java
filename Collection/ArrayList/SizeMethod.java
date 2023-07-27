package Collection.ArrayList;

import java.util.ArrayList;

public class SizeMethod {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
	/*-------------------------Size-Method----------------------------*/
		System.out.println("Before Size "+al.size()); // size method to check a array length 
		al.add(45);  //add method to add a value in arraylist
		al.add(44);
		al.add(47);
		al.add(84);
    /*-------------------------Size-Method----------------------------*/
		 	System.out.println("Afer Size "+al.size());
		
	}

}
