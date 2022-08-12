package assignments.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url= "https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div/header/div[1]/div[1]/div/a/img"));

		if(logo.isDisplayed()) 
		{
			System.out.println("Logo is displayed");
			System.out.println(logo.getAttribute("src"));
			System.out.println(logo.getAttribute("sizes"));
			String expImgTitle ="NxtGen A.I Academy";
			String imgTitle=logo.getAttribute("alt");
			System.out.println(imgTitle);

			if(expImgTitle.equals(imgTitle))
			{
				System.out.println("Titles are matching");
				System.out.println("Expected Title is " + expImgTitle);
				System.out.println("Actul title is " + imgTitle);
				logo.click();
				System.out.println("Logo is clicked");

			}
			else
			{
				System.out.println("Titles are not matching");
			}
		}
		else
		{
			System.out.println("Logo is not displayed");
		}
		driver.close();
	}
}


