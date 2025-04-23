package Assgnment;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import io.github.bonigarcia.wdm.WebDriverManager;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;

		public class actitime25Assgnment {

		    public static void main(String[] args) {
		        
		        WebDriver driver = new ChromeDriver();

		        try {
		            //  Launch ActiTime application
		            driver.get("https://online.actitime.com/dec23/login.do");

		            // Log in to the application with provided credentials
		            WebElement usernameField = driver.findElement(By.id("username"));
		            WebElement passwordField = driver.findElement(By.name("pwd"));
		            WebElement loginButton = driver.findElement(By.id("loginButton"));

		            usernameField.sendKeys("admin01");  // Replace with your username
		            passwordField.sendKeys("admin01");  // Replace with your password
		            loginButton.click();

		            // Wait for home page to load and validate the presence of the home page element
		           WebDriverWait wait = new WebDriverWait(driver,10);
		           WebElement homePageElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("taskListTable")));

		            // Validate that the home page is loaded by checking a unique element
		            if (homePageElement.isDisplayed()) {
		                System.out.println("Home page is displayed successfully.");
		            } else {
		                System.out.println("Home page validation failed.");
		            }

		            // Click on the "Tasks" tab and validate the tasks page
		            WebElement tasksTab = driver.findElement(By.id("tasksTab"));
		            tasksTab.click();

		            WebElement tasksPageElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("taskListTable")));
		            if (tasksPageElement.isDisplayed()) {
		                System.out.println("Tasks page is displayed successfully.");
		            } else {
		                System.out.println("Tasks page validation failed.");
		            }

		            //  Go back to the home page (Click on the logo or other home link)
		            WebElement logo = driver.findElement(By.id("logoContainer"));
		            logo.click();

		            //  Click on the "Reports" tab and validate the reports page
		            WebElement reportsTab = driver.findElement(By.id("reportsTab"));
		            reportsTab.click();

		            WebElement reportsPageElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("reportsTable")));
		            if (reportsPageElement.isDisplayed()) {
		                System.out.println("Reports page is displayed successfully.");
		            } else {
		                System.out.println("Reports page validation failed.");
		            }

		            //  Logout from the application
		            WebElement logoutButton = driver.findElement(By.id("logoutLink"));
		            logoutButton.click();

		            // Step 9: Validate logout by ensuring the login page is displayed again
		            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username"))); // Check if the login page is visible
		            System.out.println("Successfully logged out from the application.");

		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            // Step 10: Close the browser
		            driver.quit();
		        }
		    }
		}
		