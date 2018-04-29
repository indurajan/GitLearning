package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{
	
	public FindLeads() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement elePhoneLnk;
	@And("Click on Phone tab")	
	public FindLeads clickPhoneLnk() {
		click(elePhoneLnk);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneAreaCode']")
	private WebElement elePhArcd;
	@And("And Enter Phone Area Code as PhArcd")	
	public FindLeads enterPhoneAreacd(String PhArcd) {
		type(elePhArcd, PhArcd);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFLeadbtn;
	@And("Click on Find Leads button")	
	public FindLeads clickFLeadbtn() {
		click(eleFLeadbtn);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="((//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a)")
	private WebElement eleLeadID1;
	@And("Verify the First Lead ID")
	public FindLeads getText(String LeadID1) {
		getText(eleLeadID1);
		return this;
			
	}
	
	@FindBy(how=How.XPATH,using=("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a)"))
	private WebElement eleLeadID;
	@And("Click on First Lead ID")
	public ViewLead clickLeadID1() {
		click(eleLeadID1);
		return new ViewLead();
	}
	
	
	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[1]")
	private WebElement eleLeadid1;
	@And("Enter LeadID1")	
	public FindLeads enterLeadID1(String LeadID1) {
		type(eleLeadid1, LeadID1);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[1]")
	private WebElement eleLeadid2;

	public FindLeads enterLeadID2(String LeadID2) {
		type(eleLeadid2, LeadID2);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-paging-info']")
	private WebElement eleVerifyErrMsg;
	
	public FindLeads verifyErrMsg(String errmsg) {
	verifyExactText(eleVerifyErrMsg, errmsg);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a")
	private WebElement eleFirstLdID;
	
	public MergeLead clickFirstLeadID() {
		clickWithNoSnap(eleFirstLdID);
		switchToWindow(0);
		return new MergeLead();		
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a")
	private WebElement eleSecLdID;
	
	public MergeLead clickSecLeadID() {
		clickWithNoSnap(eleSecLdID);
		switchToWindow(0);
		return new MergeLead();		
	}
}
