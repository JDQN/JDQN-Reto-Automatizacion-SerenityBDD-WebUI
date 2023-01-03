package co.com.sofka.tasks.pagina_oferta;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.DoubleClickOnTarget;

import static co.com.sofka.product_interface.pagina_oferta.BrowserPaginaOferta.ELEMENTS;
import static jxl.biff.FormatRecord.logger;


/**
 * Esta clase permite ejecutar los metodos relacionados con
 * darle click al check utilizando js
 * @class PaginaOferta
 * @author jdquimbayo72@misena.edu.co
 */
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
