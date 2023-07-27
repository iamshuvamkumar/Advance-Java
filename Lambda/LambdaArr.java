package Lambda;

import java.util.ArrayList;

public class LambdaArr {
 public static void main(String[]args) {
	 ArrayList<Integer> al = new ArrayList<Integer>();
	 al.add(10);
	 al.add(20);
	 al.add(30);
	 al.add(40);
	 al.add(50);
	 System.out.println("ArrayList "+al);
	 // for Each Loop 
	 for(Integer i : al) {
		 System.out.print(" "+i);
	 }
	 System.out.println();
	 //foreach method
	 al.forEach(e->System.out.print(" "+e));
	 
	 System.out.println();
	 al.forEach(e->{
		 System.out.print(" "+e);
	 });
 }
}
