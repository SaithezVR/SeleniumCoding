package drjob.dropdownvalues;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProfileandResume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://alpha.drjobpro.com/");
		driver.manage().window().maximize();

		WebElement LoginBtn = driver.findElement(By.xpath("//span[text()='Login ']"));
		LoginBtn.click();
		
		WebElement SignUp = driver.findElement(By.linkText("SIGN UP"));
		SignUp.click();
    
		WebElement cntryDropDown= driver.findElement(By.xpath("//select[@name='country_id']"));
		Select cDD= new Select(cntryDropDown);
		List<WebElement> list=cDD.getOptions();
		int size=list.size();
		for(int i=0;i<size;i++)
		{
			System.out.println(list.get(i).getText());
		}



	}

}
