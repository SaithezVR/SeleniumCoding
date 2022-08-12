package assignment.selenium.multiplebrowserwindows;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.lambdatest.com/selenium-playground/window-popup-modal-demo";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		//Button that opens single window
		
		driver.findElement(By.xpath("//a[@href='https://twitter.com/Lambdatesting']")).click();
		System.out.println("New twitter window is opened");
		
		//Getting windows id
		
		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> iterator = windowId.iterator();
		
		String homepage = iterator.next();
		String twitterPage = iterator.next();
		
		System.out.println("Home page id is " + homepage);
		System.out.println("twitterPage id is " + twitterPage);
	
		
		driver.switchTo().window(twitterPage);
		driver.manage().window().maximize();
		
		/* After twitter page is opened
		 * Navigating back to main page
		 * Click the button that opens multiple windows instead of single window
		 * Iterate again and see if correct window can be navigated
		 */
		driver.switchTo().window(homepage);
		driver.findElement(By.xpath("//a[@title='Follow @Lambdatesting']")).click();
			
		Set<String> windowId1 = driver.getWindowHandles();
		Iterator<String> iterate1 = windowId1.iterator();
		
		String parentwindow = iterate1.next();	
		String twitterPageOld = iterate1.next();		
		String twitterPageNew = iterate1.next();
		String fbPage = iterate1.next();
	
		System.out.println("parentwindow" + parentwindow);
		System.out.println("twitterPageOld" + twitterPageOld);
		System.out.println("twitterPageNew"+ twitterPageNew);
		System.out.println("fbPage" + fbPage);
	
		driver.switchTo().window(twitterPageOld).close();
		driver.switchTo().window(twitterPageNew);
		driver.manage().window().maximize();
		driver.switchTo().window(fbPage);
		driver.manage().window().maximize();
		driver.quit();
		
	}

}
