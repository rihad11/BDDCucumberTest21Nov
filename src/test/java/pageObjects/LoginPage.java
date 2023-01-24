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
	
	public void doLogin(String user, String pass) throws InterruptedException {
		emailfbElement.sendKeys(user);
		Thread.sleep(3000);
		passfbElement.sendKeys(pass);
		Thread.sleep(3000);
		//click
	}
	
	public void doLogin() throws InterruptedException {
		emailfbElement.sendKeys("expertautomation");
		Thread.sleep(1000);
		passfbElement.sendKeys("Xyz!234878");
		Thread.sleep(1000);
		//click
	}
	
	
	public void click() {
		System.out.println("click action");
	}
	
	
	
	
	
	
	
}
