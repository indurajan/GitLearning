package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods{
	public MergeLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how=How.XPATH,using="//img[@alt = 'Lookup'][1]")
	private WebElement eleFrmLdIcon;
	
	public FindLeads clickFromLead() {
		click(eleFrmLdIcon);
		switchToWindow(1);
		return new FindLeads();
	}
	
	@FindBy(how=How.XPATH,using="//img[@alt = 'Lookup']/following::a[2]")
	private WebElement eleToLdIcon;
	
	public FindLeads clickToLead()  {
		click(eleToLdIcon);
		switchToWindow(1);
		return new FindLeads();
	}
	
	@FindBy(how=How.XPATH,using="//a[@class = 'buttonDangerous']")
	private WebElement eleMergebtn;
	
	public ViewLead clickMerbtn() {
		click(eleMergebtn);
		acceptAlert();
		return new ViewLead();
	}


	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[1]")
	private WebElement eleLeadid1;
	public MergeLead enterLeadID1(String LeadID1) {		
		type(eleLeadid1, LeadID1);
		return this;
	}
	
		
	

}
	

