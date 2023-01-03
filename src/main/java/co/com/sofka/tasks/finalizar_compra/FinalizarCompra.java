package co.com.sofka.tasks.finalizar_compra;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.product_interface.pagina_oferta.BrowserPaginaOferta.*;
import static jxl.biff.FormatRecord.logger;

public class FinalizarCompra implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			actor.attemptsTo(
					Click.on(AGREGARCART),
					Scroll.to(BTNFINALIZAR),
					Click.on(BTNFINALIZAR)
			);
		} catch (Exception exception) {
			logger.error("Error: ", exception);
		}
	}
	
	public static FinalizarCompra finalizarCompra() {
		return new FinalizarCompra();
	}
	
}
