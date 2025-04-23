package LoactedAssgnment29th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example2 {


    public static void main(String[] args) {

        // Initialize Chrome browser with options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Open browser maximized
        WebDriver driver = new ChromeDriver(options);

        // Open the application URL
        driver.get("https://demowebshop.tricentis.com/login");

        // Clear existing text and enter the email (username) "tester01@vomoto.com"
        WebElement emailField = driver.findElement(By.id("Email")); // Locator for the email input field
        emailField.clear();
        emailField.sendKeys("tester01@vomoto.com");

        //  Clear existing text and enter the password "Abc@12345"
        WebElement passwordField = driver.findElement(By.id("Password")); // Locator for the password input field
        passwordField.clear();
        passwordField.sendKeys("Abc@12345");

        // Click on the login button
        WebElement loginButton = driver.findElement(By.cssSelector("input.button-1.login-button")); // Locator for the login button
        loginButton.click();

        //  Validate the home page (check if the logout button is visible)
        try {
            // Validate successful login by checking if 'logout' button is visible
            WebElement logoutButton = driver.findElement(By.linkText("Log out")); // Locator for the 'Log out' link
            if (logoutButton.isDisplayed()) {
                System.out.println("Login successful and home page validated.");
            } else {
                System.out.println("Login failed or home page not validated.");
            }
        } catch (Exception e) {
            System.out.println("Error: Unable to validate the home page. " + e.getMessage());
        }

        // Close the browser
        driver.close();
    }
}





		
	


