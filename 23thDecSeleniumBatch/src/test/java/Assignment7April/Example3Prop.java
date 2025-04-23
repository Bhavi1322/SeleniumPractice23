package Assignment7April;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example3Prop {

	public static void main(String[] args)throws IOException {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\AppDeta.Propertyfile");
		Properties prop=new Properties();
		prop.load(fis);
	
		WebDriver driver=setUp(prop.getProperty("browsername"), prop.getProperty("url"));
		driver.findElement(By.id("iphone16pro max")).sendKeys(prop.getProperty("iphone16pro max print title"));
		driver.findElement(By.name("Birthday gift")).sendKeys(prop.getProperty("Brithday gift,print title"));
		driver.findElement(By.id("3 idiots book ")).sendKeys(prop.getProperty("3 idiots book,print title"));
		
		String expectedTitle=prop.getProperty("expectedTitle");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		String actualTitle=driver.getTitle();
		System.out.println("search products");

	}
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
