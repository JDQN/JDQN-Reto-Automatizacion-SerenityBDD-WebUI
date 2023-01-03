package co.com.sofka.tasks.realizar_pedido;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.interactions.Click.clickOn;
import static co.com.sofka.product_interface.pagina_oferta.BrowserPaginaOferta.REALIZARPEDIDO;

/**
 * Esta clase permite ejecutar los metodos para hacer scroll a la pagina
 * y poder dar click en realizar pedido
 * @class RealizarPedidoTask
 * @author jdquimbayo72@misena.edu.co
 */
public class RealizarPedidoTask implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			actor.attemptsTo(
					Scroll.to(REALIZARPEDIDO),
					clickOn(REALIZARPEDIDO)
			);
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public static RealizarPedidoTask realizarPedidoTask() {
		return new RealizarPedidoTask();
	}
	
}
