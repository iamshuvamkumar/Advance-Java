package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListArray {
	String str;
	ListArray(){}
	ListArray(String str){
		this.str=str;
	}
 public String toString() {
	 return str;
 }
	public static void main(String[] args) {
		ListArray la = new ListArray("df");
		System.out.println(la);
    List a = new ArrayList();
    System.out.println("the size of list is "+a.size());
    System.out.println(" is list Is emty "+a.isEmpty());
    a.add(51);
    a.add("hgfd");
    a.add(new Float(45.5f));
    a.add(5454.452);
    System.out.println(a.add(45454.5544444));
	}

}
