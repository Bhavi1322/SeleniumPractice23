package Assignment7April;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.IOException;
import java.util.Properties;
import java.util.List;

public class Example1{

    public static void main(String[] args) throws IOException {
        // Load the properties file
        Properties properties = new Properties();
       // FileInputStream file = new FileInputStream("config.properties");
       // properties.load(file);

        // Get the URL and search queries from the properties file
        String googleUrl = properties.getProperty("google_url");
        String searchSeleniumInterviewQue = properties.getProperty("search_Selenium interview Que");
        String searchManualInterviewQue = properties.getProperty("search_Manual interview Que");
        String searchAPIInterviewQue = properties.getProperty("search_API interview Que");

        // Set up WebDriver (Make sure to set the path for your chromedriver)
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);

        // Open Google
        driver.get(googleUrl);

        // Perform search and get suggestions for each query
        searchAndPrintSuggestions(driver,searchSeleniumInterviewQue);
        searchAndPrintSuggestions(driver,searchManualInterviewQue );
        searchAndPrintSuggestions(driver,searchAPIInterviewQue );

        // Close the driver
        driver.quit();
    }

    public static void searchAndPrintSuggestions(WebDriver driver, String query) {
        // Find the search input element and enter the query
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.clear();
        searchBox.sendKeys(query);

        // Get all suggestion elements
        List<WebElement> suggestions = driver.findElements(By.cssSelector("ul[role='listbox'] li"));

        // Print the suggestions
        System.out.println("Suggestions for '" + query + "':");
        for (WebElement suggestion : suggestions) {
            System.out.println(suggestion.getText());
        }
        System.out.println("------------------------------------------------");
    
		

	}

}
