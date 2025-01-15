import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.en.*;
import orangehrm.MarkInterviewAndOffer;

public class MakeOffer {
    private static final String markOffer = null;
	WebDriver driver;
    MakeOffer makeOffer;

    public MakeOffer() {
        // Initialize the EdgeDriver and the Page Object
        System.setProperty("webdriver.edge.driver", "path/to/msedgedriver");
        this.driver = new EdgeDriver();
        this.makeOffer = new MakeOffer();
    }

    @Given("the user is on the Mark Interview and Offer page")
    public void the_user_is_on_the_Mark_Interview_and_Offer_page() {
        driver.get("URL of the Mark Interview and Offer page");
    }

    @When("the user clicks the mark offer button")
    public void the_user_clicks_the_mark_offer_button() {
        try {
            makeOffer.waitUntilElementClickable(makeOffer.markOffer).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("the user clicks the save button")
    public void the_user_clicks_the_save_button() {
        try {
            makeOffer.waitUntilElementClickable(makeOffer.saveButton).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("the user clicks the offer job button")
    public void the_user_clicks_the_offer_job_button() {
        try {
            makeOffer.waitUntilElementClickable(makeOffer.offerJob).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("the user clicks the save button again")
    public void the_user_clicks_the_save_button_again() {
        try {
            makeOffer.waitUntilElementClickable(makeOffer.saveButtonPress).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("the interview should be marked as offered")
    public void the_interview_should_be_marked_as_offered() {
        // Add your verification logic here to confirm that the interview has been marked as offered
    }
}
