package co.com.sofka.tasks.terminosCondiciones;

import co.com.sofka.tasks.paginaOferta.PaginaOferta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.interactions.Click.clickOn;
import static co.com.sofka.productInterface.paginaOferta.BrowserPaginaOferta.*;

public class TerminosCondiciones implements Task {
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Scroll.to(CLICKCHECK),
				clickOn(CLICKCHECK)
		);
	}
	
	public static TerminosCondiciones terminosCondiciones(){
		return new TerminosCondiciones();
	}
}