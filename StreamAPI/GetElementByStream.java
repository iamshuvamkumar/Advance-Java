package StreamAPI;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GetElementByStream {

	public static void main(String[] args) {
		String []name = {"Ram","Shyam","Hunman","Shiv","Shivani","arti","Anjali","magha"};
	    Stream<String> Sname = Stream.of(name);
		Sname.forEach(e->System.out.print(" "+e));
		
		System.out.println("\n Array Int");
		int x[] = {1,2,3,5,7,5,3,5,7,8,9,0};
		IntStream Ax = IntStream.of(x);
           Ax.forEach(e->System.out.print(" "+e));

       	ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(2);
		al.add(3);
		
		System.out.println("\n ArrayList ");
		Stream<Integer> arr = al.stream();
	     arr.forEach(e->System.out.print(" "+e));
	}

}
