package AssignmentMulatipalHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.List;

public class MultipalHandlingExample2{

    public static void main(String[] args) {
        // Set the path to your chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Set up ChromeOptions to use Chrome in headless mode (optional)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run in headless mode if no GUI needed

        // Initialize the Chrome WebDriver
        WebDriver driver = new ChromeDriver(options);

        try {
            // Navigate to the GSMArena Phone Finder page
            driver.get("https://www.gsmarena.com/");

           

            // Click the "Phone Finder" menu item
            WebElement phoneFinderLink = driver.findElement(By.xpath("//a[@href='/phone-finder.php']"));
            phoneFinderLink.click();

            // Find the dropdown element containing phone brands
            WebElement brandDropdown = driver.findElement(By.id("select-brand"));

            // Get the list of all options in the dropdown (i.e., phone brands)
            List<WebElement> brandOptions = brandDropdown.findElements(By.tagName("option"));

            // Print the name of each brand (excluding the default "Select Brand" option)
            for (WebElement option : brandOptions) {
                String brandName = option.getText();
                if (!brandName.equals("Select Brand")) { // Exclude the "Select Brand" option
                    System.out.println("Brand: " + brandName);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser after the task is completed
            driver.quit();
        }
    }

}


