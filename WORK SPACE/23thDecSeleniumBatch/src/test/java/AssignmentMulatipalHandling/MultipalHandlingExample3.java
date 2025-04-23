package AssignmentMulatipalHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.List;


public class MultipalHandlingExample3  {

    public static void main(String[] args) {
      
        // Set up ChromeOptions (
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");  // Run in headless mode (no GUI)

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver(options);

        try {
            // Navigate to GSMArena homepage
            driver.get("https://www.gsmarena.com/");

            
            // Click the "Phone Finder" link
            WebElement phoneFinderLink = driver.findElement(By.id=phoneFinderLink);
            phoneFinderLink.click();


            // Click the "Samsung" brand link
            WebElement samsungLink = driver.findElement(By.xpath("//select[@id='select-brand']/option[contains(text(), 'Samsung')]"));
            samsungLink.click();

           
            // Extract device names under the "Samsung" brand
            List<WebElement> samsungDevices = driver.findElements(By.cssSelector("div.makers a"));

            // Print the names of the Samsung devices
            System.out.println("Samsung Devices:");
            for (WebElement device : samsungDevices) {
                String deviceName = device.getText();
                System.out.println(deviceName);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser after the task is completed
            driver.quit();
        }
    }
}
