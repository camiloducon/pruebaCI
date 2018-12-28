package com.metrocuadrado.steps;

import com.metrocuadrado.pages.CreatePublicationPage;
import com.metrocuadrado.pages.HomeMetroPage;
import com.metrocuadrado.pages.LoginMetroPage;
import com.metrocuadrado.pages.SelectionOfPlansPage;

import net.thucydides.core.annotations.Step;

public class PublishPropertyStep {

	HomeMetroPage homeMetroPage;
	SelectionOfPlansPage selectionOfPlansPage;
	LoginMetroPage loginMetroPage;
	CreatePublicationPage createPublicationPage;

	@Step
	public void homeMetro() {
		homeMetroPage.open();
		homeMetroPage.publicarInmueble();
	}

	@Step
	public void seleccionarPlan() {
		selectionOfPlansPage.seleccionPlan();
	}

	@Step
	public void loginMetro(String usuario, String contrasena) {
		loginMetroPage.loginMetro(usuario, contrasena);
	}

	@Step
	public void informacionInmueble(String tipooferta, String tipoinmueble, String valorventa, String valorarriendo,
			String ubicacioninmueble, String direccioninmueble, String barrioinmueble, String barrioinmuebleexacto,
			String estrato, String areaprivada, String areaconstruida, String numeropisos, String tiempoconstruido,
			String habitaciones, String banos, String parqueaderos, String tipoparqueadero,
			String caracteristicaparqueadero, String videoinmueble, String comentariosadicionales, String avisoimpreso) {
		createPublicationPage.informacionInmueble(tipooferta, tipoinmueble, valorventa, valorarriendo,
				ubicacioninmueble, direccioninmueble, barrioinmueble, barrioinmuebleexacto, estrato, areaprivada,
				areaconstruida, numeropisos, tiempoconstruido, habitaciones, banos, parqueaderos, tipoparqueadero,
				caracteristicaparqueadero, videoinmueble, comentariosadicionales, avisoimpreso);
	}

}
