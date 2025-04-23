package LoactedAssgnment29th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example7 {

    public static void main(String[] args) {
       
        // Initialize ChromeDriver with options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Open browser maximized
        WebDriver driver = new ChromeDriver(options);

        //  Navigate to the Actitime login page
        driver.get("https://online.actitime.com/dec23/login.do");

        //  Locate and input username
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("admin01");  // Username: admin01

        // Locate and input password
        WebElement passwordField = driver.findElement(By.name("pwd"));
        passwordField.sendKeys("admin01");  // Password: admin01

        //  Locate and click the login button
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();

        //  Validate that we have successfully logged in by checking the presence of a home page element
        try {
            WebElement homePageElement = driver.findElement(By.xpath("//div[@id='container_tasks']")); // Assuming 'container_tasks' is part of the home page
            if (homePageElement.isDisplayed()) {
                System.out.println("Home page validation passed - Home page is visible.");
            } else {
                System.out.println("Home page validation failed - Home page is not visible.");
            }
        } catch (Exception e) {
            System.out.println("Home page validation failed - Error: " + e.getMessage());
        }

        //  Click on the Tasks tab
        WebElement tasksTab = driver.findElement(By.id("container_tasks"));
        tasksTab.click();

        // Validate that we have navigated to the Tasks page
        try {
            WebElement tasksPageElement = driver.findElement(By.xpath("//div[contains(@class, 'tasks') and text()='Tasks']"));
            if (tasksPageElement.isDisplayed()) {
                System.out.println("Tasks page validation passed - Tasks page is visible.");
            } else {
                System.out.println("Tasks page validation failed - Tasks page is not visible.");
            }
        } catch (Exception e) {
            System.out.println("Tasks page validation failed - Error: " + e.getMessage());
        }

        //  Come back to the home page
        driver.navigate().back();

        // Click on the Reports tab
        WebElement reportsTab = driver.findElement(By.id("container_reports"));
        reportsTab.click();

        //  Validate that we have navigated to the Reports page
        try {
            WebElement reportsPageElement = driver.findElement(By.xpath("//div[contains(@class, 'reports') and text()='Reports']"));
            if (reportsPageElement.isDisplayed()) {
                System.out.println("Reports page validation passed - Reports page is visible.");
            } else {
                System.out.println("Reports page validation failed - Reports page is not visible.");
            }
        } catch (Exception e) {
            System.out.println("Reports page validation failed - Error: " + e.getMessage());
        }

        //  Logout from the application
        WebElement logoutButton = driver.findElement(By.id("logoutLink"));
        logoutButton.click();  // Click on logout

        // Close the browser
        driver.close();
    }
}

		

	


