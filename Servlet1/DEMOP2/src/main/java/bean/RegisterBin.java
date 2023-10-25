package bean;
import dao.EmpDao;
public class RegisterBin {
	private int id;
	private String name;
	private String password;
	private int mob;
	private String email;

	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public int getMob() {
		return mob;
	}



	public void setMob(int mob) {
		this.mob = mob;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}

public boolean register() {
	return new EmpDao().registerSt(this);
}

	public static void main(String[] args) {

	}

}
