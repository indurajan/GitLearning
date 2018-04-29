package pagesnew;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	import cucumber.api.java.en.And;
	import cucumber.api.java.en.Then;
	import wdMethods.ProjectMethods;

	public class DuplicateLeadPage extends ProjectMethods{
		public DuplicateLeadPage() {
			PageFactory.initElements(driver, this);
		}

		@Then ("Verify title as (.*)")
		public DuplicateLeadPage verifyTitlePage(String title)
		{
			verifyTitle(title);
			return this;
			
		}
			
		@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
		private WebElement eleCreate_btn;
		
		@And ("Click create Lead")
		public ViewLeadPage clickCreateButton() {
			click(eleCreate_btn);
			return new ViewLeadPage();		
		}
	}


