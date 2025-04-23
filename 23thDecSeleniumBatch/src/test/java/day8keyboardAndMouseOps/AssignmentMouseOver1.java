package day8keyboardAndMouseOps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import reusableComponent.GenericFunctions;

public class AssignmentMouseOver1 {

	public static void main(String[] args)throws InterruptedException {
		GenericFunction g1=new GenericFunction();
		WebDriver driver=g1.setup("chrome");
		
		driver.get("https://www.espncricinfo.com/");
		//moving control inside the frame
		driver.switchTo().frame(0);
		
		//create an instance of actions class and pass driver instance to its constructor
		Actions action=new Actions(driver);
		
		//identify source and target
		String Mousehoverover = new String();
		WebElement src=driver.findElement(By.id(Mousehoverover ));
        WebElement target=driver.findElement(By.id(Mousehoverover));
		action.dragAndDrop(src,target).build().perform();
	}

}
