package orangehrm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmergencyContacts {
	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/a")
	WebElement emerContact;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")
	WebElement add;
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")
	WebElement name;
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")
	WebElement relationship;
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input")
	WebElement mobile;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]")
	WebElement savebutton;
//	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[1]")
	//WebElement cancelbutton;
	
	// Constructor to initialize elements
			 public EmergencyContacts(WebDriver driver) {
			
				this.driver = driver;
				this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				PageFactory.initElements(driver, this);
			}

			public void emergencyContact() {
				
				
				wait.until(ExpectedConditions.elementToBeClickable(emerContact)).click();
				wait.until(ExpectedConditions.elementToBeClickable(add)).click();
				
				wait.until(ExpectedConditions.visibilityOf(name)).sendKeys("Poonam");
				wait.until(ExpectedConditions.visibilityOf(relationship)).sendKeys("Sister");
				wait.until(ExpectedConditions.visibilityOf(mobile)).sendKeys("8769876879");
				savebutton.click();
				//cancelbutton.click();

}}
