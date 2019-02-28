package com.metrocuadrado.stepsdefinitions;

import java.util.List;
import java.util.Map;

import com.metrocuadrado.pages.HomeMetroPage;
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
		publishPropertyStep.loginMetroOcasional(datos.get(0).get("usuario"), datos.get(0).get("contrasena"));
	}

	@Then("^I can fill out the necessary information to publish my property$")
	public void iCanFillOutTheNecessaryInformationToPublishMyProperty(DataTable arg1) throws Exception {
		List<Map<String, String>> datos = arg1.asMaps(String.class, String.class);
		publishPropertyStep.informacionInmueble(datos.get(0).get("tipooferta"), datos.get(0).get("tipoinmueble"),
				datos.get(0).get("valorventa"), datos.get(0).get("valorarriendo"),
				datos.get(0).get("incluyeadministracion"), datos.get(0).get("valoradministracion"),
				datos.get(0).get("ubicacioninmueble"), datos.get(0).get("direccioninmueble"),
				datos.get(0).get("barrioinmueble"), datos.get(0).get("barrioinmuebleexacto"),
				datos.get(0).get("estrato"), datos.get(0).get("areaprivada"), datos.get(0).get("areaconstruida"),
				datos.get(0).get("numeropisos"), datos.get(0).get("tiempoconstruido"), datos.get(0).get("habitaciones"),
				datos.get(0).get("banos"), datos.get(0).get("parqueaderos"), datos.get(0).get("tipoparqueadero"),
				datos.get(0).get("caracteristicaparqueadero"), datos.get(0).get("videoinmueble"),
				datos.get(0).get("comentariosadicionales"), datos.get(0).get("avisoimpreso"));
	}

	@Given("^I want to publish a property$")
	public void iWantToPublishAProperty() throws Exception {
		publishPropertyStep.publicarConstructora();
	}

	@When("^I entered the data login$")
	public void iEnteredTheDataLogin(DataTable arg1) throws Exception {
		List<Map<String, String>> datos = arg1.asMaps(String.class, String.class);
		publishPropertyStep.loginMetroConstructora(datos.get(0).get("usuario"), datos.get(0).get("contrasena"));
		publishPropertyStep.crearNuevoProyectoConstructora();

	}

	@Then("^select the information required to publish the property$")
	public void selectTheInformationRequiredToPublishTheProperty(DataTable arg1) throws Exception {
		List<Map<String, String>> datos = arg1.asMaps(String.class, String.class);
		publishPropertyStep.informacionProyectoConstructora(datos.get(0).get("nombreproyecto"),
				datos.get(0).get("tipoinmueble"), datos.get(0).get("etapaconstruccion"),
				datos.get(0).get("descripcionproyecto"), datos.get(0).get("tiempoconstruido"),
				datos.get(0).get("parqueaderovisitantes"), datos.get(0).get("sobreviaprincipal"),
				datos.get(0).get("sobreviasecundaria"), datos.get(0).get("moneda"),
				datos.get(0).get("fechaestimadaentrega"), datos.get(0).get("ciudadproyecto"),
				datos.get(0).get("direccionproyecto"), datos.get(0).get("nombrebarrioproyecto"),
				datos.get(0).get("estratoproyecto"), datos.get(0).get("vigilancia"), datos.get(0).get("videoproyecto"));

	}

	@Given("^I want to publish a property by inmobiliaria$")
	public void iWantToPublishAPropertyByInmobiliaria() throws Exception {
		publishPropertyStep.publicarInmobiliaria();
		publishPropertyStep.loginMetroInmobiliaria();
		publishPropertyStep.crearNuevoInmuebleInmobiliaria();
	}

	@When("^I enter the required information$")
	public void iEnterTheRequiredInformation() throws Exception {
		publishPropertyStep.datosInmuebleInmobiliaria();
	}

	@Then("^the property is published successfully by inmobiliaria$")
	public void thePropertyIsPublishedSuccessfullyByInmobiliaria() throws Exception {

	}

}
