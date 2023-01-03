package co.com.sofka.tasks;

import co.com.sofka.product_interface.landing_page.LandingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static jxl.biff.FormatRecord.logger;

public class openLandingPage implements Task {
	
	private LandingPage landingPage;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		try {
			actor.attemptsTo(
					Open.browserOn(landingPage)
			);
		} catch (Exception exception) {
			logger.error("Error: ", exception);
		}
	}
	
	public static openLandingPage openLandingPage() {
		return new openLandingPage();
	}
}
