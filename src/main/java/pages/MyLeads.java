package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{

	public MyLeads() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCrLeads;
	@When("Click on Create Lead link1")	
	public CreateLead clickCRLead() {
		click(eleCrLeads);
		return new CreateLead();
	}


	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFLeads;
	@And("Click on Find Leads link")	
	public FindLeads clickFLeadlnk() {
		click(eleFLeads);
		return new FindLeads();
	}



	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLeadsbtn;

	public MergeLead clickMerLead() {
		click(eleMergeLeadsbtn);
		return new MergeLead();
	}







}
