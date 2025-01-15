package orangehrm;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DependentDetails {
	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[4]/a")
	WebElement clickDependent;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")
	WebElement dependentAdd;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")
	WebElement nameDependent;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")
	WebElement dropRelation;
	
	 @FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]/span")
	 WebElement childOption;
	
	//@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div/div/div[2]/div/div/i")
	//WebElement calender;

	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]")
    WebElement saveButton;
	// Constructor to initialize elements
	 public DependentDetails(WebDriver driver) {
	
		this.driver = driver;
		
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
	}

	public void dependDetails() throws InterruptedException {
		
		
		wait.until(ExpectedConditions.elementToBeClickable(clickDependent)).click();
		wait.until(ExpectedConditions.elementToBeClickable(dependentAdd)).click();
		wait.until(ExpectedConditions.visibilityOf(nameDependent)).sendKeys("Shanaya");
		wait.until(ExpectedConditions.elementToBeClickable(dropRelation)).click();
		
		Thread.sleep(30);
		wait.until(ExpectedConditions.elementToBeClickable(childOption)).click();
		//new Select(selectrelation).selectByVisibleText("Child");
		
		//droprelation.click();
		//Thread.sleep(30);
		//selectrelation.click();
		//Thread.sleep(50);
		//option.click();
/*
		// Click the date picker to open the calendar 
		WebElement datePicker = driver.findElement(By.id("dateOfBirthPicker"));
		datePicker.click(); 
		// Select year
		WebElement yearPicker = driver.findElement(By.className("year-class-name"));
		// replace with actual class name 
		yearPicker.click();
		WebElement selectYear = driver.findElement(By.xpath("//option[@value='1990']")); 
		// replace with desired year selectYear.click();
		// Select month WebElement monthPicker = driver.findElement(By.className("month-class-name"));
		// replace with actual class name
		monthPicker.click(); 
		WebElement selectMonth = driver.findElement(By.xpath("//option[@value='10']"));
		// replace with desired month (e.g., October) 
		selectMonth.click();
		// Select day WebElement
		dayPicker = driver.findElement(By.xpath("//table[@class='calendar-table-class-name']//td[text()='15']"));
		// replace with actual class and date
		dayPicker.click();
		
		savebutton.click();
		cancelbutton.click();*/
		saveButton.click();
}}
