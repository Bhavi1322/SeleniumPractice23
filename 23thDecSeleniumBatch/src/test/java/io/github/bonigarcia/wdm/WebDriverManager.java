package io.github.bonigarcia.wdm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverManager{

    public static void main(String[] args) {
        // Step 1: Set up WebDriver using WebDriverManager for automatic ChromeDriver setup
        ((Object) WebDriverManager.chromedriver()).setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Step 2: Launch OrangeHRM application
            driver.get("https://opensource-demo.orangehrmlive.com/"); // Replace with your app URL if needed

            // Step 3: Log in to the application
            WebElement usernameField = driver.findElement(By.id("txtUsername"));
            WebElement passwordField = driver.findElement(By.id("txtPassword"));
            WebElement loginButton = driver.findElement(By.id("btnLogin"));

            usernameField.sendKeys("Admin");  // Replace with your actual username
            passwordField.sendKeys("admin123"); // Replace with your actual password
            loginButton.click();

            // Step 4: Wait for the home page to load and validate
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement homePageElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu_dashboard_index")));

            // Validate the home page by checking if the dashboard element is displayed
            if (homePageElement.isDisplayed()) {
                System.out.println("Home page is displayed successfully.");
            } else {
                System.out.println("Home page validation failed.");
            }

            // Step 5: Log out from the application
            WebElement welcomeMenu = driver.findElement(By.id("welcome"));
            welcomeMenu.click();

            WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout")));
            logoutButton.click();

            // Step 6: Validate Logout by checking if the login page is displayed again
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtUsername"))); // Wait for login page to appear

            System.out.println("Successfully logged out from the application.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Step 7: Close the browser
            driver.quit();
        }
    }

	public static Object chromedriver() {
		// TODO Auto-generated method stub
		return null;
	}
}