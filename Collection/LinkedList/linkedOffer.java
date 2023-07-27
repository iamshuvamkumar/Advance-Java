package Collection.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedOffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 3;
		LinkedList<Integer> al = new LinkedList<Integer>();
		 for(int i=0;i<10;i++) {
			 al.add(i*2+a);
			 // al.add(sc.nextInt());
	     }
       al.forEach(e->System.out.print(" "+e));
       System.out.println("\n"+al.offer(12));
       al.forEach(e->System.out.print(" "+e));
	
	   System.out.println("\n"+al.offerFirst(10));
       al.forEach(e->System.out.print(" "+e));
       System.out.println("\n"+al.offerLast(50));
       al.forEach(e->System.out.print(" "+e));
	}

}
