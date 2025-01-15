package stepdefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "src/test/resources/features/first_OrangeHrmLogin.feature",
  glue = {"stepdefinition"},
  plugin = {"pretty", "html:target/poonam-reports/html-report.html"}
)

public class TestRunner {

}
