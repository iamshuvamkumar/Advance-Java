package Collection.LinkedList;

import java.util.LinkedList;

public class RemoveFirstAndlast {

	public static void main(String[] args) {
     LinkedList <Integer> al = new LinkedList<Integer>();
     int a = 3;
     for(int i=0;i<10;i++) {
    	 al.add(a*i+2);
     }
     System.out.println(al); 
     al.removeFirst();  //this is used to remove list first element
     al.removeLast();   //this is used to remove list last element
     al.forEach(l->System.out.print(" "+l));
     
	}
}
