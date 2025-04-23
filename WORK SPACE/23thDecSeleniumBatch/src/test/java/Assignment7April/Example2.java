package Assignment7April;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Example2{
    
    
    	public static void main(String[] args)throws IOException {
    		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\AppDeta.Propertyfile");
    		Properties prop=new Properties();
    		prop.load(fis);
        }

		private Properties properties;
        
        String iphoneSearch = properties.getProperty("iphone_search");
        String birthdayGiftSearch = properties.getProperty("birthday_gift_search");
        String threeIdiotsSearch = properties.getProperty("three_idiots_search");

        // Set up WebDriver (ChromeDriver in this case)
        WebDriver driver = new ChromeDriver();

        
       
    

    public static WebDriver setUp(String browserName,String appUrl) {
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(appUrl);
		return driver;
	}


		
	}


