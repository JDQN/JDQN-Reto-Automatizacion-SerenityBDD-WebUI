package co.com.sofka.setups;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import static co.com.sofka.utils.Log4jValues.LOG4J_PROPERTIES_FILE_PATH;
import static com.google.common.base.StandardSystemProperty.USER_DIR;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Setup {
	
	@Managed()
	protected WebDriver browser;
	
	protected void actorSetupTheBrowser(String actorName){
		setUpLog4j2();
		setUpBrowser(browser);
		setUpUser(actorName, browser);
	}
	
	private void setUpBrowser(WebDriver browser){
		browser.manage().deleteAllCookies();
		browser.manage().window().maximize();
	}
	
	private void setUpLog4j2(){
		PropertyConfigurator.configure(USER_DIR.value() + LOG4J_PROPERTIES_FILE_PATH.getValue());
	}
	
	private void setUpUser(String name, WebDriver driver){
		OnStage.setTheStage(new OnlineCast());
		theActorCalled(name).can(BrowseTheWeb.with(driver));
	}
}
