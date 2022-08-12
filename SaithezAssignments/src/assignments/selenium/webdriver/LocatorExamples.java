package assignments.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExamples {
	
	static String url = ("https://nxtgenaiacademy.com/demo-site/");

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Creating System property of the chrome driver
  System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
  
  // Creating Chrome driver object instance
  WebDriver driver = new ChromeDriver();
  
  String firstName ="Saithez";
  String lastName="Voleti R";
  String address= "Flat no:9304";
  String city ="Navalur";
  String zipCode= String.valueOf(603103);
  
  //Fetching url
  driver.get(url);
  
  //Opening and maximizing the window
  driver.manage().window().maximize();
  
  //Identify First name
  driver.findElement(By.id("vfb-5")).sendKeys(firstName);
  
  //Identify Last name
  driver.findElement(By.id("vfb-7")).sendKeys(lastName);
  
  //identifying the element using name locator
  driver.findElement(By.name("vfb-13[address]")).sendKeys(address);
  
  //xpath locators
  
  driver.findElement(By.xpath("//*[@id=\"vfb-13-address-2\"]")).sendKeys(city);
  driver.findElement(By.id("vfb-13-zip")).sendKeys(zipCode);
  
  
  driver.findElement(By.linkText("HOME")).click();
  
  driver.findElement(By.partialLinkText("VIDEO")).click();
  driver.close();
  
	}

}
