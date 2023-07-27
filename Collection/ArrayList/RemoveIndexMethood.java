/* Remove index is remove index value */
package Collection.ArrayList;

import java.util.ArrayList;

public class RemoveIndexMethood {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("list al1 size is "+al.size()+" isEmpty "+al.isEmpty());
		al.add(14);
		al.add(7);
		al.add(6);
		al.add(4);
		al.add(1);
		al.add(44);
		System.out.println("list al1 size is "+al.size()+" isEmpty "+al.isEmpty());
		al.forEach(e->System.out.print(" "+e));
		System.out.println("\n"+al.remove(2)+"\n");
		int i=0;
		al.forEach(e->System.out.print(" "+e));
		
		
	}

}
