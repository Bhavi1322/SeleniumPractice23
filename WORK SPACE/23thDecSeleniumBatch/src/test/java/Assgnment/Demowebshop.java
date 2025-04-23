package Assgnment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshop {

	public static void main(String[] args) {
		//start the browser 
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		//validate Email field
		 
		WebElement emaileField=driver.findElement(By.id("Email"));
		System.out.println("Email field visible or not? "+emailfield.isDisplayed());
		System.out.println("Email field enabled or not? "+emailField.isEnabled());
		System.out.println("what is default value in Email input field? "+email.getAttribute("placeholder"));
		         // validate Email password field
		WebElement passwordField=driver.findElement(By.id("password"));
		System.out.println("password field visible:"+passwordField.isDisplayed());
		System.out.println("passwoed field enabled:"+passwordField.isEnabled());
		      //validate Remember Me checkbox
		WebElement rememberMeChecbox=driver.findElement(By.id("RememberMeCheckbox"));
		System.out.println("Remember Me checkbox visible:"+rememberMeCheckBox.isDisplayed());
		System.out.println("Remember Me checkbox clickable:"+rememberMeCheckBox.isEnabled());
		System.out.println("Remember Me checkbox default selected::"+rememberMeCheckBox.isSelected());
		
		//click on Remember me checkbox selected
		rememberMeCheckBox.click();
		System.out.println("Remember me checkbox selected after click:"+rememberMeCheckBox.isSelected());
		    //validate forgot your password
		WebElement forgotPasswordLink=driver.findElement(By.linkText("Forgot your password"));
		System.out.println("Is forgotPasswordLink visible or not? "+forgotPasswordLink.isDisplayed());
		System.out.println("Is forgotPasswordLink in clickable or not? "+forgotPasswordLink.isEnabled());
		System.out.println("forgotPasswordLink text is: "+forgotPasswordLink.getText());
		
		//    validate login button
		WebElement loginButton=driver.findElement(By.xpath("//input[@value='Log in']"));
		System.out.println("Login button visible or not? "+loginButton.isDisplayed());
		System.out.println("Login button clickable: or not? "+loginButton.isEnabled());
		System.out.println("Login button name "+loginButton.getAttribute("value").equals(loginButton));
	    
		//close the browser
		driver.close();

}
}