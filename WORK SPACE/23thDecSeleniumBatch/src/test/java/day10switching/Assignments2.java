package day10switching;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments2{
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
      
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");

            // --- 1. Handle JS Alert ---
            driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
            driver.switchTo().alert().accept(); // Accepts the alert
            System.out.println("Handled JS Alert");

            // --- 2. Handle JS Confirm (Accept) ---
            driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
            driver.switchTo().alert().accept(); // Accepts the confirm dialog
            System.out.println("Accepted JS Confirm");

            // --- 3. Handle JS Confirm (Dismiss) ---
            driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
            driver.switchTo().alert().dismiss(); // Dismisses the confirm dialog
            System.out.println("Dismissed JS Confirm");

            // --- 4. Handle JS Prompt (Send Text + Accept) ---
            driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
            driver.switchTo().alert().sendKeys("Hello from Selenium!");
            driver.switchTo().alert().accept(); // Accept after entering text
            System.out.println("Entered text and accepted JS Prompt");

            // --- 5. Handle JS Prompt (Dismiss) ---
            driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
            driver.switchTo().alert().dismiss(); // Dismiss prompt
            System.out.println("Dismissed JS Prompt");

	}

}
