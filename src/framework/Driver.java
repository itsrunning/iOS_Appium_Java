package framework;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Driver {
	
	 protected  static WebDriver driver;
	 
	 public static WebDriver getInstance() throws Exception{
			
	        File classpathRoot = new File(System.getProperty("user.dir"));
	        File appDir = new File(classpathRoot, "TestApp/build/Release-iphonesimulator");
	        File app = new File(appDir, "TestApp.app");
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability(CapabilityType.BROWSER_NAME, "iOS");
	        capabilities.setCapability(CapabilityType.VERSION, "7.1");
	        capabilities.setCapability(CapabilityType.PLATFORM, "Mac");
	        capabilities.setCapability("device", "iPhone Simulator");
	        capabilities.setCapability("app", app.getAbsolutePath());
	        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	        return driver;			
			
	 }

}
