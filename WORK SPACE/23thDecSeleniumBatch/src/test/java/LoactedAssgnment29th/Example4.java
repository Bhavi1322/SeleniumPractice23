package LoactedAssgnment29th;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example4 {
    public static void main(String[] args) {
       

        //  Initialize ChromeDriver with options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Open browser maximized
        WebDriver driver = new ChromeDriver(options);

        //  Open OrangeHRM application URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //  Get and print the title of the page, then count and print the character count of the title
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        System.out.println("Title Character Count: " + pageTitle.length());

        //  Validate the application title
        String expectedTitle = "OrangeHRM"; // Modify this to match the actual title part or full title
        if (pageTitle.contains(expectedTitle)) {
            System.out.println("Title Validation Passed!");
        } else {
            System.out.println("Title Validation Failed!");
        }

        //  Get and print the URL of the page, then count and print the character count of the URL
        String pageURL = driver.getCurrentUrl();
        System.out.println("Page URL: " + pageURL);
        System.out.println("URL Character Count: " + pageURL.length());

        //  Get the page source and print the character count of the source code
        String pageSource = driver.getPageSource();
        System.out.println("Source Code Character Count: " + pageSource.length());

        // Close the browser
        driver.quit();
    }
}

		
