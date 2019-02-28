package com.metrocuadrado.stepsdefinitions;

import java.util.List;
import java.util.Map;

import com.metrocuadrado.steps.FindPropertyStep;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class FindPropertyStepDefinitions {

	@Steps
	FindPropertyStep findPropertyStep;

	@Given("^I want to rent a property$")
	public void iWantToRentAProperty(DataTable arg1) throws Exception {
		List<Map<String, String>> datos = arg1.asMaps(String.class, String.class);
		findPropertyStep.filtroBusquedaHome(datos.get(0).get("tipobusqueda"), datos.get(0).get("tipoinmueble"),
				datos.get(0).get("ciudadbarrio"));
	}

	@When("^I find a property$")
	public void iSearchAProperty(DataTable arg1) throws Exception {
		List<Map<String, String>> datos = arg1.asMaps(String.class, String.class);
		findPropertyStep.filtrosBusqueda(datos.get(0).get("palabraclave"), datos.get(0).get("preciocompra"),
				datos.get(0).get("valorrangodesde"), datos.get(0).get("valorrangohasta"), datos.get(0).get("area"),
				datos.get(0).get("habitaciones"), datos.get(0).get("banos"), datos.get(0).get("garajes"),
				datos.get(0).get("antiguedad"));

	}

	@Then("^it brings me the different options$")
	public void itBringsMeTheDifferentOptions(DataTable arg1) throws Exception {
		List<Map<String, String>> datos = arg1.asMaps(String.class, String.class);
		findPropertyStep.contactarInmobiliaria(datos.get(0).get("nombre"), datos.get(0).get("telefono"),
				datos.get(0).get("correo"));
	}

}
