package Collection.StudentRec;

import java.util.ArrayList;
import java.util.Iterator;

public class Book {
   String name;
   int price;
   int qui;
     Book(){}
     Book(String name, int price,int qui){
    	 this.name =name;
    	 this.price=price;
    	 this.qui=qui;
     }
	public static void main(String[] args) {
		Book b1 = new Book("asd",1515,2);
		Book b2 = new Book("ad",155,3);
		Book b3 = new Book("as",115,4);
		ArrayList<Book> al = new ArrayList<Book>();
		al.add(b1);
		al.add(b2);
		al.add(b3);
	 
		Iterator<Book> itr = al.iterator();
		while (itr.hasNext()) {
			Book bk = (Book) itr.next();
			System.out.println(" "+bk.name+" "+bk.price+" "+bk.qui);
		}
	}
}
