package co.com.sofka.productInterface.paginaOferta;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.By.*;

public class BrowserPaginaOferta extends PageObject {
	
	public static final Target ELEMENTS = Target
          .the("Boton Ofertas")
          .located(xpath("//header/div[1]/div[3]/div[1]/div[1]/ul[1]/div[1]/ul[1]/li[2]/a[1]"));
	
	public static final Target AGREGARCART = Target
		     .the("Boton Ofertas")
		     .located(linkText("AÑADIR AL CARRITO"));
	
	public static final Target CLOSE = Target
           .the("btnClose")
           .located(xpath("//body/div[2]/button[1]"));
	
	public static final Target BTNFINALIZAR = Target
           .the("Boton Ofertas")
           .located(linkText("FINALIZAR COMPRA"));
	
	public static final Target FINALIZAR = Target
           .the("btnClose")
           .located(xpath("//a[contains(text(),'Finalizar compra')]"));
	
	
}
