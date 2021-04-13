package co.com.bancolombia.valores.alineaciontecnica.question;

import co.com.bancolombia.valores.alineaciontecnica.userinterfaces.GooglePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.questions.Text;


public class VerSitioOficial implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        if (Text.of(GooglePage.BUSCAR_LINK_OFICIAL).viewedBy(actor).value().contains("PERSONAS")){
            return true;
        }
        return false;
    }

    public static VerSitioOficial elSitio(){
      return new  VerSitioOficial();   }
}
