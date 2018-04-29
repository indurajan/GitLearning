package pagesnew;

	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	import cucumber.api.java.en.And;
	import wdMethods.ProjectMethods;

	public class OpenTapsCrmPage extends ProjectMethods{
		
		public OpenTapsCrmPage() {
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(how=How.ID,using="updateLeadForm_companyName")
		private WebElement eleCompanyName;
		
		@And("Enter the CompanyName as (.*)")
		public OpenTapsCrmPage editCompanyName(String data) {
		type(eleCompanyName, data);
			return this;		
		}
		
		@FindBy(how=How.CLASS_NAME,using="smallSubmit")
		private WebElement eleupdate;
		
		@And("Click Update")
		public ViewLeadPage clickUpdate()
		{
			click(eleupdate);
			return new ViewLeadPage();
		}
		
	
}
