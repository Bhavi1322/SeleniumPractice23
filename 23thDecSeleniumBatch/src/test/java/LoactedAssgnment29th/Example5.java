package LoactedAssgnment29th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;

public class Example5 {

    public static void main(String[] args) {

        // Initialize ChromeDriver with options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Open browser maximized
        WebDriver driver = new ChromeDriver(options);

        //  Navigate to the login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //  Locate and input username
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("Admin");

        //  Locate and input password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //  Locate and click the login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        // Validate that we have successfully logged in by checking the presence of the dashboard
        try {
            WebElement dashboardElement = driver.findElement(By.xpath("//h6[contains(text(),'Dashboard')]"));
            if (dashboardElement.isDisplayed()) {
                System.out.println("Home page validation passed - Dashboard is visible.");
            } else {
                System.out.println("Home page validation failed - Dashboard is not visible.");
            }
        } catch (Exception e) {
            System.out.println("Home page validation failed - Error: " + e.getMessage());
        }

        // Log out from the application
        WebElement userMenu = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
        userMenu.click();  // Click on the user menu
        WebElement logoutButton = driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']"));
        logoutButton.click();  // Click on logout

        //  Close the browser
        driver.close();
    }
}
