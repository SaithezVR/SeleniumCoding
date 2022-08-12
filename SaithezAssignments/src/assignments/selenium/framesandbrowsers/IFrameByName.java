package assignments.selenium.framesandbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//setting property for chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		//creating instance for driver
		WebDriver driver= new ChromeDriver();

		String Url ="https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html";

		driver.get(Url);

		driver.manage().window().maximize();

		String Frame1="packageListFrame";
		String Frame2="packageFrame";

		//switch to frame ie.activating the frame
		driver.switchTo().frame(Frame1);

		WebElement chromlink= driver.findElement(By.xpath("/html/body/main/ul/li[3]/a"));

		chromlink.click();

		System.out.println("Chrome link in PackageListFrame is clicked");		
		driver.navigate().refresh();

		driver.switchTo().defaultContent();

		//again switching to other frame
		driver.switchTo().frame(Frame2);
		driver.findElement(By.linkText("AbstractHttpCommandCodec")).click();
		System.out.println("AbstractHttpCommandCodec link in Frame 2 is clicked");

		driver.close();
		
	}



}
