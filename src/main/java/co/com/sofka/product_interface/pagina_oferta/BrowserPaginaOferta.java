package co.com.sofka.product_interface.pagina_oferta;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;

public class BrowserPaginaOferta extends PageObject {
	
	public static final Target ELEMENTS = Target
          .the("Boton Ofertas")
          .located(xpath("//header/div[1]/div[3]/div[1]/div[1]/ul[1]/div[1]/ul[1]/li[2]/a[1]"));
	
	public static final Target AGREGARCART = Target
		     .the("Boton añadir al carrito")
		     .located(linkText("AÑADIR AL CARRITO"));
	
	public static final Target CLOSE = Target
           .the("btnClose")
           .located(xpath("//body/div[2]/button[1]"));
	
	public static final Target BTNFINALIZAR = Target
           .the("Boton Finalizar compra")
           .located(linkText("FINALIZAR COMPRA"));
	
	public static final Target CLICKCHECK = Target
            .the("Check Box")
            .located(id("terms"));
	
	public static final Target REALIZARPEDIDO = Target
          .the("Btn Realizar Pedido")
          .located(xpath("//button[@id='place_order']"));
	
	public static final Target PEDIDOCOMPLETO = Target
           .the("Pedido Completo")
           .located(xpath("//h2[contains(text(),'CONVENIO RECAUDO ZONA FIT – BALOTO')]"));
	
	
}
