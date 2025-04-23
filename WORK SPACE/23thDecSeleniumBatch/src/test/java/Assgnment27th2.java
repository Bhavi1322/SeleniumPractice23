
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgnment27th2 {

    public static void main(String[] args) {
       
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        try {
            //  Open the application URL
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            //  Locate and read the username and password from the login page (if visible)
            WebElement usernameField = driver.findElement(By.name("username"));
            WebElement passwordField = driver.findElement(By.name("password"));
            WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
            
            //  Enter the username and password (You can replace these values with actual ones if needed)
            usernameField.sendKeys("Admin");  // Replace with actual username
            passwordField.sendKeys("admin123");  // Replace with actual password
            
            //  Click the login button
            loginButton.click();

            // Wait for the page to load (this could be replaced with a better wait mechanism)
            Thread.sleep(5000);  // Just a simple delay (use WebDriverWait in real-world applications)

            //  Locate and click the logout button (once logged in)
            WebElement logoutMenu = driver.findElement(By.cssSelector("a[href='/web/index.php/auth/logout']"));
            logoutMenu.click();

            // Wait for the logout process to complete
            Thread.sleep(2000);  // Simple delay to ensure logout happens

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.close();
        }
    }

		
	}


