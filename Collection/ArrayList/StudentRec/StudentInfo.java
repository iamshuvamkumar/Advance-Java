package Collection.StudentRec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentInfo implements Serializable {
 private String name;
 private int age;
 private int cls;
  StudentInfo(){}
  StudentInfo(String name,int age,int cls){
	  this.name= name;this.age=age;this.cls=cls;
  }
  public void setName(String name) {
	  this.name = name;
  }
  public void setAge(int age) {
	  this.age=age;
  }
  public void  setCls(int cls) {
	  this.cls=cls;
  }
  public String getName() {
	  return name;
  }
  public int getAge() {
	  return age;
  }
  public int getCls() {
	  return cls;
  }
  public String toString() {
	  String str = getName()+" "+getAge()+" "+getCls();
	  return str;
  }
	public static void main(String[] args) {
		
      ArrayList<StudentInfo> st = new ArrayList<StudentInfo>();
      st.add(new StudentInfo("shk", 21, 12));
      st.add(new StudentInfo("shi", 20, 11));
      st.add(new StudentInfo("shm", 19, 10));
     Iterator<StudentInfo> itr = st.iterator();
     while (itr.hasNext()) {
		StudentInfo std = (StudentInfo) itr.next();
		System.out.println(" "+std.getName()+" "+std.getAge()+" "+std.getCls());
	}
     
	}

}
