package testRunners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/featureFiles/ScenarioTagging.feature",tags="@sanity and not @regression",plugin={"pretty"
,"html:target/HTML/report.html","json:target/JSON/report.json","junit:target/JUNIT/report.xml"})
public class ScenarioTagsTest {
	
}
