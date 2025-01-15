package orangehrm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeaveMenu {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a/span")
	WebElement leaveLink;
	
	//*[@id="app"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/a") WebElement applyLeave;
	
	//*[@id="app"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i") WebElement logout;
	
	//*[@id="app"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a") WebElement logoutButton;
	
	// Constructor to initialize elements
		 public LeaveMenu(WebDriver driver) {
		
			this.driver = driver;
			
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			PageFactory.initElements(driver, this);
		}

		public void leaveStep()  {
			
			
			wait.until(ExpectedConditions.elementToBeClickable(leaveLink)).click();

		}
}
