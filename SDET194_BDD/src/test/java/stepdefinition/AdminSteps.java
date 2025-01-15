package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import orangehrm.Admin;

public class AdminSteps {

    WebDriver driver;
    Admin adminPage;

    @Before
    public void setUp() {
       // System.setProperty("webdriver.edge.driver", "path/to/msedgedriver"); // Replace with actual path
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        adminPage = new Admin(driver);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("the admin is on the admin page")
    public void the_admin_is_on_the_admin_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin"); // Replace with actual admin page URL
    }

    @When("the admin clicks on the add button")
    public void the_admin_clicks_on_the_add_button() {
        adminPage.adminLink.click();
        adminPage.addButton.click();
    }

    @And("the admin selects the user role")
    public void the_admin_selects_the_user_role() {
        adminPage.userRole.click();
        adminPage.ess.click();
    }

    @And("the admin enters the employee name {string}")
    public void the_admin_enters_the_employee_name(String employeeName) {
        adminPage.hintEmpName.sendKeys(employeeName);
        adminPage.employeeName.click();
    }

    @And("the admin selects the status")
    public void the_admin_selects_the_status() {
        adminPage.status.click();
        adminPage.selectStatus.click();
    }

    @And("the admin enters the username {string}")
    public void the_admin_enters_the_username(String username) {
        adminPage.username.sendKeys(username);
    }

    @And("the admin enters the password {string}")
    public void the_admin_enters_the_password(String password) {
        adminPage.password.sendKeys(password);
    }

    @And("the admin confirms the password {string}")
    public void the_admin_confirms_the_password(String confirmPassword) {
        adminPage.confirmPassword.sendKeys(confirmPassword);
    }

    @And("the admin clicks the save button")
    public void the_admin_clicks_the_save_button() {
        adminPage.saveButton.click();
    }

    @Then("the user should be added successfully")
    public void the_user_should_be_added_successfully() {
        // Implement verification steps, such as checking for a success message or the presence of the new user
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Add your verification logic here
    }
}
