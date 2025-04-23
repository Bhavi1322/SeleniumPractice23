package Assgnment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class March25Orangehrm {

    public static void main(String[] args) {
        // Set up WebDriver using WebDriverManager for automatic ChromeDriver setup
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            //  Launch OrangeHRM application
            driver.get("https://opensource-demo.orangehrmlive.com/"); // Replace with your app URL if needed

            // Log in to the application
            WebElement usernameField = driver.findElement(By.id("txtUsername"));
            WebElement passwordField = driver.findElement(By.id("txtPassword"));
            WebElement loginButton = driver.findElement(By.id("btnLogin"));

            usernameField.sendKeys("Admin");  // Replace with your actual username
            passwordField.sendKeys("admin123"); // Replace with your actual password
            loginButton.click();

            // Wait for the home page to load and validate
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement homePageElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("menu_dashboard_index")));

            // Validate the home page by checking if the dashboard element is displayed
            if (homePageElement.isDisplayed()) {
                System.out.println("Home page is displayed successfully.");
            } else {
                System.out.println("Home page validation failed.");
            }

            //  Log out from the application
            WebElement welcomeMenu = driver.findElement(By.id("welcome"));
            welcomeMenu.click();

            WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout")));
            logoutButton.click();

            //  Validate Logout by checking if the login page is displayed again
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtUsername"))); // Wait for login page to appear

            System.out.println("Successfully logged out from the application.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //  Close the browser
            driver.quit();
        }
    }
}
