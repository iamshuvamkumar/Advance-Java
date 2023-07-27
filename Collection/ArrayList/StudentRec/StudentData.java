package Collection.StudentRec;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
		ArrayList<Student> stal = new ArrayList<Student>();
		stal.add(new Student("a", 101, "a.gmail.com", 123, "sdk"));
		stal.add(new Student("b", 102, "a.gmail.com", 123, "sdk"));
		stal.add(new Student("c", 103, "a.gmail.com", 123, "sdk"));
		stal.add(new Student("d", 104, "a.gmail.com", 123, "sdk"));

		Iterator<Student> itr = stal.iterator();
		ListIterator<Student> lis = stal.listIterator();
		System.out.println(" Id \tName\tEmail\t\t Address\tMarks ");
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(" " + st.getId() + "\t" + st.getName() + "\t" + st.getEmail() + "\t " + st.getMob()+ "\t\t" + st.getAddress());
		}
		
		System.out.println("Enter student data");
		Scanner sc = new Scanner(System.in);
		System.out.println("how much student you add ");
		int stdata = sc.nextInt();
		for(int i=0;i<stdata;i++) {
		Student st = new Student();
		System.out.print("Enter id > ");
		st.setId(sc.nextInt());
		System.out.print("Enter name > ");
		st.setName(sc.next());
		System.out.print("Enter email > ");
		st.setEmail(sc.next());
		System.out.print("Enter mob > ");
		st.setMob(sc.nextInt());
		System.out.print("Enter address > ");
		st.setAddress(sc.next());
		stal.add(st);
		}
		Iterator<Student> itr1 = stal.iterator();
		while (itr1.hasNext()) {
			Student std = (Student) itr1.next();
			System.out.println(" " + std.getId() + "\t" + std.getName() + "\t" + std.getEmail() + "\t\t" + std.getMob()+ "\t\t" + std.getAddress());
			}

	}
}
