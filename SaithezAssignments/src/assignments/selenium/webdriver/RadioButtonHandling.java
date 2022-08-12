package assignments.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement maleRadioButton = driver.findElement(By.id("vfb-8-1"));
		if(maleRadioButton.isDisplayed())
		{
			System.out.println("Radio Button is displayed");

		}
		else
		{
			System.out.println("Radio button is not displayed");
		}

		if(maleRadioButton.isSelected())
		{
			System.out.println("Radio Button is selected");

		}
		else
		{
			System.out.println("Radio button is not selected");
			maleRadioButton.click();
		}
		if(maleRadioButton.isSelected())
		{
			System.out.println("Radio Button is selected");

		}
		else
		{
			System.out.println("Radio button is not selected");

	}
		driver.close();


	}
}