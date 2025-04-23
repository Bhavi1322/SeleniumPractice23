package LoactedAssgnment29th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class Example9 {

    WebDriver driver;

    
    public void setUp() {
        

        // Initialize WebDriver
        driver = new ChromeDriver();

        // Open the login page URL
        driver.get("https://demowebshop.tricentis.com/login");
    }

    
    public void testLoginPageElements() {
        // Click on the Login button without filling in the username or password
        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log in']"));
        loginButton.click();

        // Validate the error message text
        WebElement errorMessage = driver.findElement(By.className("validation-summary-errors"));
        Assert.assertTrue("Error message is not visible", errorMessage.isDisplayed());
        
        // Validate error message text
        String errorMessageText = errorMessage.getText();
        Assert.assertTrue("Error message text is incorrect", errorMessageText.contains("Login was unsuccessful"));

        // Validate error message color (color may vary based on CSS)
        String errorMessageColor = errorMessage.getCssValue("color");
        Assert.assertTrue("Error message color is incorrect", errorMessageColor.contains("rgb(204, 0, 0)"));  // Red color

        // Validate error message font size
        String errorMessageFontSize = errorMessage.getCssValue("font-size");
        Assert.assertTrue("Error message font size is incorrect", errorMessageFontSize.equals("14px"));

        // Validate error message font family
        String errorMessageFontFamily = errorMessage.getCssValue("font-family");
        Assert.assertTrue("Error message font family is incorrect", errorMessageFontFamily.contains("Arial"));

        // Validate the error message is displayed above the username field
        WebElement emailField = driver.findElement(By.id("Email"));
        int errorMessagePositionY = errorMessage.getLocation().getY();
        int emailFieldPositionY = emailField.getLocation().getY();
        Assert.assertTrue("Error message is not above the username field", errorMessagePositionY < emailFieldPositionY);

        // Validate Remember Me text is displayed next to checkbox
        WebElement rememberMeLabel = driver.findElement(By.xpath("//label[@for='RememberMe']"));
        Assert.assertTrue("Remember Me label is not visible", rememberMeLabel.isDisplayed());
        Assert.assertEquals("Remember Me text is incorrect", "Remember me", rememberMeLabel.getText());

        // Validate Login button name
        String loginButtonText = loginButton.getAttribute("value");
        Assert.assertEquals("Login button name is incorrect", "Log in", loginButtonText);

        // Validate Login button font size
        String loginButtonFontSize = loginButton.getCssValue("font-size");
        Assert.assertTrue("Login button font size is incorrect", loginButtonFontSize.equals("14px"));

        // Validate Login button font family
        String loginButtonFontFamily = loginButton.getCssValue("font-family");
        Assert.assertTrue("Login button font family is incorrect", loginButtonFontFamily.contains("Arial"));

        // Validate Login button color
        String loginButtonColor = loginButton.getCssValue("background-color");
        Assert.assertTrue("Login button color is incorrect", loginButtonColor.contains("rgb(60, 180, 77)"));  // Green color
    }

    // Close the browser after the test
    
    public void tearDown() {
        driver.quit();
    }
}

