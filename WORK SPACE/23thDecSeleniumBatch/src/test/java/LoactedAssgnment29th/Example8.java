package LoactedAssgnment29th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.After;

public class Example8{

    WebDriver driver;

    
    public void setUp() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        driver = new ChromeDriver();

        // Open the OrangeHRM login page URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    
    public void testLoginAndLogout() {
        // Read username and password from the login page
        WebElement usernameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("password"));
        
        // Enter username and password
        usernameField.sendKeys("Admin");  // Replace with actual username if needed
        passwordField.sendKeys("admin123");  // Replace with actual password if needed

        // Click on the Login button
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();

        // Validate login (for example, by checking if the dashboard page is displayed)
        WebElement dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
        Assert.assertTrue("Dashboard is not displayed after login", dashboard.isDisplayed());

        // Logout
        WebElement userMenu = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
        userMenu.click();
        
        WebElement logoutButton = driver.findElement(By.linkText("Logout"));
        logoutButton.click();

        // Validate that the login screen is displayed again (by checking the presence of the login button)
        WebElement loginButtonAfterLogout = driver.findElement(By.cssSelector("button[type='submit']"));
        Assert.assertTrue("Login button is not visible after logout", loginButtonAfterLogout.isDisplayed());
    }

    
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
