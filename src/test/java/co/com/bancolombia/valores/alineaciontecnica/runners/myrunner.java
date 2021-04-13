package co.com.bancolombia.valores.alineaciontecnica.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/consultar_informacion.feature",
        glue = "co.com.bancolombia.valores.alineaciontecnica.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class myrunner {
}
