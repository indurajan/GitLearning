package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{

	public EditLead() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleEditCName;
	@And("Edit CompanyName as <CName>")
	public EditLead enterEditCName(String EditCname) {
		type(eleEditCName, EditCname);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit'][1]")
	private WebElement eleUpdatebtn;
	@When("Click on Update button")
	public ViewLead clickUpdatebtn() {
		click(eleUpdatebtn);
		return new ViewLead();
	}

}
