package day8keyboardAndMouseOps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import java.time.Duration;

public class AssignmentMouseOver {
    public static void main(String[] args) {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Maximize window and set timeout
       // driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open ESPN 
        driver.get("https://www.espncricinfo.com/");

        try {
            // Wait for the page to load
            Thread.sleep(1000); // Optional, depends on your network speed

            // Find the "Series" menu item to hover over
            WebElement seriesMenu = driver.findElement(By.xpath("//div[@role='navigation']//span[text()='Series']"));

            // Create Actions object
            Actions actions = new Actions(driver);

            // Perform mouse hover
            actions.moveToElement(seriesMenu).perform();

            // Pause to visually verify hover (not required for automation, only for demo)
            Thread.sleep(3000);

            System.out.println("Mouse hover over 'Series' menu successful!");

       } catch (Exception e) {
           System.out.println("Error: " + e.getMessage());
        }
    }

}
