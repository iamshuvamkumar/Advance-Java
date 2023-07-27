/* Remove Method is remove spacific Element Which You pass in remove mathod and you should be give a object 
 * name like which is arrayList type is Integer so you pass :- new Integer(Value),new Float(value)..etc. */
package Collection.ArrayList;

import java.util.ArrayList;

public class RemoveMethod {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("list al1 size is "+al.size()+" isEmpty "+al.isEmpty());
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		System.out.println("list al1 size is "+al.size()+" isEmpty "+al.isEmpty());
		System.out.println(al.remove(new Integer(12)));
		al.forEach(e->System.out.print(" "+e));
	
		ArrayList<Float> lf  = new ArrayList<Float>();
		lf.add(14.2f);
		lf.add(12.2f);
		lf.add(11.2f);
		lf.add(2.2f);
		lf.forEach(e->System.out.print(" "+e));
		System.out.println("\nRemove Float element "+ lf.remove(new Float(2.2f)));
		lf.forEach(e->System.out.print(" "+e));
	}

}
