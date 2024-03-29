package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "./src/test/resources/featureFiles/Feature1.feature",
		"./src/test/resources/featureFiles/Feature2.feature",
		"./src/test/resources/featureFiles/Feature3.feature" }, tags = "(@Functional or @System) and @smoke")

public class FeatureTagsTest {

}
