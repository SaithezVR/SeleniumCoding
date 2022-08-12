package assignments.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement cntryDropDown = driver.findElement(By.xpath("//*[@id=\"vfb-13-country\"]"));

		String cOne = "India";
		String cTwo = "Turkey";


		if(cntryDropDown.isDisplayed())
		{
			System.out.println("DropDown is displayed");
			Select cDD = new Select(cntryDropDown);
			cDD.selectByVisibleText(cOne);
			System.out.println("India is selected");
			cDD.selectByIndex(1);
			System.out.println("Afganisthan is selected");
			cDD.selectByValue(cTwo );
			System.out.println("Turkey is selected");
		}
		else
		{
			System.out.println("Dropdown is not displayed");
		}

	}

}
