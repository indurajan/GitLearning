package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
	
	public ViewLead() {		
		PageFactory.initElements(driver,this);
	}	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleVerifyCrCname;
	@Then("Verify successful created lead by checking value as iNautix")
	public ViewLead verifyCrCname(String data) {
	verifyPartialText(eleVerifyCrCname, data);
		return this;		
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleVerifyeditedCname;
	@Then("Verify successful edited lead by checking the edited value")
	public ViewLead verifyCname(String data) {
	verifyPartialText(eleVerifyeditedCname, data);
		return this;		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEditLeadbtn;
	@And("Click on Edit button")
	public EditLead clickEditLeadbtn() {
		click(eleEditLeadbtn);
		return new EditLead();
	}
	
	@FindBy(how=How.CLASS_NAME,using="subMenuButtonDangerous")
	private WebElement eleDelLead;
	@When("Click on Delete button")
	public MyLeads clickDelLeadbtn() {
		click(eleDelLead);
		return new MyLeads();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDupLead;
	
	public DuplicateLead clickDupLeadbtn() {
		click(eleDupLead);
		return new DuplicateLead();		
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleVerifyFname;
	@Then("Verify the deleted lead message")
	public ViewLead verifyFname(String Fname1) {
	verifyExactText(eleVerifyFname, Fname1);
		return this;		
	}
	
}
