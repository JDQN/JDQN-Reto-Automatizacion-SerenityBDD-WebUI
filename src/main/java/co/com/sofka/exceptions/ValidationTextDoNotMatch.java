package co.com.sofka.exceptions;

public class ValidationTextDoNotMatch extends AssertionError {
	
	public static final String VALIDATION_DO_NOT_MATCH = "\n" + "La validación no coincide. %s";
	
	public ValidationTextDoNotMatch(String message, Throwable cause){
		super(message, cause);
	}
	
}