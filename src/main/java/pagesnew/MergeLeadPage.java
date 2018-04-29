package pagesnew;

	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	import cucumber.api.java.en.And;
	import cucumber.api.java.en.Then;
	import wdMethods.ProjectMethods;

	public class MergeLeadPage extends ProjectMethods {

		public MergeLeadPage() {
			PageFactory.initElements(driver, this);
		}

		
		@FindBy(how = How.XPATH, using = "//input[@id='ComboBox_partyIdFrom']/following::img")
		private WebElement eleIcon1_Lead;

		@And ("Click FromLead Icon")
		public MergeLeadPage clickFromLead() {
			clickWithNoSnap(eleIcon1_Lead);
		
			return this;
		}
		
		@Then ("Move To NewWindow")
		public SubFindLeadPage moveToWindow() {
			switchToWindow(1);
			return new SubFindLeadPage();
		}
		
		@FindBy(how = How.XPATH, using = "//input[@id='ComboBox_partyIdFrom']/following::img[2]")
		private WebElement eleIcon2_Lead;
		
		@And ("Click ToLead Id")
		public MergeLeadPage clickToLead() {
			clickWithNoSnap(eleIcon2_Lead);
		
			return this;
		}
		
		@FindBy(how = How.LINK_TEXT, using = "Merge")
		private WebElement eleMerge_btn;
		
		@Then ("Click Merge Button")
		public MergeLeadPage clickMerge() {
			clickWithNoSnap(eleMerge_btn);
		
			return this;
		}
		
		@And ("Accept the Alert")
		public  ViewLeadPage alert()
		{
			acceptAlert();
			return new ViewLeadPage();
		}
		
		
		
}
