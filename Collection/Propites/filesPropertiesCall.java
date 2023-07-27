package Collection.Propites;

import java.io.FileInputStream;
import java.util.Properties;

public class filesPropertiesCall {

	public static void main(String[] args) {
		try {
		FileInputStream fis  = new FileInputStream("D:\\Workshop\\Java\\Javap\\Home Work\\Advance-Java\\Collection\\Propites\\axc.Properties");
        Properties prop = new Properties();
        prop.load(fis);
		String drive = (String)prop.get("drive");
		String url  = (String)prop.get("url");
		String user  = (String)prop.get("user");
		String pass  = (String)prop.get("pass");
		System.out.println(drive);
		System.out.println(url);
		System.out.println(user);
		System.out.println(pass);
		}
        catch(Exception e) {
        	e.printStackTrace();
        }
	}

}
