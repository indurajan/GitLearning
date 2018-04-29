package pagesnew;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	import cucumber.api.java.en.And;
	import wdMethods.ProjectMethods;

	public class MyLeadsPage extends ProjectMethods {

		public MyLeadsPage() {
			PageFactory.initElements(driver, this);
		}

		@FindBy(how = How.LINK_TEXT, using = "Create Lead")
		private WebElement CreateLeads_btn;

		@And("Click Create Leads")
		public CreateLeadsPage clickCreateLeads_btn() {

			click(CreateLeads_btn);
			return new CreateLeadsPage();
		}

	/*	@FindBy(how = How.LINK_TEXT, using = "Find Leads")
		private WebElement eleFind_Lead;
		
		@And("Click Find Leads")
		public FindLeadsPage clickFindLead() {
			click(eleFind_Lead);
			return new FindLeadsPage();
		}*/


		@FindBy(how = How.LINK_TEXT, using = "Merge Leads")
		private WebElement eleMerge_Lead;

		@And ("Click Merge Leads")
		public MergeLeadPage clickMergeLead() {
			click(eleMerge_Lead);
			return new MergeLeadPage();
		}

	
}
