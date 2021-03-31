package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\Work_Space_3\\DataDrivenInCucumber\\src\\features\\login3.feature", // the path of feature files
		glue = {"StepDefinition"}, // the path of step definition files
		monochrome = true, // display console output in proper readable format
		strict = true, // it will check if any step is not defined in step definition file
		dryRun = false // to check mapping between feature file and step definition file
		)

public class Runner {

}

// at features keyword - change "login1.feature" to "login0.feature". Accordingly respective step definition methods will be executed.