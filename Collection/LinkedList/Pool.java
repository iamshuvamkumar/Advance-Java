package Collection.LinkedList;

import java.util.LinkedList;

public class Pool {

	public static void main(String[] args) {
		LinkedList<Integer> al = new LinkedList<Integer>();
		int a = 6;
		for(int i=0;i<10;i++) {
			al.add(i*a+4);
		}
		al.forEach(e->System.out.print(" "+e));
		System.out.println("\nPoll > "+al.poll());
		al.forEach(e->System.out.print(" "+e));
		System.out.println("\npollFirst > "+al.pollFirst());
		al.forEach(e->System.out.print(" "+e));
        System.out.println("\npolLast > "+al.pollLast());
        al.forEach(e->System.out.print(" "+e));
		
		
		
	}

}
