package pagesnew;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	import cucumber.api.java.en.And;
	import wdMethods.ProjectMethods;

	public class MyHomePage extends ProjectMethods{
		
		public MyHomePage() {		
			PageFactory.initElements(driver,this);
		}	
		
			
		@FindBy(how=How.LINK_TEXT,using="Leads")
		private WebElement Leads_btn;
		
		@And ("Click Leads")
		public MyLeadsPage clickLeads_btn() {
			
			click(Leads_btn);
			return new MyLeadsPage();		
		}
	
}
