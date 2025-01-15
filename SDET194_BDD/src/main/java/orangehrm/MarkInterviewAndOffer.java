package orangehrm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MarkInterviewAndOffer {
	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]")
	public
	WebElement markOffer;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
	public
	WebElement saveButton;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]")
	public
	WebElement offerJob;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
	public
	WebElement saveButtonPress;

	
	 public MarkInterviewAndOffer(WebDriver driver) {
			
			this.driver = driver;
			
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			PageFactory.initElements(driver, this);
		}

		public void interviewOffer() throws InterruptedException {
			
			
				wait.until(ExpectedConditions.elementToBeClickable(markOffer)).click();
				wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
				wait.until(ExpectedConditions.elementToBeClickable(offerJob)).click();
				wait.until(ExpectedConditions.elementToBeClickable(saveButtonPress)).click();


}}
