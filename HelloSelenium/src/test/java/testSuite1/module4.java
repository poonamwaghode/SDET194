package testSuite1;

//import static org.testng.Assert.assertEquals;

//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import dev.failsafe.internal.util.Assert;

public class module4 {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("I am executing before every suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am executing before every test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am executing before every class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am executing before every method");
	}

	@Test
	public void test001() {
		System.out.println("I am executing test case 001");
		Reporter.log("I am Executing test case 001");

	}

	@Test
	public void test002() {
		System.out.println("I am executing test case 002");
		Reporter.log("I am Executing test case 002");

	}

	@Test(groups = { "smoke", "sanity" })
	public void test003() {
		System.out.println("I am executing test case 003");
		Reporter.log("I am Executing test case 003");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am executing after every method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am executing after every class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I am executing after every test");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("I am executing after every suite");
	}

	@DataProvider
	public Object[][] data001() {
		Object[][] data = { { "poonam", "pass001" }, { "waghere", "pass002" } };

		return data;
	}

	@Test(dataProvider = "data001")

	public void login(String username, String password) {
		System.out.println(username + " and " + password);

	}
}
