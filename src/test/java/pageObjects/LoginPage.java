package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.StepDef;


public class LoginPage{

	
	public LoginPage(WebDriver ldriver){
		StepDef.driver=ldriver;
		PageFactory.initElements(ldriver, this);
		
	}
	
	@FindBy(id="email")
	WebElement emailfbElement;
	
	@FindBy(id="pass")
	WebElement passfbElement;
	
	public void doLogin(String user, String pass) {
		emailfbElement.sendKeys(user);
		passfbElement.sendKeys(pass);
		//click
	}
	
	public void click() {
		System.out.println("click action");
	}
	
	
	
	
	
	
	
}
