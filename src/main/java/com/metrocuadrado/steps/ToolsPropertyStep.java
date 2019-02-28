package com.metrocuadrado.steps;

import com.metrocuadrado.pages.HomeMetroPage;
import com.metrocuadrado.pages.InmobiliariaSelectPage;
import com.metrocuadrado.pages.PropertyRecordPage;
import com.metrocuadrado.pages.PropertyRequestPage;

import net.thucydides.core.annotations.Step;

public class ToolsPropertyStep {

	HomeMetroPage homeMetroPage;
	PropertyRequestPage propertyRequestPage;
	PropertyRecordPage propertyRecordPage;
	InmobiliariaSelectPage inmobiliariaSelectPage;

	@Step
	public void homeMetroHerramientas() {
		homeMetroPage.open();
		homeMetroPage.solicitaTuInmueble();
	}

	@Step
	public void SolicitaTuInmueble() {
		propertyRequestPage.solicitaTuInmueble();
	}

	@Step
	public void homeMetroHerramientasConsignacion() {
		homeMetroPage.open();
		homeMetroPage.consigaTuInmueble();
	}

	@Step
	public void SeleccionarInmobiliaria() {
		inmobiliariaSelectPage.seleccionarInmobiliaria();

	}

	@Step
	public void ConsignaTuInmueble() {
		propertyRecordPage.consignarInmueble();
	}

}
