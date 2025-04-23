package day6MultipelElementHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class  Assignment{
    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();

        // Open the given URL
        driver.get("https://demo.automationtesting.in/Register.html");

        // Find the year, month, and day dropdown elements
        WebElement yearDropdown = driver.findElement(By.id("year"));
        WebElement monthDropdown = driver.findElement(By.id("month"));
        WebElement dayDropdown = driver.findElement(By.id("day"));

        // Validate the year dropdown options are in ascending order
        validateDropdownOptionsInAscendingOrder(yearDropdown, "Year");

        // Validate the month dropdown options are in sequence (Jan to Dec)
        validateDropdownOptionsInSequence(monthDropdown, "Month");

        // Validate the day dropdown options are in ascending order
        validateDropdownOptionsInAscendingOrder(dayDropdown, "Day");

        // Close the browser
        driver.quit();
    }

    public static void validateDropdownOptionsInAscendingOrder(WebElement dropdown, String type) {
        Select select = new Select(dropdown);
        List<WebElement> options = select.getOptions();
        boolean isAscending = true;

        for (int i = 0; i < options.size() - 1; i++) {
            String currentOption = options.get(i).getText();
            String nextOption = options.get(i + 1).getText();
            if (currentOption.compareTo(nextOption) > 0) {
                isAscending = false;
                break;
            }
        }

        if (isAscending) {
            System.out.println(type + " options are in ascending order.");
        } else {
            System.out.println(type + " options are NOT in ascending order.");
        }
    }

    public static void validateDropdownOptionsInSequence(WebElement dropdown, String type) {
        Select select = new Select(dropdown);
        List<WebElement> options = select.getOptions();
        String[] expectedSequence;

        if (type.equals("Month")) {
            expectedSequence = new String[] {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
            };
        } else {
            expectedSequence = new String[0];  // Empty array for months
        }

        boolean isValidSequence = true;
        int index = 0;
        for (WebElement option : options) {
            String currentOption = option.getText();
            if (!currentOption.equals(expectedSequence[index])) {
                isValidSequence = false;
                break;
            }
            index++;
        }

        if (isValidSequence) {
            System.out.println(type + " options are in correct sequence.");
        } else {
            System.out.println(type + " options are NOT in correct sequence.");
        }
    }
}

   






