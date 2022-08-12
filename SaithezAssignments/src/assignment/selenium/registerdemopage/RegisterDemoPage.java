package assignment.selenium.registerdemopage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegisterDemoPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Locating web elements
		String formTitle = "//fieldset[@id='item-vfb-1']//child::h3";
		String firstNameX ="vfb-5";	//id or name
		String lastNameX ="vfb-7"; //id or name
		String maleRdBtnX ="//input[@value='Male']"; //xpath
		String femaleRdBtnX ="//input[@value='Female']"; //xpath
		String addressX = "vfb-13-address"; //id
		String streetAddressX="vfb-13[address-2]"; //name
		String cityX= "vfb-13[city]" ;	
		String stateX =	"vfb-13[state]";	//name
		String CountryX = "select[class='vfb-select  ']"; //css
		String postalCodeX = "input#vfb-13-zip"; //css
		String emailIdX = "//input[@type='email']"; //xpath		
		String DateX =	"vfb-18" ;//name
		String hHDropDownX = "vfb-16-hour"; //id
		String mMDropDownX = "vfb-16[min]"; // name
		String mobileNumberX = "//input[@id='vfb-19']"; //xpath	
		String seleniumWebDriverX ="//input[@id='vfb-20-0']" ; //xpath
		String uFTX ="//input[@value='UFT']"; //xpath
		String testNGX = "//input[@value='TestNG']"; // xpath
		String coreJavaX = "//input[@value='Core Java']"; //xpath
		String functionalTestingX ="//input[@value='Functional Testing']"; 
		String othersX = "//input[@value='Others']";
		String enteryourQueryX = "//textarea[@name='vfb-23']";
		String twoDigitsFieldX= "//input[@name='vfb-3']";
		String submitX = "//input[@value='Submit']";
		String captchatextX = "//input[@id='vfb-3']//following::label[contains(text(),'Example')]"; //xpath
        String captchaFieldX ="//input[@id='vfb-3']";
        String successMsgX= "//div[contains(text(),'Registration')]";
		//Parameterizing the values for the fields

		String url ="https://nxtgenaiacademy.com/";
		String titlePage ="Demo Site – Registration Form – NxtGen A.I Academy";
		String expTitleForm = "Register For Demo";
		String firstNameValue ="TestTest";	
		String lastNameValue ="OneTwoThreeFour"; 
		String addressValue = "Flat no: Test9089, Test apartment";
		String streetAddressValue="Test street"; 
		String cityValue= "Madras";	
		String countryValue="India";
		String stateValue =	"TamilNadu";	
		int postalCodeValue = 123456;
		String emailIdValue = "test@test.com";
		String dateValue =	"03/04/2022" ; 
		String mobileNumberValue = "9999999999"; 
		String enteryourQueryValue = "What is the duration of course ? "
				+ "What is the fee structure"
				+ " What are the course timings"
				+ "Do we get job if join this course"
				+ "What is placement % for previous batches";


		//Initialzing webdriver and launching the url
		System.setProperty("webdriver.chrome.driver", ".//Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		//moving mouse to QA automation to launch Register page

		Actions act = new Actions(driver); // Calling Actions interface to perform mouse action

		WebElement qaAutomation = driver.findElement(By.linkText("QA AUTOMATION"));
		act.moveToElement(qaAutomation).perform();

		WebElement pracAutomation = driver.findElement(By.linkText("Practice Automation"));
		act.moveToElement(pracAutomation).perform();

		WebElement registrationlink= driver.findElement(By.partialLinkText("Registration Form"));
		act.click(registrationlink).perform();

		//Validating the title of the page

		String actTitlePage = driver.getTitle();
		if(titlePage.equals(actTitlePage))
		{
			System.out.println("Title is correct and the title is " + actTitlePage);
		}

		else
		{
			System.out.println("Title of the page is not correct");
			System.out.println("Expected title of the page is " + titlePage);
			System.out.println("Actual title of the page is " + actTitlePage);

		}


		//Validating the title of the form

		String actformTitle = driver.findElement(By.xpath(formTitle)).getText();
		if(actformTitle.equals(expTitleForm))
		{
			System.out.println("Title is correct and the title is " + actformTitle);
		}

		else
		{
			System.out.println("Title of the form is not correct");
			System.out.println("Expected title of the form is " + expTitleForm);
			System.out.println("Actual title of the form is " + actformTitle);
		}


		// Entering value for firstName field

		WebElement firstName = driver.findElement(By.id(firstNameX));
		if(firstName.isDisplayed())
		{
			firstName.sendKeys(firstNameValue);
			System.out.println("First Name value is entered in text box.");
		}
		else
		{
			System.out.println("First Name field is not displayed.");
		}


		// Entering value for Last name field
		WebElement lastName = driver.findElement(By.id(lastNameX));
		if(lastName.isDisplayed())
		{
			lastName.sendKeys(lastNameValue);
			System.out.println("Last Name value is entered in text box.");
		}
		else
		{
			System.out.println("Last Name field is not displayed.");
		}

		//To enable female radio button

		WebElement maleRdBtn = driver.findElement(By.xpath(maleRdBtnX));
		WebElement femaleRdBtn= driver.findElement(By.xpath(femaleRdBtnX));

		//Validating if male radio button is selected or not

		if(maleRdBtn.isSelected()) //Below code to unselect Male if it is already selected
		{
			System.out.println("Male radio button is enabled.");
			maleRdBtn.click(); //Deselecting male radio button
			Boolean status = maleRdBtn.isSelected();
			if(status=false) // after deselecting checcking if it is disabled or not
			{
				System.out.println("Male Radio button is disabled.");
			}
			else
			{
				System.out.println("Male Radio button is enabled.");
			}
		}
		else
		{
			if(!femaleRdBtn.isSelected()) //If female radio button is not selected
			{
				System.out.println("Female radion button is not enabled.");
				femaleRdBtn.click(); //Select female radio button
				Boolean statusOne = femaleRdBtn.isEnabled();
				if(statusOne=true) //After selecting radio button checking if it is enabled by script or not
				{
					System.out.println("Female Radio button is enabled.");
				}
				else
				{
					System.out.println("Female Radio button is still not enabled.");
				}
			}

			//Entering value for address

			WebElement address= driver.findElement(By.id(addressX));
			if(address.isDisplayed())
			{
				address.sendKeys(addressValue);
				System.out.println("Address is entered in text box.");
			}
			else
			{
				System.out.println("address field is not displayed.");
			}


			// Entering value for street address

			WebElement streetaddress= driver.findElement(By.name(streetAddressX));
			if(streetaddress.isDisplayed())
			{
				streetaddress.sendKeys(streetAddressValue);
				System.out.println("Street Address is entered in text box.");
			}
			else
			{
				System.out.println("street address field is not displayed.");
			}


			//Entering values for city field

			WebElement city = driver.findElement(By.name(cityX));
			if(city.isDisplayed())
			{
				city.sendKeys(cityValue);
				System.out.println("City value is entered in text box.");
			}
			else
			{
				System.out.println("city field is not displayed.");
			}

			//Identifying and entering value for state field

			WebElement state = driver.findElement(By.name(stateX));
			if(state.isDisplayed())
			{
				state.sendKeys(stateValue);
				System.out.println("State value is entered in text box.");
			}
			else
			{
				System.out.println("State Field is not displayed.");
			}

			//Selecting India value for Country dropdown

			WebElement countryDropDown= driver.findElement(By.cssSelector(CountryX ));

			if(countryDropDown.isDisplayed())
			{
				Select cDD = new Select(countryDropDown);
				cDD.selectByValue(countryValue);
				WebElement option = cDD.getFirstSelectedOption();
				System.out.println("Country selected is " + option.getText());
			}
			else
			{
				System.out.println("Country dropdown is not selected.");
			}


			//Postal code 
			WebElement postalCode = driver.findElement(By.cssSelector(postalCodeX));
			if(postalCode.isDisplayed())
			{
				postalCode.sendKeys(String.valueOf(postalCodeValue)); //Converting integer to String
				System.out.println("Postal code is entered.");	

			}
			else
			{
				System.out.println("Postal code field is not shown");
			}

			//Passing values to Email id


			WebElement emailID = driver.findElement(By.xpath(emailIdX));
			if(emailID.isDisplayed())
			{
				emailID.sendKeys(emailIdValue); 
				System.out.println("emaild id is entered.");	

			}
			else
			{
				System.out.println("Email code field is not shown.");
			}

			//Selecting India value for HH dropdown

			WebElement hhDropDown= driver.findElement(By.id(hHDropDownX));

			if(hhDropDown.isDisplayed())
			{
				Select hDD = new Select(hhDropDown);
				hDD.selectByIndex(10);
				WebElement option = hDD.getFirstSelectedOption();
				System.out.println("Hours selected is " + option.getText() +"hrs.");
			}
			else
			{
				System.out.println("Hours dropdown is not selected.");
			}

            //Selecting minutes for convenient time
			
			WebElement mmDropDown= driver.findElement(By.name(mMDropDownX ));
			if(mmDropDown.isDisplayed())
			{
				Select mmDD = new Select(mmDropDown);
				mmDD.selectByValue("25");
				WebElement option = mmDD.getFirstSelectedOption();
				System.out.println("Minutes value selected is " + option.getText() + "minutes.");
				
			}
			else
			{
				System.out.println("Minutes dropdown is not selected.");
			}
			//Entering value for mobile number
			WebElement mobileNumber = driver.findElement(By.xpath(mobileNumberX ));
			if(mobileNumber.isDisplayed())
			{
				mobileNumber.clear();
				mobileNumber.sendKeys(mobileNumberValue);
				System.out.println("Mobile number is entered.");
				
			}
			else
			{
				System.out.println("Mobile number is not displayed.");
			}
			
			//  Entering date value in date field
			
			WebElement date = driver.findElement(By.name(DateX ));
			if(date.isDisplayed())
			{
				date.sendKeys(dateValue);
				System.out.println("Date value is entered.");
			
			}
			else
			{
				System.out.println("Date field is not shown ");
			}
		
			WebElement seleniumWebDriver= driver.findElement(By.xpath(seleniumWebDriverX));
			WebElement uFT = driver.findElement(By.xpath(uFTX));
			WebElement testNG =driver.findElement(By.xpath(testNGX));
			WebElement coreJava =driver.findElement(By.xpath(coreJavaX));
			WebElement functionalTesting = driver.findElement(By.xpath(functionalTestingX));
			WebElement others = driver.findElement(By.xpath(othersX));
			boolean statusTwo = (seleniumWebDriver.isSelected() || uFT.isSelected() || testNG.isSelected()
					|| coreJava.isSelected() || functionalTesting.isSelected() || others.isSelected());
		    
			System.out.println("Any of the checkboxes selected?" + "is" + statusTwo);
			if(statusTwo==false) // Checking if atleast one of the checkbox is selected
		    {
		    	seleniumWebDriver.click();
		    	functionalTesting.click();
		    	System.out.println("SeleniumWebDriver and functional Testing are selected as courses.");
		    }
		    else //if one of the checkboxes is selected, check one by one to deselect and at the end select the two courses
		    {
		    	if(seleniumWebDriver.isSelected())
		    	{
		    		seleniumWebDriver.click();
		    		System.out.println("Selenium Webdriver is deselected.");
		    	}
		    	else
		    	{
		    		System.out.println("Selenium Webdriver is not selected.");
		    	}
		    	if(uFT.isSelected())
		    	{
		    		uFT.click();
		    		System.out.println("uFT is deselected.");
		    	}
		    	else
		    	{
		    		System.out.println("UFT is not selected.");
		    	}
		    	
		    	if(testNG.isSelected())
		    	{
		    		testNG.click();
		    		System.out.println("testNG is deselected.");
		    	}
		    	else
		    	{
		    		System.out.println("testNG is not selected.");
		    	}
		    	
		    	if(coreJava.isSelected())
		    	{
		    		coreJava.click();
		    		System.out.println("CoreJava is deselected.");
		    	}
		    	else
		    	{
		    		System.out.println("coreJava is not selected.");
		    	}
		    	
		    	if(functionalTesting.isSelected())
		    	{
		    		functionalTesting.click();
		    		System.out.println("functionalTesting is deselected.");
		    	}
		    	else
		    	{
		    		System.out.println("functionalTesting is not selected.");
		    	}
		    	
		    	if(others.isSelected())
		    	{
		    		others.click();
		    		System.out.println("Others is deselected.");
		    	}
		    	else
		    	{
		    		System.out.println("others is not selected.");
		    	}
		    	seleniumWebDriver.click();
		    	functionalTesting.click();
		    	System.out.println("SeleniumWebDriver and functional Testing are selected as courses after clearing.");
		    	
		    }

			//Entering value for query
			
			WebElement enterYourQuery= driver.findElement(By.xpath(enteryourQueryX ));
			if(enterYourQuery.isDisplayed())
			{
				enterYourQuery.clear();
				enterYourQuery.sendKeys(enteryourQueryValue);
				System.out.println("Queries are entered.");
			}
			else
			{
				System.out.println("Enter your Query field is not displayed.");
			}
			
			//Retrieving captcha
			
			WebElement captchaText = driver.findElement(By.xpath(captchatextX));
			WebElement captchaField = driver.findElement(By.xpath(captchaFieldX));
			String captchaValue = captchaText.getText(); //Getting captacha text
			String [] captchas = captchaValue.split(": "); //Splitting the text with : delimiter
			String captchaNum = captchas[1]; //assigning captcha number alone
			System.out.println("Captcha value is : " + captchaNum);
			captchaField.sendKeys(captchaNum); //sending captcha number to the field
			
			
			//Submitting the form
			
			WebElement submit = driver.findElement(By.xpath(submitX));
			submit.click();
			System.out.println("Form is submitted.");
			
			
			// Retrieving transaction id from success message
			
			WebElement successMessage = driver.findElement(By.xpath(successMsgX));
			String[] message = successMessage.getText().split(": "); //splitting the success message t retrieve transaction id 
			String transactionId = message[1]; //assigning transaction number to transaction id variable 
			System.out.println("Transacation id of successful form submission is :" + transactionId );
			
		driver.quit(); //Closing the browsers.
			
		}
	}

}


