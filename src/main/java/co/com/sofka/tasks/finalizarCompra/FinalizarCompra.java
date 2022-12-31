package co.com.sofka.tasks.finalizarCompra;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.productInterface.paginaOferta.BrowserPaginaOferta.*;

public class FinalizarCompra implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			actor.attemptsTo(
					Click.on(AGREGARCART),
					Scroll.to(BTNFINALIZAR),
					Click.on(FINALIZAR)
			);
		}catch (Exception exception) {
			throw new RuntimeException(exception);
		}
	}
	
	public static FinalizarCompra finalizarCompra(){
		return new FinalizarCompra();
	}
	
}
