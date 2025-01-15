package orangehrm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrmLogin {

	WebDriver driver;
	WebDriverWait wait;

	// Locate elements using @FindBy annotation
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	public
	WebElement Username;

	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	public
	WebElement Password;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	public
	WebElement loginbutton;
	
	
	/*@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")
	public
	WebElement Myinfo;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a")
	public
	WebElement Contactdetails;*/
	
	// Constructor to initialize elements
		public OrangeHrmLogin(WebDriver driver) {
			this.driver = driver;
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			PageFactory.initElements(driver, this);
		}

		// Method to fill out registration form
		public void loginUser(String userName, String pwd) {
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

			// Wait for elements to be present
			wait.until(ExpectedConditions.visibilityOf(Username)).sendKeys("Admin");
			wait.until(ExpectedConditions.visibilityOf(Password)).sendKeys("admin123");
			wait.until(ExpectedConditions.visibilityOf(loginbutton));
			
			wait.until(ExpectedConditions.elementToBeClickable(loginbutton)).click();
	

}
}
