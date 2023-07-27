package Generic;

public class GenericMethod {
   public static<E> void show(E element) {
	   System.out.println(element.getClass().getName()+"=>   "+element);
	   
   }
	 
	public static void main(String[] args) {
	show(123);
	show("asd");
	show(454.5f);
	show(565.85);
	show((byte)123);
	show('C');
	}

}
