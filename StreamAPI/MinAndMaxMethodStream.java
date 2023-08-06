package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class MinAndMaxMethodStream {
  public static void main(String[] args) {
	  List<Integer> alist = Arrays.asList(0,1,4,6,3,7,2,5,9,8);
	 
	  System.out.println("Max Integer "+alist.stream().max((x,y)->x.compareTo(y)).get());
	  
	  System.out.println("Min Integer "+alist.stream().min((x,y)->x.compareTo(y)).get());
}    
}
