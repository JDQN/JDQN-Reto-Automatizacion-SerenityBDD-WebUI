package co.com.sofka.step_definitions;

import co.com.sofka.exceptions.ValidationTextDoNotMatch;
import co.com.sofka.models.FacturaEnvio;
import co.com.sofka.runners.CompraNoExitosaRunner;
import co.com.sofka.setups.Setup;
import co.com.sofka.tasks.factura_envio.FacturaEnvioTask;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Performable;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;

import static co.com.sofka.exceptions.ValidationTextDoNotMatch.VALIDATION_DO_NOT_MATCH;
import static co.com.sofka.questions.PracticeForm.practiceForm;
import static co.com.sofka.tasks.agregar_carrito.AgregarCarrito.agregarCarrito;
import static co.com.sofka.tasks.finalizar_compra.FinalizarCompra.finalizarCompra;
import static co.com.sofka.tasks.openLandingPage.openLandingPage;
import static co.com.sofka.tasks.pagina_oferta.PaginaOferta.paginaOferta;
import static co.com.sofka.tasks.realizar_pedido.RealizarPedidoTask.realizarPedidoTask;
import static co.com.sofka.tasks.terminos_condiciones.TerminosCondiciones.terminosCondiciones;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;


/**
 * Esta clase permite ejecutar los pasos
 * de los features
 * @class CompraNoExitosaStepDefinition
 * @author jdquimbayo72@misena.edu.co
 */
public class CompraNoExitosaStepDefinition extends Setup{
	
	
	private static final Logger LOGGER = Logger.getLogger(CompraNoExitosaRunner.class);
	private static final String ACTOR_NAME = "Messi";
	private static FacturaEnvio facturaEnvio;

	
	@Given("el usuario esta en la pagina de inicio del aplicativo")
	public void elUsuarioEstaEnLaPaginaDeInicioDelAplicativo() {
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
	
	
	@When("selecciona los productos para agreagar al carrtio de compras")
	public void seleccionaLosProductosParaAgreagarAlCarrtioDeCompras() {
		try {
			theActorInTheSpotlight().attemptsTo(
					(Performable) paginaOferta(),
					agregarCarrito(),
					agregarCarrito(),
					agregarCarrito()
			);
		}catch (Exception exception){
			Assertions.fail(exception.getMessage(), exception);
			LOGGER.error(exception.getMessage(), exception);
		}
	}
	
	@And("da click en finalizar compra")
	public void daClickEnFinalizarCompra() {
		try {
			theActorInTheSpotlight().attemptsTo(
					(Performable) paginaOferta(),
					finalizarCompra()
			);
		}catch (Exception exception){
			Assertions.fail(exception.getMessage(), exception);
			LOGGER.error(exception.getMessage(), exception);
		}
	}
	
	@And("diligencia el formulario sin ingresar numero de cedula")
	public void diligenciaElFormularioSinIngresarNumeroDeCedula() {
		try {
			UsuarioData();
			theActorInTheSpotlight().attemptsTo(
					FacturaEnvioTask.withId(String.valueOf(facturaEnvio.getId()))
							.usingEmail(facturaEnvio.getEmail())
							.usingFirsName(facturaEnvio.getFirstName())
							.usingLastName(facturaEnvio.getLastName())
							.usingDepartamento(facturaEnvio.getDepartamento())
							.usingCiudad(facturaEnvio.getCiudad())
							.usingAddress(facturaEnvio.getAddress())
							.usingBuildingNumber(facturaEnvio.getBuildingNumber())
							.andPassword(facturaEnvio.getPhoneNumber()),
					
					terminosCondiciones(),
					realizarPedidoTask()
			);
		}catch (Exception exception){
			Assertions.fail(exception.getMessage(), exception);
			LOGGER.error(exception.getMessage(), exception);
		}
	}
	
	@Then("aparece un mensaje Ingresa tu Documento de Identidad.")
	public void apareceUnMensajeIngresaTuDocumentoDeIdentidad() {
		try {
			theActorInTheSpotlight()
				.should(
						seeThat(
				practiceForm()
							.wasFilledWithId("Ingresa tu Documento de Identidad.")
							.is(),equalTo(true))
							.orComplainWith(
							ValidationTextDoNotMatch.class,
							String.format(VALIDATION_DO_NOT_MATCH, "Ingresa tu Documento de Identidad")
						));
		}catch (Exception exception){
			Assertions.fail(exception.getMessage(), exception);
			LOGGER.error(exception.getMessage(), exception);
		}
	}

	
	private static void UsuarioData() {
		
		Faker faker = new Faker();
		String id = String.valueOf("");
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		String departamento = "Amazonas";
		String ciudad = "La Pedrera - 917010";
		String email = firstName + lastName + "@gmail.com";
		String address = faker.address().fullAddress();
		String buildingNumber = faker.address().buildingNumber();
		String phoneNumber = ("");
		
		facturaEnvio = new FacturaEnvio(id, email, firstName, lastName, departamento, ciudad, address, buildingNumber, phoneNumber);
		
	}
	
}
