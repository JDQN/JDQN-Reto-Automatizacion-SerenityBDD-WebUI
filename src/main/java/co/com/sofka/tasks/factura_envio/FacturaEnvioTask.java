package co.com.sofka.tasks.factura_envio;

import co.com.sofka.models.FacturaEnvio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.sofka.product_interface.factura_envio.FacturaEnvioInterface.*;


/**
 * Esta clase permite ejecutar los metodos relacionados con el
 * formulario para rellenar los campos
 * @class FacturaEnvioTask
 * @class ResgistroUsuario
 * @author jdquimbayo72@misena.edu.co
 */
public class FacturaEnvioTask implements Task {
	
	private final FacturaEnvio formularioEnvio;
	
	public FacturaEnvioTask(FacturaEnvio formularioEnvio) {
		this.formularioEnvio = formularioEnvio;
	}
	
	public static ResgistroUsuario withId(String id) {
		return new ResgistroUsuario(id);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				
				Scroll.to(ID),
				Clear.field(ID),
				Enter.theValue(formularioEnvio.getId()).into(ID),
				
				Scroll.to(EMAIL),
				Clear.field(EMAIL),
				Enter.theValue(formularioEnvio.getEmail()).into(EMAIL),
				
				Scroll.to(FIRST_NAME),
				Clear.field(FIRST_NAME),
				Enter.theValue(formularioEnvio.getFirstName()).into(FIRST_NAME),
				
				
				Scroll.to(lAST_NAME),
				Clear.field(lAST_NAME),
				Enter.theValue(formularioEnvio.getLastName()).into(lAST_NAME),
				
				Scroll.to(CLICK_DEPARTMENT),
				SelectFromOptions.byVisibleText(formularioEnvio.getDepartamento()).from(CLICK_DEPARTMENT),
				
				Scroll.to(CIUDAD),
				SelectFromOptions.byVisibleText(formularioEnvio.getCiudad()).from(CIUDAD),
				
				Scroll.to(ADDRESS),
				Clear.field(ADDRESS),
				Enter.theValue(formularioEnvio.getAddress()).into(ADDRESS),
				
				
				Clear.field(BUILDING_NUMBER),
				Enter.theValue(formularioEnvio.getBuildingNumber()).into(BUILDING_NUMBER),
				
				Scroll.to(PHONE_NUMBER),
				Clear.field(PHONE_NUMBER),
				Enter.theValue(formularioEnvio.getPhoneNumber()).into(PHONE_NUMBER)
		);
	}
	
	
	
	public static class ResgistroUsuario {
		private String id;
		private String email;
		private String firstName;
		private String lastName;
		private String departamento;
		private String ciudad;
		private String address;
		private String buildingNumber;
		private String phoneNumber;
		
		public ResgistroUsuario(String id) {
			this.id = id;
		}
		
		public ResgistroUsuario usingEmail(String email) {
			this.email = email;
			return this;
		}
		
		public ResgistroUsuario usingFirsName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public ResgistroUsuario usingLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public ResgistroUsuario usingDepartamento(String departamento) {
			this.departamento = departamento;
			return this;
		}
		
		public ResgistroUsuario usingCiudad(String ciudad) {
			this.ciudad = ciudad;
			return this;
		}
		
		public ResgistroUsuario usingAddress(String address) {
			this.address = address;
			return this;
		}
		
		public ResgistroUsuario usingBuildingNumber(String buildingNumber) {
			this.buildingNumber = buildingNumber;
			return this;
		}
		
		public ResgistroUsuario usingPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}
		
		public FacturaEnvioTask andPassword(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return new FacturaEnvioTask(FacturaEnvio.builder()
                   .id(this.id)
                   .email(this.email)
                   .firstName(this.firstName)
                   .lastName(this.lastName)
                   .departamento(this.departamento)
                   .ciudad(this.ciudad)
                   .address(this.address)
                   .buildingNumber(this.buildingNumber)
                   .phoneNumber(this.phoneNumber)
                   .build());
		}
	}
}
	


