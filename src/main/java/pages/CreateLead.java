package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCName;
	@And("Enter the CompanyName as iNautix")
	public CreateLead enterCompName(String CName) {
		type(eleCName, CName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFName;
	@And("Enter the FirstName as Indira")	
	public CreateLead enterFName(String Fname) {
		type(eleFName, Fname);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLName;
	@And("Enter the LastName as Priya")	
	public CreateLead enterLName(String LName) {
		type(eleLName, LName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleEmail;
	
	public CreateLead enterEmail(String Email) {
		type(eleEmail, Email);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elePhone;
	
	public CreateLead enterPhone(String Phone) {
		type(elePhone, Phone);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCrLeads;
	@When("Click on Create button1")
	public ViewLead clickCrLeads() {
		click(eleCrLeads);
		return new ViewLead();		
	}
	

}
