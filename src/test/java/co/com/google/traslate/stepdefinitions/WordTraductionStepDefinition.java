package co.com.google.traslate.stepdefinitions;


import co.com.google.traslate.runners.WordTraduction;
import co.com.google.traslate.tasks.WordTraductorReto;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actions.Open;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class WordTraductionStepDefinition {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("sebastian");
    }

    @Given("^User in the google home$")
    public void userInTheGoogleHome() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://google.com/"));
    }

    @When("^User select google traslate$")
    public void userSelectGoogleTraslate() {
        theActorInTheSpotlight().attemptsTo(WordTraductorReto.entermodal());

    }

    @Then("^user write the word what want traslate$")
    public void userWriteTheWordWhatWantTraslate() {

    }
}
