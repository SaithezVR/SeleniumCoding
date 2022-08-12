package assignment.selenium.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String url ="https://en.wikipedia.org/wiki/Main_Page";
	driver.get(url);
	driver.manage().window().maximize();
	WebElement logo = driver.findElement(By.xpath("//a[@class='mw-wiki-logo']"));
	Actions act = new Actions(driver);
	act.moveToElement(logo).perform(); //moving the cursor to element
	String msg = logo.getAttribute("title"); //getting the title attribute value from that element
	System.out.println("Information shown on logo is " + msg);
	driver.quit();
	
	
}
}
