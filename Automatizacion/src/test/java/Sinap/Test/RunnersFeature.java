package Sinap.Test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features" }, glue = { "Sinap.Definitions" })

public class RunnersFeature {

}
