package LoactedAssgnment29th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example1 {

    public static void main(String[] args) {
     
        // Initialize the Chrome browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Open browser maximized
        WebDriver driver = new ChromeDriver(options);

        //  Open the application URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //  Clear the existing text and enter the username "Admin"
        WebElement usernameField = driver.findElement(By.name("username")); // Locator for the username field
        usernameField.clear();
        usernameField.sendKeys("Admin");

        // Clear the existing text and enter the password "admin123"
        WebElement passwordField = driver.findElement(By.name("password")); // Locator for the password field
        passwordField.clear();
        passwordField.sendKeys("admin123");

        //  Click on the login button
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']")); // Locator for the login button
        loginButton.click();

        // Validate the home page (checking if the 'Dashboard' header is visible)
        try {
            WebElement dashboardElement = driver.findElement(By.xpath("//h1[text()='Dashboard']")); // Locator for the 'Dashboard' header
            if (dashboardElement.isDisplayed()) {
                System.out.println("Login successful and home page validated.");
            } else {
                System.out.println("Login failed or home page not validated.");
            }
        } catch (Exception e) {
            System.out.println("Error: Unable to validate the home page.");
        }

        //  Close the browser
        driver.close();
    }
}



	
		
	


