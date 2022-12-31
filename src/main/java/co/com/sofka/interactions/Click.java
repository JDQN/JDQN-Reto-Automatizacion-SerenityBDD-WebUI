package co.com.sofka.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebElement;
import net.serenitybdd.screenplay.targets.Target;

public class Click implements Interaction {
	
	private final Target target;
	
	public Click(Target target) {
		this.target = target;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		WebElement webElement = target.resolveFor(actor).getElement();
		BrowseTheWeb.as(actor).evaluateJavascript("arguments[0].click()",webElement);
	}
	
	public static Click clickOn(Target target){
		return new Click(target);
	}
	
	
}
