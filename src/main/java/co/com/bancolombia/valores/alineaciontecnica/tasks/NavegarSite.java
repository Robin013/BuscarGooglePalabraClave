package co.com.bancolombia.valores.alineaciontecnica.tasks;

import co.com.bancolombia.valores.alineaciontecnica.userinterfaces.GooglePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class NavegarSite implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(GooglePage.OFICIAL_LINK));
    }

    public static NavegarSite elLink(){

        return Tasks.instrumented(NavegarSite.class);
    }
}
