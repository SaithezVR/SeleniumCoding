package assignment.selenium.multiplebrowserwindows;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MultipleBrowserTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://nxtgenaiacademy.com/multiplewindows/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		WebElement btn= driver.findElement(By.xpath("//button[text()='New Browser Tab']"));
		btn.click();
		System.out.println("https://nxtgenaiacademy.com/ site is launched");

		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> iterator = windowId.iterator();

		String mainTab = iterator.next();
		String nxtGenTab = iterator.next();

		System.out.println("Main tab id is " + mainTab);
		System.out.println("NxtGenAI tab id is " + nxtGenTab);


		driver.switchTo().window(nxtGenTab);

		WebElement modulesTwenty = driver.findElement(By.xpath("//a[@href='https://nxtgenaiacademy.com/atozautomationtraining/' and @role='button']"));
		Actions act = new Actions(driver);
		act.moveToElement(modulesTwenty)
		.keyDown(Keys.CONTROL)
		.keyDown(Keys.SHIFT)
		.click()
		.keyUp(Keys.CONTROL)
		.keyDown(Keys.SHIFT)
		.perform();

		System.out.println("20 module syllabus is opened in new tab");	

		Set<String> windowId1 = driver.getWindowHandles();
		Iterator<String> iterator1 = windowId1.iterator();

		String mainTab1 = iterator1.next();
		String nxtGenTab1 = iterator1.next();
		String twentyModuleTab = iterator1.next();

		System.out.println("Main tab id is " + mainTab1);
		System.out.println("NxtGenAI tab id is " + nxtGenTab1);
		System.out.println("20module tab id is " + twentyModuleTab);

		driver.switchTo().window(twentyModuleTab);
		String title = driver.getTitle();
		System.out.println("Title  of the 20module page is " + title);

		driver.switchTo().window(nxtGenTab);
		driver.navigate().refresh();
		driver.quit();
	}

}
