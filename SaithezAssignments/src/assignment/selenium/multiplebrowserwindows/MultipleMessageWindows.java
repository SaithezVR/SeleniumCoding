package assignment.selenium.multiplebrowserwindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleMessageWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://nxtgenaiacademy.com/multiplewindows/";
		driver.get(url);

		driver.manage().window().maximize();
		System.out.println("Parent Browser is opened");
		driver.findElement(By.xpath("//button[contains(@name,'newmessagewindow')]")).click();     
		System.out.println("Message Window is opened");
		
		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> iterator = windowId.iterator();		
		String homePage = iterator.next(); 
		String newMsgWindow = iterator.next(); 
		
		System.out.println("Parent Browser ID is " + homePage);
		System.out.println("Message Window ID is " + newMsgWindow);
		
		
		driver.switchTo().window(newMsgWindow);
		System.out.println("Message Window Activated");
				
		driver.close();
		System.out.println("Message Window is closed");
	
		driver.switchTo().window(homePage);
		System.out.println("Parent Browser Activated");		
		
		driver.findElement(By.linkText("HOME")).click();
		System.out.println("Home Page is loaded in Parent Browser");
		
		
		driver.close();
		System.out.println("Parent Browser is closed");

	}

}
