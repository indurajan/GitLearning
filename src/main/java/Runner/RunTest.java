

/*@RunWith(Cucumber.class)
@CucumberOptions(features = {"./src/main/java/Feature/CreateLead.feature"}, 
glue= {"pagesnew"},/* tags= {"@smoke, @sanity"},monochrome = true)*/


package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/Feature/CreateLead.feature",glue="pagesnew")
public class RunTest {

}

