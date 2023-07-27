package Generic;

public class GenericArray {
	public static <E> void show(E[] elements){
	    Class c1 = elements.getClass();
	    System.out.println(c1.getName());
		for(Object obj : elements) {
			System.out.printf("%s ",obj);
		}
		System.out.println();
	}
	public static void main(String[] args) {
     Integer arr [] = {1,2,3};
     show(arr);
     Float farr[] = {23.23f,2.32f,3.2f};
     show(farr);
     Character carr []= {'S','H','U','V','A','M'};
     show(carr);
		
	}
}
