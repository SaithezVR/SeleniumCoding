package assignments.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://nxtgenaiacademy.com/webtable/";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement multiSelect = driver.findElement(By.name("programming"));
		if(multiSelect.isDisplayed())
		{
		Select mSelect = new Select(multiSelect);
		mSelect.deselectAll();
		mSelect.selectByIndex(1);
		mSelect.selectByValue("PHP");
		
		}
		else
		{
			System.out.println("programming languages are not displayed for selection");
		}
		driver.close();
		}

	}


