package co.com.google.traslate.tasks;

import co.com.google.traslate.userinterface.GoogleHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class WordTraductorReto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GoogleHome.MENUOPTS),
                Click.on(GoogleHome.GOOGLE_TRASLATE)
        );

    }
    public static WordTraductorReto entermodal(){
        return instrumented(WordTraductorReto.class);
    }

}

