package co.com.sofka.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Permite ejecutar los test relacionados con los
 * escenarios de pruebas en el aplicativo zonafit
 * @class CompraExitosaRunner
 * @author jdquimbayo72@misena.edu.co
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		snippets = CucumberOptions.SnippetType.CAMELCASE,
		publish = true,
		features = {"src/test/resources/features/compra_exitosa/compraExitosa.feature"},//Aqui llamamos la ruta del archivo feature
		glue = "co.com.sofka.step_definitions"//Con la opcion glue llamamos la carpeta stepDefinitions.contact
		//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:target/ContactReports.html"}
		//plugin = {"pretty", "html:target/cucumber-reportsContactRunner.html"} // TODO con la option plugin podemos generar reportes HTML
)
public class CompraExitosaRunner {
}
