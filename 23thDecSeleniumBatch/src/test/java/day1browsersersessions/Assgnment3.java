package day1browsersersessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgnment3 {
	public static void main(String[] args) {
		//open browser-chorme
		
	  WebDriver driver=new ChromeDriver();
				//enter require application URL
		 driver.get("https://demowebshop.tricentis.com");
			//get application title of the page, print it, and count the character count 
 	 String actualTitle=driver.getTitle(); 				 
 	 String expectedTitle="Demo Web Shop";
 	 System.out.println("Application title: "+actualTitle);
 	 System.out.println("Title Character Count: "+actualTitle.length());
 	 if(actualTitle.equals(expectedTitle)) {
	System.out.println("Application opened, Test Case");
	}else {
	System.out.println("Application not opened, Test Case failed");
	}
		//get application current title URL ,print it ,and count the Character count
	String CurrentUrl=driver.getCurrentUrl();
	System.out.println("Current url: "+driver.getCurrentUrl());
	System.out.println("URL Character Count: "+CurrentUrl.length());
		//get application page source code using Character count that will return in String form
	String source=driver.getPageSource();
	System.out.println("Source Character Count: "+source.length());
		//close current browser instance
	driver.close();
		}

	

}
