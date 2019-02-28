package com.metrocuadrado.stepsdefinitions;

import java.util.List;
import java.util.Map;

import com.metrocuadrado.steps.CreditCalculatorStep;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CreditCalculatorStepDefinitions {

	@Steps
	CreditCalculatorStep creditCalculatorSteps;

	@Given("^that you entered in the application credit calculator$")
	public void thatYouEnteredInTheApplicationCreditCalculator() throws Exception {
		creditCalculatorSteps.paginaInicioMetro();
	}

	@When("^I fill in the information requested by the application$")
	public void iFillInTheInformationRequestedByTheApplication(DataTable arg1) throws Exception {
		List<Map<String, String>> datos = arg1.asMaps(String.class, String.class);
		creditCalculatorSteps.ingresarDatosCalculoCredito(datos.get(0).get("ingresosMensuales"),
				datos.get(0).get("plazoEnAnos"));
	}

	@When("^I fill in the information requested by the calculation request$")
	public void iFillInTheInformationRequestedByTheCalculationRequest(DataTable arg1) throws Exception {
		List<Map<String, String>> datos = arg1.asMaps(String.class, String.class);
		creditCalculatorSteps.ingresarDatosCalculoCuotasCredito(datos.get(0).get("valorCredito"),
				datos.get(0).get("plazoEnAnos"));
	}

	@Then("^I get a result of credit calculation$")
	public void iGetAResultOfCreditCalculation() throws Exception {
		//creditCalculatorSteps.contactarBancos();
	}

	@Then("^send the user's data to the bank$")
	public void sendTheUserSDataToTheBank(DataTable arg1) throws Exception {
		//List<Map<String, String>> datos = arg1.asMaps(String.class, String.class);
		//creditCalculatorSteps.enviarDatosBanco(datos.get(0).get("nombreUsuario"), datos.get(0).get("cedulaUsuario"),
				//datos.get(0).get("correoElectronicoUsuario"), datos.get(0).get("telefonoUsuario"),
				//datos.get(0).get("ciudadUsuario"));

	}
	@Then("^send the user data to the bank$")
	public void sendTheUserDataToTheBank(DataTable arg1) throws Exception {
	//	List<Map<String, String>> datos = arg1.asMaps(String.class, String.class);
		//creditCalculatorSteps.enviarDatosBanco(datos.get(0).get("nombreUsuario"), datos.get(0).get("cedulaUsuario"),
			//	datos.get(0).get("correoElectronicoUsuario"), datos.get(0).get("telefonoUsuario"),
			//	datos.get(0).get("ciudadUsuario"));

	}


	@Then("^I get a calculation result of the quotas$")
	public void iGetACalculationResultOfTheQuotas() throws Exception {
		//creditCalculatorSteps.contactarBancosCuotasCredito();

	}

}