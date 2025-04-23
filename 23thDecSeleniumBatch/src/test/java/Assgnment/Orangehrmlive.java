package Assgnment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Orangehrmlive {
		
		public static void main(String[] args) {
				/*open browser*/
				WebDriver driver=new ChromeDriver();
				/*enter url*/
				driver.get("https://opensource-demo.orangehrmlive.com");
				
				/*identify username input field*/
				WebElement usernameInputField=driver.findElement(By.name("username"));
				/*enter username*/
				usernameInputField.sendKeys("Admin");
				
				/*identify password input field*/
				WebElement passwordInputField=driver.findElement(By.name("password"));
				/*enter password*/
				passwordInputField.sendKeys("admin123");
				
				/*identify login input field*/
				WebElement loginButton=driver.findElement(By.name("login-button"));
				/*click on login button*/
				loginButton.click();
				
				/*Validate home page with url*/
				String expectedUrl="https://opensource-demo.orangehrmlive.com";
				String actualUrl=driver.getCurrentUrl();
				System.out.println("is login successful? "+actualUrl.equals(expectedUrl));
			}
		}

		