package drjob.dropdownvalues;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PAD753 {

	public boolean retryingFindClick() {

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://alpha.drjobpro.com/en-be/jobs-in-uae?page=1");
		driver.manage().window().maximize();


		boolean result=false;
		int retry =0;
		for(int i=0;i<10000;i++)
			//while(nxt.isEnabled())
		{

			try {
				WebElement next =driver.findElement(By.linkText("Next"));
				Actions act = new Actions(driver);
				act.moveToElement(next).click().perform();

			}
			catch(StaleElementReferenceException e) {
				while(retry<2)
				{
					WebElement next =driver.findElement(By.linkText("Next"));
					Actions act = new Actions(driver);
					act.moveToElement(next).click().perform();
					result=true;
					break;
				}

				retry++;
			}

		}
		System.out.println("I value reached");
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PAD753 retry1 = new PAD753();	
		try {
			retry1.retryingFindClick();
		}
		catch(NoSuchElementException e) {
			System.out.println("Last page reached");
		}
	}
}
