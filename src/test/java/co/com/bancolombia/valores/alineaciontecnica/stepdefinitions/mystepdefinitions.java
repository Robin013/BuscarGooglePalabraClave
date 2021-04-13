package co.com.bancolombia.valores.alineaciontecnica.stepdefinitions;

import co.com.bancolombia.valores.alineaciontecnica.question.VerSitioOficial;
import co.com.bancolombia.valores.alineaciontecnica.tasks.NavegarSite;
import co.com.bancolombia.valores.alineaciontecnica.tasks.OpenSearchMotor;
import co.com.bancolombia.valores.alineaciontecnica.tasks.SearchKeyWord;
import co.com.bancolombia.valores.alineaciontecnica.userinterfaces.GooglePage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class mystepdefinitions {

    @Managed(driver="chrome")
    private WebDriver elDriver;
    private Actor actor = Actor.named("cliente");
    GooglePage googlePage = new GooglePage();


    @Before
    public void Init(){
    actor.can(BrowseTheWeb.with(elDriver));
    }

    @After
    public void End(){elDriver.close();}

    @Given("^el sitio del motor de busqueda de Google$")
    public void elSitioDelMotorDeBusquedaDeGoogle() {
        actor.wasAbleTo(OpenSearchMotor.on(googlePage));
    }

    @When("^cuando digito la palabra a buscar (.*)$")
    public void cuandoDigitoLaPalabraABuscarBancolombia(String palabraClave) {

       actor.wasAbleTo(SearchKeyWord.laPalabra(palabraClave));
    }

    @When("^puedo navegar al sitio oficial$")
    public void puedoNavegarSitioOficial()
    {
        actor.attemptsTo(NavegarSite.elLink());
    }

    @Then("puedo ver por el sitio oficial")
    public void verElSiioOficial(){
        actor.should(GivenWhenThen.seeThat(VerSitioOficial.elSitio()));
    }

}


