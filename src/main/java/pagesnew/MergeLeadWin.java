package pagesnew;
	import org.openqa.selenium.support.PageFactory;

	import cucumber.api.java.en.And;
	import wdMethods.ProjectMethods;

	public class MergeLeadWin extends ProjectMethods{
		public MergeLeadWin() {
			PageFactory.initElements(driver, this);
		}
		@And ("Switch To Primary Window")
		public MergeLeadPage moveToWindow() {
			switchToWindow(0);
			return new MergeLeadPage();
		}
	

}
