package orangehrm;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Recruitment {

	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span")
	WebElement recruitmentInfo;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
	WebElement addCandidate;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input")
	WebElement firstName;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[2]/div[2]/input")
	WebElement midName;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[3]/div[2]/input")
	WebElement lastName;
	
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[2]/i")
	WebElement select;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div[2]/div[3]/span")
	WebElement vacancyDropdown;
 
  
  	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")
 
	WebElement emailAddress;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")
	WebElement contactNumber; 
	
	
	
	/*@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div/div[2]/div/div[1]")
	//WebElement browseFile;
	
	//@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div/div[2]/div/i")
	//WebElement uploadFile;
	
//	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[1]/div/div[2]/input")
	//WebElement enterKeywords;
	
	//@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[2]/div/div[2]/div/div/input")
	//WebElement dateOfApplication;// Calender
	
	//@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[6]/div/div/div/div[2]/textarea")
	//WebElement enterNotes;

	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[7]/div/div/div/div[2]/div/label/span/i")
	WebElement checkTick;*/
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]")
	WebElement saveButton;
	
/*	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/div/div/div/label/span")
	WebElement edit;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/div/form/div[2]/div/div/div/div[2]/div/div/div[2]/i")
	WebElement selectDrop;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/div/form/div[2]/div/div/div/div[2]/div/div/div[1]")
	WebElement selectVacancy;
	
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/div/form/div[2]/div")
	WebElement randomClick;*/
	
	
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]") WebElement shortList;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
	WebElement save;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]")
	WebElement scheduleInterview;
	
	public Recruitment(WebDriver driver) {
		
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
	}

	public void recruitDetails() throws InterruptedException {
		
		
		wait.until(ExpectedConditions.elementToBeClickable(recruitmentInfo)).click();
		wait.until(ExpectedConditions.elementToBeClickable(addCandidate)).click();
		wait.until(ExpectedConditions.visibilityOf(firstName)).sendKeys("moa");
		wait.until(ExpectedConditions.visibilityOf(midName)).sendKeys("loa");
		wait.until(ExpectedConditions.visibilityOf(lastName)).sendKeys("foa");
		wait.until(ExpectedConditions.elementToBeClickable(select)).click();
		wait.until(ExpectedConditions.elementToBeClickable(vacancyDropdown)).click();
		wait.until(ExpectedConditions.visibilityOf(emailAddress)).sendKeys("liily@gmail.com");
		wait.until(ExpectedConditions.visibilityOf(contactNumber)).sendKeys("8975475678");
		
	//	wait.until(ExpectedConditions.elementToBeClickable(checkTick)).click();*/
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(shortList)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(save)).click();
	   wait.until(ExpectedConditions.elementToBeClickable(scheduleInterview)).click();

	//	((JavascriptExecutor) driver).executeScript("arguments[0].click();", scheduleInterview);

		


}}

