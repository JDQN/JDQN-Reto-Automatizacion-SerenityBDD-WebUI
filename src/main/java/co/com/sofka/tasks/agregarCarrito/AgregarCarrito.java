package co.com.sofka.tasks.agregarCarrito;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.productInterface.paginaOferta.BrowserPaginaOferta.*;

public class AgregarCarrito implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
			try {
				actor.attemptsTo(
						Scroll.to(AGREGARCART),
						Click.on(AGREGARCART),
						Click.on(CLOSE)
				);
			}catch (Exception exception){
				throw new RuntimeException(exception);
			}
	}
	
	public static AgregarCarrito agregarCarrito(){
		return new AgregarCarrito();
	}
}
