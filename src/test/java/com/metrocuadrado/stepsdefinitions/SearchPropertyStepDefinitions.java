package com.metrocuadrado.stepsdefinitions;

import java.util.List;
import java.util.Map;

import com.metrocuadrado.steps.SearchPropertyStep;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchPropertyStepDefinitions {

	@Steps
	SearchPropertyStep searchPropertyStep;

	@Given("^I want to rent a property$")
	public void iWantToRentAProperty(DataTable arg1) throws Exception {
		List<Map<String, String>> datos = arg1.asMaps(String.class, String.class);
		searchPropertyStep.filtroBusquedaHome(datos.get(0).get("tipobusqueda"), datos.get(0).get("tipoinmueble"),
				datos.get(0).get("ciudadbarrio"));
	}

	@When("^I search a property$")
	public void iSearchAProperty(DataTable arg1) throws Exception {
		List<Map<String, String>> datos = arg1.asMaps(String.class, String.class);
		searchPropertyStep.filtrosBusqueda(datos.get(0).get("palabraclave"), datos.get(0).get("palabraclave"));

	}

	@Then("^it brings me the different options$")
	public void itBringsMeTheDifferentOptions(DataTable arg1) throws Exception {

	}

}
