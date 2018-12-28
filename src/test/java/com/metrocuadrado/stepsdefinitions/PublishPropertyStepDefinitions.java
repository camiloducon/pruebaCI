package com.metrocuadrado.stepsdefinitions;

import java.util.List;
import java.util.Map;

import com.metrocuadrado.steps.PublishPropertyStep;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PublishPropertyStepDefinitions {

	@Steps
	PublishPropertyStep publishPropertyStep;

	@Given("^I want sell my property$")
	public void iWantSellMyProperty() throws Exception {
		publishPropertyStep.homeMetro();

	}

	@When("^I select a plan$")
	public void iSelectAPlan() throws Exception {
		publishPropertyStep.seleccionarPlan();

	}

	@When("^I made the login in the application$")
	public void iMadeTheLoginInTheApplication(DataTable arg1) throws Exception {
		List<Map<String, String>> datos = arg1.asMaps(String.class, String.class);
		publishPropertyStep.loginMetro(datos.get(0).get("usuario"), datos.get(0).get("contrasena"));
	}

	@Then("^I can fill out the necessary information to publish my property$")
	public void iCanFillOutTheNecessaryInformationToPublishMyProperty(DataTable arg1) throws Exception {
		List<Map<String, String>> datos = arg1.asMaps(String.class, String.class);
		publishPropertyStep.informacionInmueble(datos.get(0).get("tipooferta"), datos.get(0).get("tipoinmueble"),
				datos.get(0).get("valorventa"), datos.get(0).get("valorarriendo"),
				datos.get(0).get("ubicacioninmueble"), datos.get(0).get("direccioninmueble"),
				datos.get(0).get("barrioinmueble"), datos.get(0).get("barrioinmuebleexacto"),
				datos.get(0).get("estrato"), datos.get(0).get("areaprivada"), datos.get(0).get("areaconstruida"),
				datos.get(0).get("numeropisos"), datos.get(0).get("tiempoconstruido"), datos.get(0).get("habitaciones"),
				datos.get(0).get("banos"), datos.get(0).get("parqueaderos"), datos.get(0).get("tipoparqueadero"),
				datos.get(0).get("caracteristicaparqueadero"), datos.get(0).get("videoinmueble"),
				datos.get(0).get("comentariosadicionales"), datos.get(0).get("avisoimpreso"));
	}
}
