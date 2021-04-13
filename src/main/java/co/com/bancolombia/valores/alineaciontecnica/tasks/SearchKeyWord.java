package co.com.bancolombia.valores.alineaciontecnica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.bancolombia.valores.alineaciontecnica.userinterfaces.GooglePage.TEXT_BOX_GOOGLE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchKeyWord implements Task {

    private String KeyWord;
    public SearchKeyWord(String keyword){this.KeyWord = keyword;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(TEXT_BOX_GOOGLE,isVisible()).forNoMoreThan(5).seconds());
        actor.attemptsTo(Enter.theValue(KeyWord).into(TEXT_BOX_GOOGLE));
        actor.attemptsTo( Hit.the(Keys.ENTER).into(TEXT_BOX_GOOGLE));
    }

    public static SearchKeyWord laPalabra(String KeyWord){
        return instrumented(SearchKeyWord.class,KeyWord);
    }
}
