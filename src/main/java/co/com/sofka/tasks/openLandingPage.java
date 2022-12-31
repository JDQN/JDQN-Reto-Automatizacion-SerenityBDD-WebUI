package co.com.sofka.tasks;

import co.com.sofka.productInterface.landingPage.LandingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class openLandingPage implements Task {
	
	private LandingPage landingPage;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Open.browserOn(landingPage)
		);
	}
	
	public static openLandingPage openLandingPage(){
		return new openLandingPage();
	}
}
