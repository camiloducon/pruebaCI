package com.metrocuadrado.stepsdefinitions;

import com.metrocuadrado.steps.ToolsPropertyStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ToolsPropertyStepDefinitions {

	@Steps
	ToolsPropertyStep toolsPropertyStep;

	@Given("^want to look for a property with specific characteristics$")
	public void wantToLookForAPropertyWithSpecificCharacteristics() throws Exception {
		toolsPropertyStep.homeMetroHerramientas();
	}

	@When("^I do the specification registration$")
	public void iDoTheSpecificationRegistration() throws Exception {
		toolsPropertyStep.SolicitaTuInmueble();
	}

	@Then("^I register successfully$")
	public void iRegisterSuccessfully() throws Exception {

	}

	@Given("^I Want to publish a property with specific characteristics$")
	public void iWantToPublishAPropertyWithSpecificCharacteristics() throws Exception {
		toolsPropertyStep.homeMetroHerramientasConsignacion();
		toolsPropertyStep.SeleccionarInmobiliaria();
	}

	@When("^I type the characteristics$")
	public void iTypeTheCharacteristics() throws Exception {
		toolsPropertyStep.ConsignaTuInmueble();
	}

	@Then("^I record successfully$")
	public void iRecordSuccessfully() throws Exception {

	}

}
