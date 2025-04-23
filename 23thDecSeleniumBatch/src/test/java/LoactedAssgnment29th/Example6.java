package LoactedAssgnment29th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example6 {

    public static void main(String[] args) {
       
        // Initialize ChromeDriver with options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Open browser maximized
        WebDriver driver = new ChromeDriver(options);

        //  Navigate to the Vtiger login page (replace the URL with the actual Vtiger login URL)
        driver.get("https://www.vtiger.com/login");

        //  Locate and input username
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("your_username");  // Replace with your username

        // Locate and input password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("your_password");  // Replace with your password

        //  Locate and click the login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        //  Validate that we have successfully logged in by checking the presence of a home page element
        try {
            WebElement homePageElement = driver.findElement(By.xpath("//span[text()='Home']")); // Assuming 'Home' is on the home page
            if (homePageElement.isDisplayed()) {
                System.out.println("Home page validation passed - 'Home' is visible.");
            } else {
                System.out.println("Home page validation failed - 'Home' is not visible.");
            }
        } catch (Exception e) {
            System.out.println("Home page validation failed - Error: " + e.getMessage());
        }

        // Log out from the application
        WebElement userProfileMenu = driver.findElement(By.xpath("//span[@class='userProfileName']"));
        userProfileMenu.click();  // Click on the user profile dropdown
        WebElement logoutButton = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
        logoutButton.click();  // Click on logout button

        // Close the browser
        driver.close();
    }
}

		

	

