package assignments.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
		driver.get(url);
		WebElement msg = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p"));
		String actMsg = msg.getText();
		String expMsg = "Congratulations. You must have the proper credentials.";
		if(actMsg.equals(expMsg))
		{
			System.out.println("Success message shown is correct");
			System.out.println(" The message is " + actMsg );
		}
		else
		{
			System.out.println("Message shown is not correct");
			System.out.println(" The message currently shown is " + actMsg );
			System.out.println(" The message to be shown is" + expMsg );
			
		}
		
		driver.close();
	}

}
