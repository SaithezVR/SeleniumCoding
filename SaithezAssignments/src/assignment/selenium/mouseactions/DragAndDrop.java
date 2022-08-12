package assignment.selenium.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://riptutorial.com/selenium-webdriver/learn/100010/drag-and-drop-using-selenium";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.xpath("//img[@alt='image' and @src='https://raw.githubusercontent.com/zzzprojects/learn-orm/master/tutorials/selenium-webdriver/images/drag-and-drop-2.png']"));
		WebElement to = driver.findElement(By.xpath("//img[@alt='image' and @src='https://raw.githubusercontent.com/zzzprojects/learn-orm/master/tutorials/selenium-webdriver/images/drag-and-drop-3.png']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
		System.out.println("Drag and drop is successful");
	}

}
