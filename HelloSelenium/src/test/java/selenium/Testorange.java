package selenium;

import java.time.Duration;
//import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Testorange {
	public static void main(String[] args) {
		// Set the path for the EdgeDriver
		// System.setProperty("webdriver.edge.driver",
		// "C:\\path\\to\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		// Create an instance of JavascriptExecutor
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
	 // Scroll down by 1000 pixels
		scroll.executeScript("window.scrollBy(0, 1000)");
		// Scroll up by 500 pixels
		scroll.executeScript("window.scrollBy(0, -500)");
		// Set implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Initialize the page objects
	/*	OrangeHrmLogin orangePage = new OrangeHrmLogin(driver);
		ContactDetails contactPage = new ContactDetails(driver);
		EmergencyContacts emergPage = new EmergencyContacts(driver);
		DependentDetails dependentPage = new DependentDetails(driver);
		Recruitment recruitPage = new Recruitment(driver);
		ShorlistandInterview shortlistPage = new ShorlistandInterview(driver);
		MarkInterviewAndOffer markPage = new MarkInterviewAndOffer(driver);
		HireAndPrint hirePage = new HireAndPrint(driver);
		BackToRecruitment backPage = new BackToRecruitment(driver);
		Admin adminPage = new Admin(driver);
		LogoutLogin loginlogoutPage = new LogoutLogin(driver);
		LeaveMenu leavePage = new LeaveMenu(driver);
		ApproveLeave adminLoginPage = new ApproveLeave(driver);*/
		OrangeHrmLogin orangePage = new OrangeHrmLogin(driver);

		ShorlistandInterview shortlistPage = new ShorlistandInterview(driver);

		try {
			// Login user
		/*	orangePage.loginUser("Admin", "admin123");

			// Login with the new credentials
			contactPage.orangeHrmAdd();
			emergPage.emergencyContact();
			dependentPage.dependDetails();
			recruitPage.recruitDetails();
			shortlistPage.shortlistIn();
			markPage.interviewOffer();
			hirePage.hireAndPrint();
			backPage.bacKRecruit();
			adminPage.admin();
			loginlogoutPage.loginNewUser();
			leavePage.leaveStep();
			orangePage.loginUser("Admin", "admin123");
			leavePage.leaveStep();
			adminLoginPage.approve();*/
			orangePage.loginUser("Admin", "admin123");

			shortlistPage.shortlistIn();

			} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
			// } finally {
			// driver.navigate().back();
		}
	}
}
