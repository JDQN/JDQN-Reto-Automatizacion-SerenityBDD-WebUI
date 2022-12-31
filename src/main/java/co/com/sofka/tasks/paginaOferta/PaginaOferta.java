package co.com.sofka.tasks.paginaOferta;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClickOnTarget;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.productInterface.paginaOferta.BrowserPaginaOferta.ELEMENTS;

public class PaginaOferta implements Task {
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				new DoubleClickOnTarget(ELEMENTS)
		);
	}
	
	public static PaginaOferta paginaOferta(){
		return new PaginaOferta();
	}
}
