package framework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest extends ScreenObjects{
	
	WebDriver driver=null;
	
	@BeforeTest(alwaysRun = true)
	public void initialize() throws Exception{	
		driver= Driver.getInstance();
		initializeScreenObjects();		
	}
	
	@AfterTest(alwaysRun=true)
	public void close(){
		driver.quit();
	}

}
