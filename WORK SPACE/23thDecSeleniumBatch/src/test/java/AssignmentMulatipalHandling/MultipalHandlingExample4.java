package AssignmentMulatipalHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class MultipalHandlingExample4{

    public static void main(String[] args) {
        // Set the path to your chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Set up ChromeOptions for headless browsing (optional)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");  // Uncomment for headless mode

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver(options);

        try {
            // Navigate to Google
            driver.get("https://www.google.com");

           
            // Type "Selenium" into the search box
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Selenium");

          
            // Get all suggestion elements
            List<WebElement> suggestions = driver.findElements(By.cssSelector("ul[role='listbox'] li span"));

            // Print the total count of suggestions
            System.out.println("Total Suggestions: " + suggestions.size());

            // Print each suggestion name
            System.out.println("Suggestions:");
            for (WebElement suggestion : suggestions) {
                System.out.println(suggestion.getText());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }

    }
}
