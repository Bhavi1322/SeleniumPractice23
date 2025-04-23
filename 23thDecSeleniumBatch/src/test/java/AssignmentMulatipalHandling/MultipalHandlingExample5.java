package AssignmentMulatipalHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class MultipalHandlingExample5 {

    public static void main(String[] args) {
        // Set up ChromeOptions (optional, for headless mode)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");  // Run in headless mode (no GUI)

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver(options);

        try {
            // Navigate to the Demo Web Shop login page
            driver.get("https://demowebshop.tricentis.com/");

           
            // Click on "Log in" link
            WebElement loginLink = driver.findElement(By.linkText("Log in"));
            loginLink.click();

          
            // Fill out the login form
            WebElement emailField = driver.findElement(By.id("Email"));
            WebElement passwordField = driver.findElement(By.id("Password"));
            emailField.sendKeys("tester01@vomoto.com");
            passwordField.sendKeys("Abc@12345");

            // Click the login button
            WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log in']"));
            loginButton.click();

            
            // Navigate to a product category (e.g., "Books") to view products
            driver.get("https://demowebshop.tricentis.com/books");

            
            // Get all product names and prices
            List<WebElement> products = driver.findElements(By.cssSelector(".product-item"));

            // Loop through the products and print product name and price
            for (WebElement product : products) {
                // Get product name
                WebElement productNameElement = product.findElement(By.cssSelector(".product-title a"));
                String productName = productNameElement.getText();

                // Get product price
                WebElement priceElement = product.findElement(By.cssSelector(".price"));
                String price = priceElement.getText();

                // Print product name and price
                System.out.println("Product Name: " + productName + " | Price: " + price);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser after the task is completed
            driver.quit();
        }
    }
}


