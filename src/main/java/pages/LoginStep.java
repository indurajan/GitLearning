package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	public static ChromeDriver driver;

	/*@Given("Open the browser")
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
	}

	@And("Load URL as (.*)")	
	public void loadURL() {
		driver.get("http://www.leaftaps.com/opentaps");
	}

	@And("Set Timeouts")	
	public void timeOuts() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@And("Maximize the browser")	
	public void max() {
		driver.manage().window().maximize();
	}*/

	@And("Enter the Username1 as (.*)")	
	public void enterUsername(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}

	@And("Enter the Password1 as (.*)")	
	public void enterpassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}

	@And("Click on Login")	
	public void clicklogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@And("Click on crmsfa")	
	public void crmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@And("Click Leads link")	
	public void leadBtn() {
		driver.findElementByLinkText("Leads").click();
	}

}


