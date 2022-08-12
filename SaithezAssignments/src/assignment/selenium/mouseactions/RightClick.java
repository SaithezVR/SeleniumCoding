package assignment.selenium.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="http://demoqa.com/buttons";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement rClick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		Actions act = new Actions(driver);
		act.contextClick(rClick).perform();
		String msg= driver.findElement(By.xpath("//p[@id='rightClickMessage']")).getText();
		System.out.println("Message shown is " + msg);
		driver.quit();
		
	}

}
