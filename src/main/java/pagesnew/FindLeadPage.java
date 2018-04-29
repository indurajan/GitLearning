package pagesnew;

	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	import cucumber.api.java.en.And;
	import wdMethods.ProjectMethods;

	public class FindLeadPage extends ProjectMethods{
		
		public FindLeadPage() {
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[2]")
		private WebElement eleFirstName;
		@And("Enter the firstName as (.*)")
		public FindLeadPage enterFirstName(String data) {
			type(eleFirstName, data);
			return this;
		}
		
		
		
		@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
		private WebElement eleFind_btn;
		
		@And("Click Find button")
		public FindLeadPage clickFindButton() {
			click(eleFind_btn);
			return this;		
		}
		
		@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a")
		private WebElement eleFirst_Lead;
		
		@And("Click First resulting lead")
		public ViewLeadPage ClickFirstLead() {
			click(eleFirst_Lead);
			return new ViewLeadPage();		
		}
		
		@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a")
		private WebElement eleFirst_Lead_ID;
		
		@And ("Enter the ID")
		public FindLeadPage captureFirstLeadID() {
			String firstLeadID = getText(eleFirst_Lead_ID);
			return this;		
		}
		
		@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]/a")
		private WebElement eleFirst_Name;
		
		public FindLeadPage captureFirstName() {
			String firstLeadID = getText(eleFirst_Name);
			System.out.println(firstLeadID);
			return this;		
		}
		
		
		@FindBy(how=How.XPATH,using="//span[text()='Phone']")
		private WebElement elePhone_btn;
		
		@And("Click Phone")
		public FindLeadPage clickPhoneButton() {
			click(elePhone_btn);
			return this;		
		}
		
		
		@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
		private WebElement elePhoneNumber;
		
		@And("Enter the PhoneNumber as (.*)")
		public FindLeadPage enterPhoneNumber(String data) {
			type(elePhoneNumber,data);
			return this;		
		}
		
		@FindBy(how=How.XPATH,using="//span[text()='Email']")
		private WebElement eleEmail;
		
		@And ("Click Email")
		public FindLeadPage clickEmail(){
			click(eleEmail);
			return this;		
		}
		
		@FindBy(how=How.XPATH,using="//input[@name='emailAddress']")
		private WebElement eleEmailAddress;
		
		@And ("Enter the Email as (.*)")
		public FindLeadPage enterEmailI(String data) {
			type(eleEmailAddress,data);
			return this;		
		}
		
		@FindBy(how=How.XPATH,using="//div[@class='x-paging-info']")
		private WebElement eleverifyErrorMsg;
		
		public FindLeadPage verifyErrMsg(String data) {
		verifyPartialText(eleverifyErrorMsg, data);
			return this;		
		}
		
		@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input")
		private WebElement eleLeadId;
		
		@And ("Enter the Lead Id as (.*)")
		public FindLeadPage enterLeadID(String data)
		{
			type(eleLeadId,data);
			return this;
		}
		
	
}
