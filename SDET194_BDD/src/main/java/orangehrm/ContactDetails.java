package orangehrm;

import java.time.Duration;

import org.openqa.selenium.Keys;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ContactDetails {


	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")
	WebElement myInfo;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a")
	WebElement contactDetails;
	
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")
	WebElement street1;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")
	WebElement street2;

	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")
	WebElement city;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input")
	WebElement state;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input")
	WebElement zipcode;
	
	
//	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div")
	//WebElement dropCountry;
	
	//@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/div[1]")
	//WebElement country;

	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")
	WebElement saveButton;
	
	// Constructor to initialize elements
		public ContactDetails(WebDriver driver) {
			this.driver = driver;
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			PageFactory.initElements(driver, this);
		}

		public void orangeHrmAdd() {
			
			
			wait.until(ExpectedConditions.elementToBeClickable(myInfo)).click();
			wait.until(ExpectedConditions.elementToBeClickable(contactDetails)).click();
			  street1.sendKeys(Keys.CONTROL + "a");  // Select all text
			     street1.sendKeys(Keys.DELETE);  // Delete selected text
			    // street1.sendKeys(contactDetails.get("Street1"));  // Enter Street1
			wait.until(ExpectedConditions.visibilityOf(street1)).sendKeys("67 roseland ln");
			street2.sendKeys(Keys.CONTROL + "a");  // Select all text
		     street2.sendKeys(Keys.DELETE);  // Delete selected text
			wait.until(ExpectedConditions.visibilityOf(street2)).sendKeys("behind post office");
			city.sendKeys(Keys.CONTROL + "a");  // Select all text
		     city.sendKeys(Keys.DELETE);  // Delete selected text
			wait.until(ExpectedConditions.visibilityOf(city)).sendKeys("St Louis");
			state.sendKeys(Keys.CONTROL + "a");  // Select all text
		     state.sendKeys(Keys.DELETE);  // Delete selected text
			wait.until(ExpectedConditions.visibilityOf(state)).sendKeys("Missouri");
			zipcode.sendKeys(Keys.CONTROL + "a");  // Select all text
		     zipcode.sendKeys(Keys.DELETE);  // Delete selected text
			wait.until(ExpectedConditions.visibilityOf(zipcode)).sendKeys("678557");
			
			/**dropCountry.click();
			new Select(dropCountry).selectByVisibleText("United States");
			dropCountry.click();*/
		//	wait.until(ExpectedConditions.visibilityOf(country)).sendKeys("United States");
		//	DropCountry.click();
			//wait.until(ExpectedConditions.elementToBeClickable(DropCountry)).click();
		//	((JavascriptExecutor) driver).executeScript("arguments[2].click();", DropCountry);
			// Create a Select object
		//	Select selectCountry = new Select(DropCountry);
			// Select a country by visible text 
		//	selectCountry.selectByVisibleText("Unites States");
			saveButton.click();
		}
	
	

}
