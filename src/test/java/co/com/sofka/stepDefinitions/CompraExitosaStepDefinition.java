package co.com.sofka.stepDefinitions;

import co.com.sofka.models.FacturaEnvio;
import co.com.sofka.runners.CompraExitosaRunner;
import co.com.sofka.setups.Setup;

import co.com.sofka.tasks.facturaEnvio.FacturaEnvioTask;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.Performable;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;

import static co.com.sofka.tasks.finalizarCompra.FinalizarCompra.finalizarCompra;
import static co.com.sofka.tasks.openLandingPage.openLandingPage;
import static co.com.sofka.tasks.paginaOferta.PaginaOferta.paginaOferta;
import static co.com.sofka.tasks.agregarCarrito.AgregarCarrito.agregarCarrito;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;




public class CompraExitosaStepDefinition extends Setup {
	
	private static final Logger LOGGER = Logger.getLogger(CompraExitosaRunner.class);
	private static final String ACTOR_NAME = "Messi";
	private static FacturaEnvio facturaEnvio;
	
	@Given("el usuario esta en la pagina de inicio del aplicativo zonafit")
	public void elUsuarioEstaEnLaPaginaDeInicioDelAplicativoZonafit() {
		try {
			actorSetupTheBrowser(ACTOR_NAME);
			theActorInTheSpotlight().wasAbleTo(
					openLandingPage()
			);
		}catch (Exception exception){
			Assertions.fail(exception.getMessage(), exception);
			LOGGER.error(exception.getMessage(), exception);
		}
	}
	@When("selecciono los productos para agregar al carrtio de compras")
	public void seleccionoLosProductosParaAgregarAlCarrtioDeCompras() {
		try {
			theActorInTheSpotlight().attemptsTo(
					(Performable) paginaOferta(),
					agregarCarrito(),
					agregarCarrito(),
					agregarCarrito()
			);
			Thread.sleep(6000);
		}catch (Exception exception){
			Assertions.fail(exception.getMessage(), exception);
			LOGGER.error(exception.getMessage(), exception);
		}
	}
	@And("da click en finalizar compra diligenciar el formulario correctamente")
	public void daClickEnFinalizarCompraDiligenciarElFormularioCorrectamente() {
		try {
			theActorInTheSpotlight().attemptsTo(
					finalizarCompra()
			);
			Thread.sleep(6000);
		}catch (Exception exception){
			Assertions.fail(exception.getMessage(), exception);
			LOGGER.error(exception.getMessage(), exception);
		}
	}
	@Then("aparece un mensaje Gracias. Tu pedido ha sido recibido.")
	public void apareceUnMensajeGraciasTuPedidoHaSidoRecibido() {
		try {
			UsuarioData();
			theActorInTheSpotlight().attemptsTo(
				FacturaEnvioTask.withId(String.valueOf(facturaEnvio.getId()))
						.usingEmail(facturaEnvio.getEmail())
						.usingFirsName(facturaEnvio.getFirstName())
						.usingLastName(facturaEnvio.getLastName())
						.usingAddress(facturaEnvio.getAddress())
						.usingBuildingNumber(facturaEnvio.getBuildingNumber())
						.andPassword(facturaEnvio.getPhoneNumber())
			);
		}catch (Exception exception){
			Assertions.fail(exception.getMessage(), exception);
			LOGGER.error(exception.getMessage(), exception);
		}
	}
	
	
	private static void UsuarioData(){
		
		Faker faker = new Faker();
		String id = String.valueOf(faker.number().numberBetween(100000,1000000));
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		String email = firstName + lastName + "@gmail.com";
		String address = faker.address().fullAddress();
		String buildingNumber = faker.address().buildingNumber();
		String phoneNumber = faker.phoneNumber().cellPhone();
		
		facturaEnvio = new FacturaEnvio (id,email,firstName,lastName,address,buildingNumber,phoneNumber);
		
	}
	
}
