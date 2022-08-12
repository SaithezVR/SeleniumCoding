package assignments.selenium.framesandbrowsers;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingMultipleiFrames {

	// Program to explain handling frames and iframes in selenium

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//To launch chrome in incognito using Chrome options and DesiredCapabilities
		ChromeOptions o = new ChromeOptions(); //
		o.addArguments("--incognito");   
		DesiredCapabilities c = new DesiredCapabilities();
		c.setCapability(ChromeOptions.CAPABILITY, o);

		WebDriver driver = new ChromeDriver(o);
		driver.manage().window().maximize();

		//Launching the website
		String url = "https://ui.vision/demo/webtest/frames/";
		driver.get(url);

		//To pass value for text box available in 1st Frame
		driver.switchTo().frame(0);
		WebElement text = driver.findElement(By.name("mytext1"));
		text.sendKeys("Testing");

		//Switching back to default in order to move to next frame
		driver.switchTo().defaultContent();

		//To pass value for the text box available in 2nd Frame
		driver.switchTo().frame(1);
		WebElement textTwo = driver.findElement(By.name("mytext2"));
		textTwo.sendKeys("Testing exercise");

		//Switching back to default in order to move to next frame
		driver.switchTo().defaultContent();

		//To select questions asked in iframe embedded in frame 3 of web page
		driver.switchTo().frame(2);

		//To get the count, how many iframe are available in 3rd frame
		int count = driver.findElements(By.tagName("iframe")).size();
		System.out.println("No of iframes is " + count);
 
		//Switching to child frame
		driver.switchTo().frame(0);

		//Identifying webelement in the iframe to select radio button
		WebElement qOne = driver.findElement(By.xpath("//div[@id='i5']"));
		if(qOne.isDisplayed())
		{

			System.out.println("Radio button is enabled");
			qOne.click();
			System.out.println("Radio button was already enabled, it is now cleared and reenabled again");
		}
		else
		{
			qOne.click();
			System.out.println("Radio button is not displayed");
		}

		//Switching back to parentFrame to move control from iframe to frame 3
		driver.switchTo().parentFrame();
		WebElement textThree = driver.findElement(By.name("mytext3"));
		textThree.sendKeys("Navigation to parent frame is ok");
		
		driver.close();
		driver.quit();
		
	}
	
	
}


