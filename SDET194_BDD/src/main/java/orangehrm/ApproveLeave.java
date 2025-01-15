package orangehrm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApproveLeave {
	
	WebDriver driver;
	WebDriverWait wait;

	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement loginbutton;
	
	@FindBy(xpath ="//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]/button/i") 
	WebElement leaveList;
	
	
	
	// Constructor to initialize elements
			public ApproveLeave(WebDriver driver) {
				this.driver = driver;
				this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				PageFactory.initElements(driver, this);
			}

			public void approve() throws InterruptedException {
				
				
				wait.until(ExpectedConditions.elementToBeClickable(loginbutton)).click();
				wait.until(ExpectedConditions.elementToBeClickable(leaveList)).click();
		

			}
		}
	



