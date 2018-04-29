package pagesnew;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	import cucumber.api.java.en.And;
	import wdMethods.ProjectMethods;

	public class SubFindLeadPage extends ProjectMethods{
		String str;
		public SubFindLeadPage () {
			PageFactory.initElements(driver, this);
		}
		//Enter from lead id
		@FindBy(how = How.XPATH, using = "//input[@name='id']")
		private WebElement eleLeadId;

		@And ("Enter the From LeadID as (.*)")
		public SubFindLeadPage enterFromLeadId(String leadId) {
			type(eleLeadId,leadId);
			return this;
		}
		
		//Enter To lead id
		@FindBy(how = How.XPATH, using = "//label[text()='Lead ID:']/following::input")
		private WebElement eleLeadId2;

		@And ("Enter the To LeadID as (.*)")
		public SubFindLeadPage enterToLeadId(String leadId) {
			type(eleLeadId2,leadId);
			return this;
		}
		
		@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")
		private WebElement eleFind_Btn;

		@And ("Click Find Button")
		public SubFindLeadPage clickFindLead() {
			clickWithNoSnap(eleFind_Btn);
			return this;
		}
		
		
		/*public SubFindLeadPage webwait() {
			webDriverWait("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
			return this;
		}*/
		
		@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a")
		private WebElement eleFirst_Lead;

		@And("Click First Lead")
		public MergeLeadWin clickFirstLead() {
			clickWithNoSnap(eleFirst_Lead);
		
			return new MergeLeadWin();
		}
		
		
}
