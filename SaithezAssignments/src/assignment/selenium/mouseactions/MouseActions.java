package assignment.selenium.mouseactions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/* Program to launch Amazon.in website, search for mobile phones
 * Navigate back to start page
 * And then pass Success as search keyword (using double click to highlight the text)
 */

public class MouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://amazon.in/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement sBSbmt = driver.findElement(By.id("nav-search-submit-button"));
		Actions act = new Actions(driver);
		act.doubleClick(searchBox);
		searchBox.sendKeys("mobile phones");
		sBSbmt.click();
		driver.navigate().back();
		
		/*when page is navigated back, element is not attached to page and hence getting Stale element exception
		To overcome stale element exception
		using try catch with for loop */
		
		for(int i=0; i<=2;i++){
			  try{
			     WebElement search =driver.findElement(By.xpath("//input[@type='text']"));
			     act.doubleClick(search);
			     search.sendKeys("Success");
			     break;
			  }
			  catch(Exception e){
			     System.out.println(e.getMessage());
			  }
			}


		driver.quit();
		
	}

}
