package AssignmentMulatipalHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;
import java.util.Set;

public class MulatipalHandlingExampale1 {

    public static void main(String[] args) {

        // Set up ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");  // Run in headless mode for non-GUI execution (optional)
        
        WebDriver driver = new ChromeDriver(options);

        try {
            // Navigate to DemoBlaze home page
            driver.get("https://www.demoblaze.com/");

           
            // Get the main window handle
            String mainWindowHandle = driver.getWindowHandle();

            // Find all device elements (names and prices)
            List<WebElement> devices = driver.findElements(By.xpath("//div[@class='card-block']"));

            // Loop through each device
            for (WebElement device : devices) {
                // Get device name
                String deviceName = device.findElement(By.xpath(".//h4/a")).getText();
                // Get device price
                String devicePrice = device.findElement(By.xpath(".//h5")).getText();
                
                // Print the device name and price
                System.out.println("Device: " + deviceName + " - Price: " + devicePrice);

                // Click on the device to open it in a new window/tab
                WebElement deviceLink = device.findElement(By.xpath(".//h4/a"));
                deviceLink.click();

              
                // Get all window handles and switch to the new window
                Set<String> allWindowHandles = driver.getWindowHandles();
                for (String windowHandle : allWindowHandles) {
                    if (!windowHandle.equals(mainWindowHandle)) {
                        driver.switchTo().window(windowHandle);
                        break;
                    }
                }

                // At this point, we are in the product detail page, but we won't extract more details in this example.
                // Close the product detail page and switch back to the main window
                driver.close();

                // Switch back to the main window
                driver.switchTo().window(mainWindowHandle);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser after execution
            driver.quit();
        }
    }

}
