package Assgnment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipkart {

	public static void main(String[] args) {
		//Create a webDriver instance for chrome
		WebDriver driver = new ChromeDriver();
		
		//Navigate to the application URL
		String url ="https://www.flipkart.com";
		driver.get(url);

		//Get the title of the page,print it and count the character count
		String title = driver.getTitle();
		System.out.println("Page Title:"+title);
		System.out.println("Title Character count:"+title.length());
		//Validate the application title
		String expectedTitle = "Flipkart";
		if(title.equals(expectedTitle)) {
			System.out.println("Title validation passed.");
		
	}else {
		System.out.println("Title validation failed.Expected:"+expectedTitle);
		
	}
		//Get the currentUrl print it and count the character count
		String currentUrl= driver.getCurrentUrl();
		System.out.println("Current URL:"+currentUrl);
		System.out.println("URL character count:"+currentUrl.length());
		
		
		//get the current url print it and count the character count
		String PageSource = driver.getPageSource();
		System.out.println("Page Source Character count:"+PageSource.length());
		
		//close the browser

}
}