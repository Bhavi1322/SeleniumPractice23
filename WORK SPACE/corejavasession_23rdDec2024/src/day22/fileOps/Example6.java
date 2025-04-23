package day22.fileOps;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Example6 {

	public static void main(String[] args) throws IOException {
		String filePath=".\\TestData\\AppData.properties";
		FileInputStream fis=new FileInputStream(filePath);
		Properties prop=new Properties();
		prop.load(fis);

		String url=prop.getProperty("appUrl");
		System.out.println("URL: "+url);
		System.out.println("Username: "+prop.getProperty("username"));
		System.out.println("Password: "+prop.getProperty("password"));
		System.out.println("Subject: "+prop.getProperty("subject"));
		
		prop.setProperty("SubjectDetails", "API, Mobile Testing");
		prop.setProperty("password", "xyz@123");
		prop.remove("subject");
		FileOutputStream fos=new FileOutputStream(filePath);
		prop.store(fos, "Added additional details by Shailesh");
		fos.flush();
		fos.close();
		System.out.println("Updated file.....");
	}
}
/*
Identify File Path:
	1. Absolute path: starting from the root till the target element
					  F:\Workplaces\CoreJava_Workspace\23thDec2024CoreJava\TestData\AppData.properties
	2. Relative path: indirect path
					 .\TestData\AppData.properties
					
				where '.' indicates current working dir
				
			String currentWorkingDir=System.getProperty("user.dir");
			String filePath=currentWorkingDir+"\TestData\AppData.properties";

Steps to read data from property file:
	* First find the location where you have stored property file
	* Create an instance of FileInputStream class and pass the property file location to its constructor.
	* Create an instance of Properties class
	* With the help of properties reference variable call load() properties class and pass
      FileInputStream class reference to this method
  	* Call getProperty(key) of Properties class to read data from property file
*/



