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

public class Admin {
	WebDriver driver;
	WebDriverWait wait;

	

	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")//(xpath = "//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")
	public
	WebElement adminLink;
	
	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[1]/button/i")
	public
	WebElement addButton;
	public
	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[1]/div[2]/i")
	WebElement userRole;
	public
	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[3]/span")
	WebElement ess;
	public
	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")
	WebElement hintEmpName; 
	public
	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[4]/span")
	WebElement employeeName;
	public
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")
	WebElement status;
	public
	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]/span")
	WebElement selectStatus;
	public
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
	WebElement username;
	public
	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
	WebElement password;
	public
	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
	WebElement confirmPassword;
	public
	@FindBy(xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
	WebElement saveButton;
	
	// Constructor to initialize elements
		public Admin(WebDriver driver) {
			// WebDriverWait wait;

			this.driver = driver;
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			PageFactory.initElements(driver, this);
		}

		// Method to login with credentials
		public void admin() {
			// Wait for elements to be present
			wait.until(ExpectedConditions.visibilityOf(adminLink)).click();
			wait.until(ExpectedConditions.visibilityOf(addButton)).click();
			wait.until(ExpectedConditions.visibilityOf(userRole)).click();
			wait.until(ExpectedConditions.visibilityOf(ess)).click();
			wait.until(ExpectedConditions.visibilityOf(hintEmpName)).sendKeys("r");
			wait.until(ExpectedConditions.visibilityOf(employeeName)).click();
			wait.until(ExpectedConditions.visibilityOf(status)).click();
			wait.until(ExpectedConditions.visibilityOf(selectStatus)).click();
			wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("AllGood");
			wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("emP@1234!");
			wait.until(ExpectedConditions.visibilityOf(confirmPassword)).sendKeys("emP@1234!");
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(3000));

			wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();



			
		}
}
		
