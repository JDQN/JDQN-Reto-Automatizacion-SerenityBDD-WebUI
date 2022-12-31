package co.com.sofka.tasks.realizarPedido;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.interactions.Click.clickOn;
import static co.com.sofka.productInterface.paginaOferta.BrowserPaginaOferta.CLICKCHECK;
import static co.com.sofka.productInterface.paginaOferta.BrowserPaginaOferta.REALIZARPEDIDO;


public class RealizarPedidoTask implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			actor.attemptsTo(
					Scroll.to(REALIZARPEDIDO),
					clickOn(REALIZARPEDIDO)
			);
		}catch (Exception exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public static RealizarPedidoTask realizarPedidoTask(){
		return new RealizarPedidoTask();
	}
	
}
