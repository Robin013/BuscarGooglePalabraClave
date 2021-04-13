package co.com.bancolombia.valores.alineaciontecnica.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.google.com")
public class GooglePage extends PageObject {
    public static final Target TEXT_BOX_GOOGLE = Target.the("texto").located(By.name("q"));
    public static final Target OFICIAL_LINK = Target.the("Link").located(By.xpath("//a[contains(.,'Bancolombia')]"));
    public static final Target BUSCAR_LINK_OFICIAL = Target.the("Sitio oficial").located(By.xpath("//a[contains(.,'PERSONAS')]"));
}
