package Collection.Comp;

import java.util.Comparator;
import java.util.TreeSet;

class Temp{
	int salary;
	public Temp(int salary){
		this.salary = salary;
	}
	 public String toString() {
		 return (Integer.valueOf(salary)).toString();
	 }
}
class Comper implements Comparator<Temp>{
	 public int compare(Temp t1, Temp t2) {
		if(t1.salary > t2.salary)
			return 1;
		else if(t1.salary < t1.salary)
			return -1;
		else
			return 0;
		 
	 }
}


public class MyComp {

	public static void main(String[] args) {
	   Comper com = new Comper();
	   TreeSet<Temp> ts = new TreeSet<Temp>(com);
	  
	   ts.add(new Temp(2));
	   ts.add(new Temp(1));
	   ts.add(new Temp(4));
	   ts.add(new Temp(7));
	   ts.add(new Temp(11));
	  
	   ts.add(new Temp(12));
	   ts.add(new Temp(15));
	   ts.add(new Temp(9));
	   ts.add(new Temp(6));
	   ts.add(new Temp(79));
	   ts.add(new Temp(88));
	 
	   System.out.println("\n "+ts);
	}

}
