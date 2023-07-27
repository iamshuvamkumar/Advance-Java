package Collection.Propites;

import java.util.Properties;

import java.io.*;

public class Propertiesdemo1 {

	public static void main(String[] args) {
    try {
		FileOutputStream fos = new FileOutputStream("D:\\Workshop\\Java\\Javap\\Home Work\\Advance-Java\\Collection\\Propites\\abx.Properties");
	System.out.println("File is create");
	Properties pro = new Properties();
	pro.put("1", "a");
	pro.put("2", "b");
	pro.put("3", "c");
	pro.store(fos, "abx.Properties");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
}
