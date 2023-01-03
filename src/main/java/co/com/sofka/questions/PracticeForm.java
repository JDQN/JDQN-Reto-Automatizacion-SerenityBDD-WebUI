package co.com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.productInterface.facturaEnvio.FacturaEnvioInterface.*;

public class PracticeForm implements Question<Boolean> {
	
	private String id;
	
	public PracticeForm wasFilledWithId(String id) {
		this.id = id;
		return this;
	}
	
	
	public PracticeForm is() {
		return this;
	}
	
	@Override
	public Boolean answeredBy(Actor actor) {
		return
				(CEDULAINVALIDA.resolveFor(actor).containsOnlyText(id));
	}
	
	public static PracticeForm practiceForm(){
		return new PracticeForm();
	}
}
