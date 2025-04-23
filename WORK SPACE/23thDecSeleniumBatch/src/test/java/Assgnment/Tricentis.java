package Assgnment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tricentis {
	
		
		public static void main(String[] args) {
				/*open browser*/
				WebDriver driver=new ChromeDriver();
				/*enter url*/
				driver.get("https://demowebshop.tricentis.com");
				
				/*identify email input field*/
				WebElement usernameInputField=driver.findElement(By.id("email"));
				/*enter email*/
				usernameInputField.sendKeys("tester01@vomoto.com");
				
				/*identify password input field*/
				WebElement passwordInputField=driver.findElement(By.id("password"));
				/*enter password*/
				passwordInputField.sendKeys("Abc@12345");
				
				
				/*identify login input field*/
				WebElement loginButton=driver.findElement(By.id("login-button"));
				/*click on login button*/
				loginButton.click();
				
				/*Validate home page with url*/
				String expectedUrl="https://demowebshop.tricentis.com";
				String actualUrl=driver.getCurrentUrl();
				System.out.println("is login successful? "+actualUrl.equals(expectedUrl));
			}
		}

		



