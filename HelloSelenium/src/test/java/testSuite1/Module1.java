package testSuite1;

//import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import dev.failsafe.internal.util.Assert;

public class Module1 {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am executing before every method");
	}

	@Test
	public void test001() {
		System.out.println("I am executing test case 001");
		Reporter.log("I am Executing test case 001");
		
		Assert.assertEquals(false,true);

	}

	@Test
	public void test002() {
		System.out.println("I am executing test case 002");
		Reporter.log("I am Executing test case 002");

	}

	@Test (groups = {"smoke","sanity"})
	public void test003() {
		System.out.println("I am executing test case 003");
		Reporter.log("I am Executing test case 003");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am executing after every method");
	}
	@DataProvider
	public Object[][] data001(){
		Object[][] data = {{"poonam", "pass001"},{"waghere","pass002"}};
		
		return data;
		}
	
	@Test (dataProvider = "data001")
	
	public void login(String username,String password) {
		System.out.println(username +" and "+ password);
		
		}
	}
	

