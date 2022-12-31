package co.com.sofka.tasks.pedidoCompleto;

import co.com.sofka.tasks.terminosCondiciones.TerminosCondiciones;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.interactions.Click.clickOn;
import static co.com.sofka.productInterface.paginaOferta.BrowserPaginaOferta.PEDIDOCOMPLETO;


public class PedidoCompletoTask implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				clickOn(PEDIDOCOMPLETO)
		);
	}
	
	public static PedidoCompletoTask pedidoCompletoTask(){
		return new PedidoCompletoTask();
	}
}
