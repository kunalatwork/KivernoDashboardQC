package KivernoRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="C:\\Users\\lakhan\\SiA-Digital\\Kiverno-FrontEnd\\features\\KivernoFrontEnd.feature",
		glue = "KivernoStepDefination",
		dryRun = false,
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome=true
		)
public class Runner {

}