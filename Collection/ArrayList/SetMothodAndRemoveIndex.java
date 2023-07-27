package Collection.ArrayList;

import java.util.ArrayList;

public class SetMothodAndRemoveIndex {

	public static void main(String[] args) {
		 ArrayList<Integer> al = new ArrayList<Integer>();
		 al.add(1);
		 al.add(2);
		 al.add(3);
		 al.add(4);
		 al.add(5);
		 
		 
		 al.add(1,6);
		 al.add(44);
		 al.add(41);
		 al.add(11);
		 al.add(2,7);
		 
		 Object[] arr = al.toArray();
		 for(int i = 0; i<arr.length;i++) {
			 System.out.println(" "+i+" "+arr[i]);
		 }
		 al.remove(8);
		 System.out.println("\n set method  "+al.set(5, 12)+" \n");
		 
		 al.remove(new Integer(2));
		 
		 Object[] arr1 = al.toArray();
		 for(int i = 0; i<arr1.length;i++) {
			 System.out.println(" "+i+" "+arr1[i]);
		 }

		
	}
}
