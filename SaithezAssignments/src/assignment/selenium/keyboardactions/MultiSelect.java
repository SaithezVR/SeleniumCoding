package assignment.selenium.keyboardactions;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiSelect {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://demo.mobiscroll.com/select/multiple-select";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement mSelect = driver.findElement(By.xpath("//span[text()='Please select...']"));
		mSelect.click();
		
		WebElement books = driver.findElement(By.xpath("//div[text()='Books']"));
		WebElement mMG = driver.findElement(By.xpath("//div[text()='Movies, Music & Games']"));
		WebElement cJ = driver.findElement(By.xpath("//div[text()='Clothing & Jewelry']"));
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL)
		.click(books)
		.click(mMG)
		.click(cJ)
		.click(mMG) //deselecting the selected value
		.keyUp(Keys.CONTROL)
		.perform();
		
		System.out.println("Multi select action is performed using keyboard actions.");
		
		driver.quit();
	}

}
