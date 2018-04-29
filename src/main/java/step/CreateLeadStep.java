package step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadStep {
	public static ChromeDriver driver;

	@And("Click on Create Lead link")
		public void createLead() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@And("Enter the CompanyName as <CName>")	
	public void companyName(String CName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(CName);
	}

	@And("Enter the FirstName as <Fname>")	
	public void firstName(String Fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(Fname);
	}

	@And("Enter the LastName as <LNname>")	
	public void lastName(String LName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(LName);
	}


	@When("Click on Create button")
	public void createLeadBtn() {
		driver.findElementByClassName("smallSubmit").click();
	}

	@Then("Verify successful created lead by checking value as <CName>")
	public void verifyCreateLead() {
		WebElement CName  = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		CName.getText();
		System.out.println(CName.getText());
	}
	
}


