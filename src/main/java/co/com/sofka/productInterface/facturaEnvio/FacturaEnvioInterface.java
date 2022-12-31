package co.com.sofka.productInterface.facturaEnvio;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;

public class FacturaEnvioInterface extends PageObject {
	
	
	public static final Target ID =Target
          .the("Numero de documento")
          .located(id("billing_myfield12"));
	
	
	public static final Target EMAIL = Target
          .the("Email")
          .located(id("billing_email"));
	
	
	public static final Target FIRST_NAME = Target
         .the("Nombre")
         .located(id("billing_first_name"));
	
	
	public static final Target lAST_NAME = Target
           .the("Apellido")
           .located(id("billing_last_name"));
	
	
	public static final Target ADDRESS = Target
            .the("Direccion")
            .located(id("billing_address_1"));
	
	
	public static final Target  BUILDING_NUMBER = Target
          .the("Apartamento")
          .located(id("billing_address_2"));
	
	
	public static final Target PHONE_NUMBER = Target
	         .the("Numero de celular")
	         .located(id("billing_phone"));
	
}