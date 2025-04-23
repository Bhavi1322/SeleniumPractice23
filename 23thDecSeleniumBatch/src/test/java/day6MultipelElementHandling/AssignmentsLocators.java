

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class  AssignmentsLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        // Locate all the device names and prices
        List<WebElement> deviceNames = driver.findElements(By.cssSelector(".card-title"));
        List<WebElement> devicePrices = driver.findElements(By.cssSelector(".price"));

        // Print device names and their prices
        for (int i = 0; i < deviceNames.size(); i++) {
            System.out.println("Device Name: " + deviceNames.get(i).getText());
            System.out.println("Price: " + devicePrices.get(i).getText());
        }

        driver.quit();
    }
}
Test Case 2 (TC2): Print brand names present inside phone finder https://www.gsmarena.com/
java
Copy
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TC2_PrintBrandNames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gsmarena.com/");

        // Click on the 'Phone Finder' section
        WebElement phoneFinderLink = driver.findElement(By.linkText("Phone finder"));
        phoneFinderLink.click();

        // Wait for the page to load
        try {
            Thread.sleep(2000); // Better approach would be to use WebDriverWait for explicit wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get the brand names from the phone finder
        List<WebElement> brands = driver.findElements(By.cssSelector(".brand-list .brand"));

        // Print brand names
        for (WebElement brand : brands) {
            System.out.println("Brand Name: " + brand.getText());
        }

        driver.quit();
    }
}
Test Case 3 (TC3): Click on the Samsung link inside the phone finder and print device name https://www.gsmarena.com/
java
Copy
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TC3_PrintDeviceNameFromSamsung {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gsmarena.com/");

        // Click on the 'Phone Finder' section
        WebElement phoneFinderLink = driver.findElement(By.linkText("Phone finder"));
        phoneFinderLink.click();

        // Wait for the page to load
        try {
            Thread.sleep(2000); // Better approach would be to use WebDriverWait for explicit wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click on Samsung brand in the list
        WebElement samsungBrandLink = driver.findElement(By.xpath("//div[contains(@class, 'brand-list')]//a[contains(text(), 'Samsung')]"));
        samsungBrandLink.click();

        // Wait for the Samsung phones to load
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get and print the device names for Samsung phones
        List<WebElement> samsungDevices = driver.findElements(By.cssSelector(".makers .model"));
        for (WebElement device : samsungDevices) {
            System.out.println("Device Name: " + device.getText());
        }

        driver.quit();
    }
}
Test Case 4 (TC4): Open Google, type "Selenium", get all suggestion count, and print suggestions one by one
java
Copy
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class TC4_PrintGoogleSuggestions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        // Locate the search bar and type "Selenium"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");

        // Wait for the suggestions to appear
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".sbl1")));

        // Get all the suggestion elements
        List<WebElement> suggestions = driver.findElements(By.cssSelector(".sbl1"));

        // Print the count of suggestions
        System.out.println("Total Suggestions: " + suggestions.size());

        // Print all suggestion names
        for (WebElement suggestion : suggestions) {
            System.out.println(suggestion.getText());
        }

        driver.quit();
    }
}
Test Case 5 (TC5): Login into https://demowebshop.tricentis.com/, and print product name and price
java
Copy
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentsLocators{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");

        // Login with the provided credentials
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("tester01@vomoto.com");
        driver.findElement(By.id("Password")).sendKeys("Abc@12345");
        driver.findElement(By.cssSelector("input[value='Log in']")).click();

        // Wait for login to complete (could be improved with WebDriverWait)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Navigate to the first product (or select a category)
        WebElement product = driver.findElement(By.cssSelector(".product-box"));
        String productName = product.findElement(By.cssSelector(".product-title")).getText();
        String productPrice = product.findElement(By.cssSelector(".price")).getText();

        // Print product name and price
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + productPrice);

        driver.quit();
    }
}




