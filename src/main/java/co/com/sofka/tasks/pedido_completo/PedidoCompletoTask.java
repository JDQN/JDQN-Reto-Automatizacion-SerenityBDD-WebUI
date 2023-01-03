package co.com.sofka.tasks.pedido_completo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.sofka.interactions.Click.clickOn;
import static co.com.sofka.product_interface.pagina_oferta.BrowserPaginaOferta.PEDIDOCOMPLETO;
import static jxl.biff.FormatRecord.logger;


public class PedidoCompletoTask implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		try {
			actor.attemptsTo(
					clickOn(PEDIDOCOMPLETO)
			);
		} catch (Exception exception) {
			logger.error("Error: ", exception);
		}
	}
	
	public static PedidoCompletoTask pedidoCompletoTask() {
		return new PedidoCompletoTask();
	}
}
