package orangehrm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HireAndPrint {
	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]")
	WebElement hireButton;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
	WebElement saveButton;
	
	 public HireAndPrint(WebDriver driver) {
			
			this.driver = driver;
			
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			PageFactory.initElements(driver, this);
		}

		public void hireAndPrint() throws InterruptedException {
			
			
				wait.until(ExpectedConditions.elementToBeClickable(hireButton)).click();
				wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();

		}
}
