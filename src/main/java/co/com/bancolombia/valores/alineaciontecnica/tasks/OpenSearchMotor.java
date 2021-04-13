package co.com.bancolombia.valores.alineaciontecnica.tasks;

import co.com.bancolombia.valores.alineaciontecnica.userinterfaces.GooglePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.valores.alineaciontecnica.userinterfaces.GooglePage.TEXT_BOX_GOOGLE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class OpenSearchMotor implements Task {
    private PageObject page;

    public OpenSearchMotor(PageObject page){this.page= page;}

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Open.browserOn(page));
    }

    public static OpenSearchMotor on(PageObject page){
        return Tasks.instrumented(OpenSearchMotor.class,page);
    }
}
