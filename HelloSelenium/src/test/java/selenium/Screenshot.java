package selenium;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
//import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
//import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshot {
	
	public static void takeScreenshot(String stepName) throws IOException, HeadlessException, AWTException {
		
		WebDriver driver = new EdgeDriver();

	//	driver.get("https://selenium.dev");
		
		//Thread.sleep(5000); // Wait for 5 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.selenium.dev/documentation/webdriver/browser/alerts/");
		
		driver.findElement(By.linkText("See an example alert")).click();
		
	try {	
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		
		String TCName = "TC_001";
		String dir = System.getProperty("user.dir");
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		//Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String path = dir + "/src/test/resources/screenshots/"+TCName+"/screenshot_"+stepName+"_"+timestamp+".jpeg";
		
		File destFile = new File (path);
		// Create directory if it does not exist
		File directory = new File(destFile.getParent()); 
		if (!directory.exists()) { 
			directory.mkdirs(); 
			}
		
		FileUtils.copyFile(srcFile, destFile);
		//driver.quit();
		
		}
		catch(Exception e) {
			
			BufferedImage Alertscreenshot = new Robot().createScreenCapture
					(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			String TCName = "TC_001";
			String dir = System.getProperty("user.dir");
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

			//Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			String path = dir + "/src/test/resources/screenshots/"+TCName+"/screenshot_"+stepName+"_"+timestamp+".jpeg";
			
			ImageIO.write(Alertscreenshot, "png", new File (path));
		}
		
		
	}
	
	public static void main(String[] args) throws IOException , HeadlessException, AWTException {
		takeScreenshot("AlertPage");
		//takeScreenshot("SeleniumHomePage");
	}

}
