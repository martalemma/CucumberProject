package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	

//	webElement list
	@FindBy(how = How.XPATH,using= "//button[text()='Set SkyBlue Background']")WebElement Skyblue_Button_Element;
	@FindBy(how = How.XPATH,using= "//body[@style='background-color: skyblue;']")WebElement Skyblu_Background_color_Element;
	@FindBy(how = How.XPATH,using= "//button[text()='Set White Background']")WebElement White_Button_Element;
	@FindBy(how = How.XPATH,using= "//body[@style='background-color: white;']")WebElement White_Background_color_Element;
	
//	Corresponding method
	public void clickSkyBlueButton() {
		
		Skyblue_Button_Element.click();
	}
  
	public void validateSkyblueBackgroundColor() {
     String color =Skyblu_Background_color_Element.getCssValue("background-color");
		String c =Color.fromString(color).asHex();
		System.out.println(c);
	}
	public void clickWhiteBackgroundButton() {
		White_Button_Element.click();
	}
	public void validateWhiteBackgroundColor() {
	     String color =White_Background_color_Element.getCssValue("background-color");
			String c =Color.fromString(color).asHex();
			System.out.println(c);
		}
}
