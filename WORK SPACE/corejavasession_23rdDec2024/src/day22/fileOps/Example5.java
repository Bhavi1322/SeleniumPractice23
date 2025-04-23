package day22.fileOps;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Properties;
public class Example5 {

	public static void main(String[] args)throws IOException {
		String filepath=System.getProperty("user.dir")+"\\testDtata\\AppData.Properties";
		         //or
		//String filepath=System.getProperty("user.dir")+"\\testDtata\\AppData.Properties";
		 FileInputStream fis=new FileInputStream(filepath);
		 
		 Properties Prop=new Properties();
		 
		 Prop.load(fis);
		 String url=Prop.getProperty("appUrl");
			System.out.println("URL: "+url);
			System.out.println("Username: "+Prop.getProperty("username"));
			System.out.println("Password: "+Prop.getProperty("password"));
			System.out.println("Subject: "+Prop.getProperty("subject"));
		}
	}


