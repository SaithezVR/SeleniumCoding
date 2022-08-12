package assignments.selenium.framesandbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clicks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demoqa.com/buttons";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement dblClickMe = driver.findElement(By.id("doubleClickBtn"));
        
		Actions action = new Actions(driver);
		action.doubleClick(dblClickMe).perform();
		
		// action.movetoElement(dblClickMe).doubleClick().perform();
		
		WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(rightClick).perform();
		
		int count = driver.findElements(By.tagName("iframe")).size();
		System.out.println("No of iframes is " + count);
		
		driver.switchTo().frame(2);
		WebElement interactionsTab = driver.findElement(By.xpath("//*[contains(text(),'Interactions')]"));
		//WebElement interactionsTab = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[5]/span/div"));
		
		action.click(interactionsTab);
		
		WebElement droppable = driver.findElement(By.xpath("//*[contains(text(),'Droppable')]"));
		action.click(droppable);
		
	}

}
