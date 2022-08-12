package assignments.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://nxtgenaiacademy.com/demo-site/";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement sbmBtn = driver.findElement(By.name("vfb-submit"));
		sbmBtn.submit();
		WebElement fNameErr = driver.findElement(By.xpath("//*[@id=\"item-vfb-5\"]/label[2]"));
		String FNameErrMsg = fNameErr.getText();
		String expErr="This field is required.";
		if(expErr.equals(FNameErrMsg))
		{
			System.out.println("Firstname field is not entered");
			System.out.println("Error message shown is correct");
			
		}
		else
		{
			System.out.println("Error message is wrong");
			System.out.println("Expected error message is  " + expErr );
			System.out.println("Actual error message is " + FNameErrMsg);
		}
		
		}
	}

