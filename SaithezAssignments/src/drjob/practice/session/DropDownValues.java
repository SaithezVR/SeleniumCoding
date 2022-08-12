package drjob.practice.session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String url ="https://uat1.drjobpro.com/en/jobseekers/register";
		driver.get(url);
		driver.manage().window().maximize();

	}

}
