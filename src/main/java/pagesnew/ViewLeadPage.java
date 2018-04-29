package pagesnew;


	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	import cucumber.api.java.en.And;
	import cucumber.api.java.en.Then;
	import wdMethods.ProjectMethods;

	public class ViewLeadPage extends ProjectMethods{
		
		public ViewLeadPage() {
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(how=How.ID,using="viewLead_firstName_sp")
		private WebElement eleverifyName;
		
		@Then ("Verify the duplicate name as (.*)")
		public ViewLeadPage verifyName(String data) {
		verifyPartialText(eleverifyName, data);
			return this;		
		}
		@FindBy(how=How.LINK_TEXT,using="Edit")
		private WebElement eleEdit_Lead;
		
		@And("click Edit Lead")
		public OpenTapsCrmPage clickEditLead()
		{
			click(eleEdit_Lead);
			return new OpenTapsCrmPage();
		}
		
		@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
		private WebElement eleDuplicate_Lead;
		
		@And ("click Duplicate Lead")
		public DuplicateLeadPage clickDuplicateLead()
		{
			click(eleDuplicate_Lead);
			return new DuplicateLeadPage();
		}
		
		@FindBy(how=How.LINK_TEXT,using="Delete")
		private WebElement eleDelete_Lead;
		
		@And ("Click Delete")
		public MyLeadsPage clickDeleteLead()
		{
			click(eleDelete_Lead);
			return new MyLeadsPage();
		}
		
		@FindBy(how=How.ID,using="viewLead_companyName_sp")
		private WebElement eleverifyCompanyName;
		
		@Then("Verify the Company Name as (.*)")
		public ViewLeadPage verifyComName(String data) {
		verifyPartialText(eleverifyCompanyName, data);
			return this;		
		}
		
	/*	@FindBy(how=How.LINK_TEXT,using="Find Leads")
		private WebElement eleFind_btn;
		
		public FindLeadsPage clickFindBtn()
		{
			click(eleFind_btn);
			return new FindLeadsPage();
		}*/
	
}
