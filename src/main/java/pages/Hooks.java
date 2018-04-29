package pages;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;	

	public class Hooks extends SeMethods {
		
		public String browserName="chrome";
		
		
		@Before
		public void beforeMethod(Scenario sc) {
			startResult();
			startTestModule(sc.getName(), sc.getId());
			test = startTestCase("test");
			test.assignCategory("testCategory");
			test.assignAuthor("Vino");
			startApp(browserName);
			
		}
		
		@After
		public void afterMethod() {
			endResult();
			closeAllBrowsers();
			
		}

	}

