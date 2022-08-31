package co.com.google.traslate.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/google_traslate.feature",
        glue = "co.com.google.traslate.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class WordTraduction {
}
