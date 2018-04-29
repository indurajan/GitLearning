package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods {
		
		public DuplicateLead() {		
			PageFactory.initElements(driver,this);
		}	
		@FindBy(how=How.LINK_TEXT,using="Duplicate Lead | opentaps CRM")
		private WebElement eleVerifyDupTitle;
		@And("Verify the Duplicate Lead Title text as (.*)")
		public DuplicateLead VerifyTitle(String Title) {
			driver.getTitle();
			return new DuplicateLead();
		}

		
		@FindBy(how=How.CLASS_NAME,using="smallSubmit")
		private WebElement eleDupcrLead;
		@When("Click on Create duplicate Lead button")
		public ViewLead ClickDupCrLeadbtn() {
		click(eleDupcrLead);
			return new ViewLead();		
		}

	}
