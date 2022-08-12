package assignments.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://nxtgenaiacademy.com/demo-site/";
		String firstNameValue= "Saithez";
		driver.get(url);
		WebElement firstName = driver.findElement(By.id("vfb-5"));
		boolean y =firstName.isEnabled();
		boolean x =firstName.isDisplayed();
		if(x&&y==true)
		{
			firstName.sendKeys(firstNameValue);
			System.out.println(firstName.getAttribute("value"));
		}
		else 
		{
			System.out.println("First Name is either not displayed or enabled");
		}
		
		driver.close();
	}
 
}
