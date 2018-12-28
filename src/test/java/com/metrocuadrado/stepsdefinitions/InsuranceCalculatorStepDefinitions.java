package com.metrocuadrado.stepsdefinitions;

import java.util.List;
import java.util.Map;

import com.metrocuadrado.steps.InsuranceCalculatorStep;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class InsuranceCalculatorStepDefinitions {

	@Steps
	InsuranceCalculatorStep insuranceCalculatorStep;

	@Given("^that you entered in the application insurance calculator$")
	public void thatYouEnteredInTheApplicationInsuranceCalculator() throws Exception {
		insuranceCalculatorStep.paginaInicioMetroCalculadoraSeguro();

	}

	@When("^I enter the required data$")
	public void iEnterTheRequiredData(DataTable arg1) throws Exception {
		List<Map<String, String>> datos = arg1.asMaps(String.class, String.class);
		insuranceCalculatorStep.ingresarDatosCalculoSeguro(datos.get(0).get("valorBasicoMensual"), datos.get(0).get("valorAdministracion"));
	}

	@Then("^I get a result of insurance calculation$")
	public void iGetAResultOfInsuranceCalculation() throws Exception {

	}
	@Then("^send the user data to the candidate bank$")
	public void sendTheUserDataToTheCandidateBank(DataTable arg1) throws Exception {
		List<Map<String, String>> datos = arg1.asMaps(String.class, String.class);
		insuranceCalculatorStep.enviarDatosAseguradora(datos.get(0).get("nombreUsuario"), datos.get(0).get("cedulaUsuario"),
				datos.get(0).get("correoElectronicoUsuario"), datos.get(0).get("telefonoUsuario"),
				datos.get(0).get("ciudadUsuario"));

	}


}
