package co.com.sofka.tasks.pagina_oferta;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.DoubleClickOnTarget;

import static co.com.sofka.product_interface.pagina_oferta.BrowserPaginaOferta.ELEMENTS;
import static jxl.biff.FormatRecord.logger;

public class PaginaOferta implements Task {
	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			actor.attemptsTo(
					new DoubleClickOnTarget(ELEMENTS)
			);
		} catch (Exception exception) {
			logger.error("Error: ", exception);
		}
	}
	
	public static PaginaOferta paginaOferta() {
		return new PaginaOferta();
	}
}
