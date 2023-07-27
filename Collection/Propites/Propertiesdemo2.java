package Collection.Propites;

import java.util.Properties;

import java.io.*;

public class Propertiesdemo2 {

	public static void main(String[] args) {
    try {
		FileInputStream fis = new FileInputStream("D:\\Workshop\\Java\\Javap\\Home Work\\Advance-Java\\Collection\\Propites\\abx.Properties");
	System.out.println("File is create");
	Properties pro = new Properties();
	pro.load(fis);
	
	String id = (String)pro.get("id");
	System.out.println(" Id Is ---> "+id);
	
	String one = (String)pro.get("1");
	System.out.println(" One Is ---> "+one);
	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
}
