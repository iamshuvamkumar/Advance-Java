package Collection.StudentRec;

import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	private int id;
	private String email;
	private int mob;
	private String address;

	public Student() {
	}

	public Student(String name, int id, String email, int mob, String address) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.mob = mob;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setMob(int mob) {
		this.mob = mob;
	}

	public int getMob() {
		return mob;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
  /* public String toString() {
	   String data = " "+getName()+" "+getId()+" "+getEmail()+" "+getMob()+" "+getAddress()+" ";
	   return data;
   }
   */
}