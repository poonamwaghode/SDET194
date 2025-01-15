package orangehrm;

import java.time.Duration;

//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackToRecruitment {
	WebDriver driver;
	WebDriverWait wait;

	

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span")
	WebElement backRe;
	
	//*[@id="app"]/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]") WebElement saveButton;

	// Constructor to initialize elements
	public BackToRecruitment(WebDriver driver) {
		// WebDriverWait wait;

		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
	}

	// Method to login with credentials
	public void bacKRecruit() {
		// Wait for elements to be present
		wait.until(ExpectedConditions.visibilityOf(backRe)).click();
		

		//wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
		// *[@id="loginButton"]
		// loginButton.click();
	}

}
