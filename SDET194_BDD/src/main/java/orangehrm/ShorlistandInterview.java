package orangehrm;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShorlistandInterview {
	WebDriver driver;
	WebDriverWait wait;
	
	//Schedule Interview
	
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
	WebElement enterTitle;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div/div[2]/div/div/input")
	WebElement interviewer;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div[4]/span")
	WebElement interviewerName;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[3]/div/div[2]/div/div/input")
	WebElement dateCalender;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[3]/div/div[2]/div/div[2]/div/div[3]/div[14]/div")
	WebElement selectDate;

	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")
	WebElement saveButton2;
	

public ShorlistandInterview(WebDriver driver) {
	
	this.driver = driver;
	this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	PageFactory.initElements(driver, this);
}

public void shortlistIn() throws InterruptedException {
	try {
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		System.out.println(enterTitle.getTagName());
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(interviewer)).sendKeys("a");
		wait.until(ExpectedConditions.elementToBeClickable(interviewerName)).click();
		wait.until(ExpectedConditions.elementToBeClickable(dateCalender)).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectDate)).click();

		wait.until(ExpectedConditions.visibilityOf(enterTitle)).sendKeys("Interview for open position");
		wait.until(ExpectedConditions.elementToBeClickable(saveButton2)).click();
	} catch (Exception e) {
		e.printStackTrace();
		throw new InterruptedException();
	}

  }
}