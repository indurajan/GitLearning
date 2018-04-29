package pagesnew;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class CreateLeadsPage extends ProjectMethods {

	public CreateLeadsPage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(how = How.ID, using = "createLeadForm_companyName")
	private WebElement eleCompanyName;

	@And("Enter the Company name as(.*)")
	public CreateLeadsPage typeCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_firstName")
	private WebElement elefirstName;
	
	@And("Enter the First Name as(.*)")
	public CreateLeadsPage typeFirstName(String data) {
		type(elefirstName, data);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_lastName")
	private WebElement eleLastName;

	@And("Enter the Last Name as(.*)")
	public CreateLeadsPage typeLastName(String data) {
		type(eleLastName, data);
		return this;
	}
	

	@FindBy(how = How.ID, using = "createLeadForm_primaryEmail")
	private WebElement eleEmailAddress;

	@And ("Enter the EmailId as (.*)")
	public CreateLeadsPage typeEmailId(String data) {
		type(eleEmailAddress, data);
		return this;
	}

	@FindBy(how = How.CLASS_NAME, using = "smallSubmit")
	private WebElement eleCreate_btn;

	@And("Click on Create Button")
	public ViewLeadPage clickCreate_btn() {
		click(eleCreate_btn);
		return new ViewLeadPage();
	}

}
