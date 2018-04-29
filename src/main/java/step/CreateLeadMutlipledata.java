package step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadMutlipledata {
	public ChromeDriver driver;



	@Before
	public void before (Scenario sc) {
		System.out.println(sc.getName());
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@And("Enter the username as (.*)")	
	public void Username(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}

	@And("enter the password as (.*)")	
	public void password(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}

	@And("click on login button")	
	public void login() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
/*	@And("click on login button for failure")	
	public void loginfail() {
		driver.findElementById("errorDiv").click();
	}
	
	@And("Verify Login Error message")	
		public void verifyloginerr() {
			System.out.println("Login Failed");
		}*/
		
	@And("click on CRM/SFA link")	
	public void crmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@And("click on Leads button")	
	public void leadBtn() {
		driver.findElementByLinkText("Leads").click();
	}

/*	@And("click on CreateLead")	
	public void createLead() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@And("enter the companyname as (.*)")	
	public void companyName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}

	@And("enter the firstname as (.*)")	
	public void firstName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}

	@And("enter the lastname as (.*)")	
	public void lastName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}


	@When("click on createLead button")
	public void createLeadBtn() {
		driver.findElementByClassName("smallSubmit").click();
	}

	@Then("verify lead is created successfully")
	public void verifyLead() {
		System.out.println("success");
	}*/

	@After 
	public void after(Scenario sc) {
		System.out.println(sc.getStatus());
		driver.close();
	}


}


