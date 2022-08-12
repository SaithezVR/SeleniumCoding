package assignments.selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setting system property for chrome driver
   System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
   
   //Creating object instance of chrome driver
   WebDriver driver = new ChromeDriver();
   
   //Initializing url string
   String url = "https://nxtgenaiacademy.com/demo-site/";
   
   //Opening the website
   driver.get(url);
   
   //maximizing the window
   driver.manage().window().maximize();
   
   //Assigning webpage title to a string variable 
   
   String actualTitle= driver.getTitle();
   
   
   /*Validating if actual title retrieved using selenium code is 
   same as the title defined or not*/
   
   String expectedTitle = "Demo Site – Registration Form – NxtGen A.I Academy";
   if(actualTitle.equalsIgnoreCase(expectedTitle))
   {
		System.out.println("Title retreived is correct"); 
		System.out.println("Tile is "+actualTitle);
		
	}
   else
   {
	   System.out.println("Title retrieved is not correct");
	   System.out.println("Tile is "+actualTitle);
	   System.out.println("Title is" + expectedTitle);
   }
   
   //getting page source and assigning it to a string
   String pS= driver.getPageSource();
   System.out.println("The page source is " + pS);
   System.out.println("__________________________________________________________________");
   //Page source length including space as a count
   int pSLen= pS.length();
   System.out.println("Length of the page source code is " + pSLen);
   
   //close the browser 
   driver.close();
   }
	 
	

}
