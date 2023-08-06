package StreamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithMethod {

	public static void main(String[] args) {
		List <String> al  =List.of("Ram","Shyam","Hunman","Shiv","Shivani","arti","Anjali","magha");
		System.out.println(" Get list");
		al.forEach(e->System.out.print(" "+e));
		
		List<String> str = al.stream().filter(e->e.startsWith("S")).collect(Collectors.toList());
		System.out.println("\n get List ");
		str.forEach(e->System.out.print(" "+e));
	
		
	}

}
