package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.Assert;

import framework.BaseTest;

public class SampleTest extends BaseTest {
	
	@Test(groups={"smoke"})
	public void computeSum() throws Exception{
		screen1().populateData("2","3");
		screen1().clickComputeSumButton();
		screen1().isSumEqual("5");		
	}
	
	@Test(groups={"smoke"})
    public void checkSliderDefaultposition() throws Exception {
       WebElement  slider =screen1().getSlider();
      Assert.assertEquals(slider.getAttribute("value"), "50%");
    }
	
	@Test(groups={"smoke"})
	public void moveSlider() {
		screen1().moveSlider("0.7");
	}
	
	@Test
	public void dragSliderToExteremeLeftAndVerifySliderPosition() throws Exception {
	   screen1().dragSliderToExtermeLeft();
	}
	
	@Test
	public void dragSliderToRightAndVerifySliderPosition() throws Exception {
	   screen1().moveSliderFromLeftToRight();
	}
	
	
	
	
	
	

	
	
	
	
	

}
