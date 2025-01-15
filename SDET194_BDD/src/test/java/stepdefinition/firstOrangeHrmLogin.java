package stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orangehrm.OrangeHrmLogin;

public class firstOrangeHrmLogin {

    WebDriver driver;
    WebDriverWait wait;
    OrangeHrmLogin loginPage;

    @Before
    public void setUp() {
       // System.setProperty("webdriver.edge.driver", "path/to/msedgedriver"); // Replace with actual path
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        loginPage = new OrangeHrmLogin(driver);
       wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @After
    public void tearDown() {
        if (driver != null) {
           // driver.quit();
        }
    }

    @Given("the user is on the OrangeHRM login page")
    public void the_user_is_on_the_orangehrm_login_page() {
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	}

    @When("the user enters the username {string}")
    public void the_user_enters_the_username(String username) {
    	wait.until(ExpectedConditions.visibilityOf(loginPage.Username));
    	loginPage.Username.sendKeys("Admin");
    }

    @And("the user enters the password {string}")
    public void the_user_enters_the_password(String password) {
    	wait.until(ExpectedConditions.visibilityOf(loginPage.Password));
        loginPage.Password.sendKeys("admin123");
    }

    @And("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
    	
    	wait.until(ExpectedConditions.elementToBeClickable(loginPage.loginbutton)).click();
    	}

   
    @Then("the user will be in the application")
    public void the_user_will_be_in_the_application() {
    		// Verification logic for successful login 
    		String expectedTitle = "OrangeHRM"; 
    		String actualTitle = driver.getTitle();
    		if (!actualTitle.equals(expectedTitle)) { 
    			throw new AssertionError("Login failed");
    		}
    	}
    }



