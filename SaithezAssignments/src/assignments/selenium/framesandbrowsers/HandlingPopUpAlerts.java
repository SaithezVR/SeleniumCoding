package assignments.selenium.framesandbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopUpAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://demo.automationtesting.in/Alerts.html";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement alertBox = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alertBox.click();


		String alertBoxMsg = driver.switchTo().alert().getText();
		String expalertBoxMsg = "I am an alert box!";
		if(alertBoxMsg.equals(expalertBoxMsg))

		{
			System.out.println("Alert Box validation is ok");
		}
		else
		{
			System.out.println("Alert Box validation is not ok");
			System.out.println("Actual Alert Box message is " + alertBoxMsg);
			System.out.println("Alert Box validation is not ok " + expalertBoxMsg);
		}

		driver.switchTo().alert().accept();
		System.out.println("______________________________________________");

		// To click on Alert Ok and Cancel
		WebElement alertOkAndCancel = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		alertOkAndCancel.click();
		WebElement alertOKAndCancelPopUp = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		alertOKAndCancelPopUp.click();
		driver.switchTo().alert().accept();
		System.out.println("Ok is clicked on alertokandcancel pop up");
		String successMsg = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		String expSuccessMsg = "You pressed Ok";
		if(successMsg.equals(expSuccessMsg))
		{
			System.out.println("Success Message shown is correct : " + successMsg );
		}
		else
		{
			System.out.println("Success Message shown is not correct");
			System.out.println("Acutal Success Message is : " + successMsg );
			System.out.println("Expected Success Message is : " + expSuccessMsg );

		}

		System.out.println("______________________________________________");
		alertOKAndCancelPopUp.click();
		driver.switchTo().alert().dismiss();
		System.out.println("Cancel is clicked on alert pop up");
		String cancelMsg = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		String expCancelMsg = "You pressed Cancel";
		if(cancelMsg.equals(expCancelMsg))
		{
			System.out.println("Cancel Message shown is correct : " + successMsg );
		}
		else
		{
			System.out.println("Cancel Message shown is not correct");
			System.out.println("Acutal Cancel Message is : " + cancelMsg );
			System.out.println("Expected Cancel Message is : " + expCancelMsg );

		}
		System.out.println("______________________________________________");
		driver.quit();
	}

}
