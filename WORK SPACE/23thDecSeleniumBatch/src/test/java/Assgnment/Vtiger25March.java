package Assgnment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vtiger25March{

    public static void main(String[] args) {
        // Step 1: Set up WebDriver using WebDriverManager to automatically manage ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Step 2: Launch Vtiger application
            driver.get("https://your-vtiger-url.com");  // Replace with the actual Vtiger login URL

            // Step 3: Log in to the application using provided credentials
            WebElement usernameField = driver.findElement(By.id("username"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.id("loginButton"));

            usernameField.sendKeys("your-username");  // Replace with your actual username
            passwordField.sendKeys("your-password");  // Replace with your actual password
            loginButton.click();

            // Step 4: Wait for the home page to load and validate that it has loaded
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement homePageElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("homePageElementId"))); // Use a unique element ID on the homepage

            if (homePageElement.isDisplayed()) {
                System.out.println("Home page is displayed successfully.");
            } else {
                System.out.println("Home page validation failed.");
            }

            // Step 5: Log out from the application
            WebElement userMenu = driver.findElement(By.id("userMenu"));  // Replace with actual element for user menu
            userMenu.click();

            WebElement logoutButton = driver.findElement(By.linkText("Logout"));  // Replace with actual logout link text or element
            logoutButton.click();

            // Step 6: Validate logout by ensuring the login page is displayed
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username"))); // Ensure the login page is visible
            System.out.println("Successfully logged out from the application.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Step 7: Close the browser
            driver.quit();
        }
    }
}






public class Vtiger25March {

}
