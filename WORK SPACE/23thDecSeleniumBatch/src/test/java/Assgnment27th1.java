  import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Assgnment27th1 {


    private WebDriver driver;

    
    public void setUp() {
      
    }

    
    public void testLoginPageElements() {
        // Click on the login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
        loginButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 10); 
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-error-msg")));

        // Validate error message
        String errorText = errorMessage.getText();
        Assert.assertEquals(errorText, "Login was unsuccessful. Please correct the errors and try again.", "Error message text does not match.");

        // Validate error message color
        String errorColor = errorMessage.getCssValue("color");
        Assert.assertEquals(errorColor, "rgb(204, 0, 0)", "Error message color is not as expected.");

        // Validate error message font size
        String errorFontSize = errorMessage.getCssValue("font-size");
        Assert.assertEquals(errorFontSize, "14px", "Error message font size is incorrect.");

        // Validate error message font family
        String errorFontFamily = errorMessage.getCssValue("font-family");
        Assert.assertEquals(errorFontFamily, "Arial, sans-serif", "Error message font family is incorrect.");

        // Validate error message position (check that it is above the username field)
        WebElement usernameField = driver.findElement(By.id("Email"));
        int errorMessageY = errorMessage.getLocation().getY();
        int usernameFieldY = usernameField.getLocation().getY();
        Assert.assertTrue(errorMessageY < usernameFieldY, "Error message is not above the username field.");

        // Validate "Remember me" text next to checkbox
        WebElement rememberMeText = driver.findElement(By.xpath("//label[@for='RememberMe']"));
        Assert.assertTrue(rememberMeText.isDisplayed(), "'Remember me' text is not displayed next to the checkbox.");

        // Validate login button name
        String loginButtonText = loginButton.getAttribute("value");
        Assert.assertEquals(loginButtonText, "Log in", "Login button name is incorrect.");

        // Validate login button font size
        String loginButtonFontSize = loginButton.getCssValue("font-size");
        Assert.assertEquals(loginButtonFontSize, "14px", "Login button font size is incorrect.");

        // Validate login button font family
        String loginButtonFontFamily = loginButton.getCssValue("font-family");
        Assert.assertEquals(loginButtonFontFamily, "Arial, sans-serif", "Login button font family is incorrect.");

        // Validate login button color
        String loginButtonColor = loginButton.getCssValue("background-color");
        Assert.assertEquals(loginButtonColor, "rgb(255, 102, 0)", "Login button color is incorrect.");
    }

    


	
		

	}


