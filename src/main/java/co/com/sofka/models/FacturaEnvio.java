package co.com.sofka.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class FacturaEnvio {
	
	private String id;
	private String email;
	private String firstName;
	private String lastName;
	private String departamento;
	private String ciudad;
	private String address;
	private String buildingNumber;
	private String phoneNumber;
	
}
