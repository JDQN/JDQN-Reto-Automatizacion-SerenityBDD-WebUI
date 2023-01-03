package co.com.sofka.tasks.terminos_condiciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.interactions.Click.clickOn;
import static co.com.sofka.product_interface.pagina_oferta.BrowserPaginaOferta.*;
import static jxl.biff.FormatRecord.logger;

public class TerminosCondiciones implements Task {
	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			actor.attemptsTo(
					Scroll.to(CLICKCHECK),
					clickOn(CLICKCHECK)
			);
		} catch (Exception exception) {
			logger.error("Error: ", exception);
		}
	}
	
	public static TerminosCondiciones terminosCondiciones() {
		return new TerminosCondiciones();
	}
}