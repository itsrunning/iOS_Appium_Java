package framework;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenUI extends Driver{
	
	private  int DEFAULT_WAIT = 10;
	
	protected WebElement getElement(By locator){
       
		return findElementWithWait(locator,DEFAULT_WAIT);

    }

    private static WebElement findElementWithWait(By by, int defaultWait) {
     	 
    	 WebDriverWait wait = new WebDriverWait(driver, defaultWait);
         wait.until( ExpectedConditions.presenceOfElementLocated(by) ); 
         return driver.findElement(by);		

    }

	protected void type(By by, String testdata)  {
			
		driver.findElement(by).sendKeys(testdata);
	}

	protected  void click(By locator)  {
			
		driver.findElement(locator).click();			
	}
	
	protected String getText(By locator){
		
		return driver.findElement(locator).getText();
        
	} 
	
	protected void acceptAlert()
    {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

     
 }
