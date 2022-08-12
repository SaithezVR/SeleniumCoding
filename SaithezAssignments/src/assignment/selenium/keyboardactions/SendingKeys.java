package assignment.selenium.keyboardactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SendingKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https:\\www.makemytrip.com";
		driver.get(url);

		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.xpath("//span[text()='From']"));
		
		from.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement fromTxtBox = driver.findElement(By.xpath("//input[@placeholder='From']"));
		
		fromTxtBox.sendKeys("Chennai");
		fromTxtBox.sendKeys(Keys.DOWN);
		fromTxtBox.sendKeys(Keys.ENTER); 
		String value = driver.findElement(By.id("fromCity")).getAttribute("value");
		System.out.println("Selected From city is " + value);
		
		WebElement toTxtBox = driver.findElement(By.xpath("//input[@placeholder='To']"));
		
		Actions act = new Actions(driver);		
		act.moveToElement(toTxtBox)
		   .keyDown(toTxtBox,Keys.SHIFT)
		   .sendKeys("mumbai")
		   .keyUp(toTxtBox,Keys.SHIFT)
		   .sendKeys(Keys.DOWN)
		   .sendKeys(Keys.DOWN)
		   .sendKeys(Keys.ENTER)
		   .perform();

	}

}
