package day22.fileOps;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class Example1 {

	public static void main(String[] args) throws IOException {
		String filePath="C:\\Users\\samad\\Downloads\\AUTOMATION SESSION\\WORK SPACE\\corejavasession_23rdDec2024\\src\\day21collectionexamples\\AppData.properties";
		             //or
		//String filePath="C:\Users\samad\Downloads\AUTOMATION SESSION\WORK SPACE\corejavasession_23rdDec2024\src\day21collectionexamples\AppData.properties";
        FileInputStream fis=new FileInputStream(filePath);
        
        Properties Prop=new Properties();
        
        Prop.load(fis);
        
        String url=Prop.getProperty("appUrl");
        System.out.println("URL:"+url);
        System.out.println("Username:"+Prop.getProperty("username"));
        System.out.println("Password:"+Prop.getProperty("Password"));
        System.out.println("Subject:"+Prop.getProperty("subject"));
        
        
	}

}
