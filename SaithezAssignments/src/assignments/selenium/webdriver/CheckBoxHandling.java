package assignments.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);
		driver.manage().window().maximize();

		WebElement uftCheckbox = driver.findElement(By.id("vfb-20-1"));
		if(uftCheckbox.isDisplayed())
		{
			System.out.println("UFT check box is displayed");
		}
		else
		{
			System.out.println("UFT checkbox is not displayed");
		}

		if(uftCheckbox.isSelected())
		{
			System.out.println("UFT check box is selected");
		}
		else
		{
			System.out.println("UFT checkbox is not selected");
			uftCheckbox.click();
		}
		if(uftCheckbox.isSelected())
		{
			System.out.println("UFT check box is selected");
		}
		else
		{
			System.out.println("UFT checkbox is not selected");
		}
		
		uftCheckbox.click();
		if(uftCheckbox.isSelected())
		{
			System.out.println("UFT check box is checked");
		}
		else
		{
			System.out.println("UFT checkbox is unchecked");
		}
		driver.close();
	}

}
