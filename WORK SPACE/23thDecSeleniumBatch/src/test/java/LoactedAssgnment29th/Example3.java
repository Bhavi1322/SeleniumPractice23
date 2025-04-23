package LoactedAssgnment29th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



 public class Example3{
    public static void main(String[] args) {
        
        //  Initialize the ChromeDriver with options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Open browser maximized
        WebDriver driver = new ChromeDriver(options);

        // Open Myntra application URL
        driver.get("https://www.myntra.com");

        //  Get and print the title of the page, then count and print the character count of the title
       
        WebElement pageTitleField = driver.findElement(By.id("PageTitle")); // Locator for the email input field
        pageTitleField.clear();
        pageTitleField.sendKeys("");

     
        //  Validate the application title
       // String expectedTitle = "Myntra"; // Modify this based on your expected title
        WebElement passwordField = driver.findElement(By.id("Title")); // Locator for the password input field
        TitleField.clear();
        TitleField.sendKeys("Myntra");

        if (pageTitle.contains(expectedTitle)) {
            System.out.println("Title Validation Passed!");
        } else {
            System.out.println("Title Validation Failed!");
        }

        // Get and print the URL of the page, then count and print the character count of the URL
        String pageURL = driver.getCurrentUrl();
        System.out.println("Page URL: " + pageURL);
        System.out.println("URL Character Count: " + pageURL.length());

        // Get the page source and print the character count of the source code
        String pageSource = driver.getPageSource();
        System.out.println("Source Code Character Count: " + pageSource.length());

        // Close the browser
        driver.quit();
    }
 }








	
		

	


