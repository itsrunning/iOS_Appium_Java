package screens;


import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;

import framework.ScreenUI;


public class Screen1 extends ScreenUI{
	
	private static By TestBox1 = By.name("TextField1");
	private static By TestBox2 = By.name("TextField2");
	private static By ComputeSumButton = By.name("ComputeSumButton");
	private static By ComputedSum = By.tagName("staticText");
	private static By ShowAlertButton = By.name("show alert");
	private static By Slider = By.xpath("//slider[1]");
	
		
	public void populateData(String num1, String num2 ) throws Exception{
		type(TestBox1,num1);
		type(TestBox2,num2);
	}
	
	public void clickComputeSumButton(){
		click(ComputeSumButton);
	}
	
	public void isSumEqual(String expectedvalue){
		getText(ComputedSum);
		Assert.assertEquals(getText(ComputedSum),expectedvalue);
	}
	
	public void clickShowAlertButton(){
		click(ShowAlertButton);
	}
	
	public void acceptAlert(){	
		acceptAlert();
	}
	
	
	public WebElement getSlider() throws Exception {
        WebElement slider = getElement(Slider);
        return slider;
    }
	
	public void moveSlider(String value){
		 WebElement slider = getElement(Slider);
		 slider.sendKeys(value);
		
	}
	
	public void dragSliderToExtermeLeft() throws Exception {
		WebElement slider = getElement(Slider);
        TouchActions drag = new TouchActions(driver).flick(slider, new Integer(-1), 0, 0);
	    drag.perform();
	    Assert.assertEquals(slider.getAttribute("value"), "0%");
	    }
	
	public void moveSliderFromLeftToRight() throws InterruptedException{
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		    HashMap<String, Double> swipeObject = new HashMap<String, Double>();
		    swipeObject.put("startX", 0.05);
		    swipeObject.put("startY", 0.5);
		    swipeObject.put("endX", 0.95);
		    swipeObject.put("endY", 0.5);
		    swipeObject.put("duration", 1.8);
		    js.executeScript("mobile: swipe", swipeObject);
		    Thread.sleep(2000);
		    WebElement slider = getElement(Slider);
		    System.out.println(slider.getAttribute("value"));
		    
	}

	

}
