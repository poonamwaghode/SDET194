package orangehrm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutLogin {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")
	WebElement logout;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")
	WebElement chooseLogout;


	//Locate elements using @FindBy annotation
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement loginButton;
	
	
	// Constructor to initialize elements
			public LogoutLogin(WebDriver driver) {
				this.driver = driver;
				this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				PageFactory.initElements(driver, this);
			}

			// Method to fill out registration form
			public void loginNewUser() throws InterruptedException {
				wait.until(ExpectedConditions.visibilityOf(logout)).click();
				wait.until(ExpectedConditions.visibilityOf(chooseLogout)).click();

				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

				// Wait for elements to be present
				wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("AllGood");
				wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("emP@1234!");
				Thread.sleep(30);

				wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
				

	}

}
