package stepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BaseClass;
import pageObjects.LoginPage;

public class StepDef {

	public static WebDriver driver;
	LoginPage lPage = new LoginPage(driver);

	@Before
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	/*
	 * @After public void quitBrowser() { if (driver != null) driver.close(); }
	 */

	@Given("user in login page")
	public void user_in_login_page() {
		
		driver.get("https://www.facebook.com");
		System.out.println("user in " + driver.getCurrentUrl() + "page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {

		driver.findElement(By.id("email")).sendKeys("expertautomation");
		System.out.println("user enters username");
		driver.findElement(By.id("pass")).sendKeys("Xyz!234878");
		System.out.println("user enters password");
		
		

	}

	@When("user enters {string} and {string}")
	public void user_enters_and_password(String email, String pass) throws InterruptedException {

		lPage.doLogin(email, pass);
		/*
		 * driver.findElement(By.id("email")).sendKeys(email);
		 * System.out.println("user enters " + email);
		 * driver.findElement(By.id("pass")).sendKeys(pass);
		 * System.out.println("user enters " + pass);
		 */

	}

	@When("user click on signIn button")
	public void user_click_on_sign_in_button() {
		lPage.click();
	}

	@Then("user successfully login")
	public void user_successfully_login() {
		Assert.assertEquals("suucessful login", "Facebook - log in or sign up", driver.getTitle());
	}



}
