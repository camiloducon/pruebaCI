package com.metrocuadrado.steps;

import java.io.IOException;

import com.metrocuadrado.pages.ConstructionPage;
import com.metrocuadrado.pages.CreateConstructionProyectPage;
import com.metrocuadrado.pages.CreatePropertyInmobiliariaAttractivePage;
import com.metrocuadrado.pages.CreatePropertyInmobiliariaDesignPage;
import com.metrocuadrado.pages.CreatePropertyInmobiliariaLocationPage;
import com.metrocuadrado.pages.CreatePropertyInmobiliariaPage;
import com.metrocuadrado.pages.CreatePublicationPage;
import com.metrocuadrado.pages.HomeMetroPage;
import com.metrocuadrado.pages.InmobiliariaPage;
import com.metrocuadrado.pages.LoginMetroPage;
import com.metrocuadrado.pages.SelectionOfPlansPage;

import net.thucydides.core.annotations.Step;

public class PublishPropertyStep {

	HomeMetroPage homeMetroPage;
	SelectionOfPlansPage selectionOfPlansPage;
	LoginMetroPage loginMetroPage;
	CreatePublicationPage createPublicationPage;
	CreateConstructionProyectPage createContructionProyectPage;
	ConstructionPage constructionPage;
	InmobiliariaPage inmobiliariaPage;
	CreatePropertyInmobiliariaPage createPopertyInmobiliariaPage;
	CreatePropertyInmobiliariaLocationPage createPropertyInmobiliariaLocationPage;
	CreatePropertyInmobiliariaDesignPage  createPropertyInmobiliariaDesignPage;
	CreatePropertyInmobiliariaAttractivePage createPropertyInmobiliariaAttractivePage;

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
	public void loginMetroOcasional(String usuario, String contrasena) {
		loginMetroPage.loginMetroOcasional(usuario, contrasena);
	}

	@Step
	public void loginMetroConstructora(String usuario, String contrasena) {
		loginMetroPage.loginMetroConstructora(usuario, contrasena);
	}

	@Step
	public void informacionInmueble(String tipooferta, String tipoinmueble, String valorventa, String valorarriendo,
			String incluyeadministracion, String valoradministracion, String ubicacioninmueble,
			String direccioninmueble, String barrioinmueble, String barrioinmuebleexacto, String estrato,
			String areaprivada, String areaconstruida, String numeropisos, String tiempoconstruido, String habitaciones,
			String banos, String parqueaderos, String tipoparqueadero, String caracteristicaparqueadero,
			String videoinmueble, String comentariosadicionales, String avisoimpreso) throws IOException {
		createPublicationPage.informacionInmueble(tipooferta, tipoinmueble, valorventa, valorarriendo,
				incluyeadministracion, valoradministracion, ubicacioninmueble, direccioninmueble, barrioinmueble,
				barrioinmuebleexacto, estrato, areaprivada, areaconstruida, numeropisos, tiempoconstruido, habitaciones,
				banos, parqueaderos, tipoparqueadero, caracteristicaparqueadero, videoinmueble, comentariosadicionales,
				avisoimpreso);
	}

	@Step
	public void publicarConstructora() {
		homeMetroPage.open();
		homeMetroPage.Ingresar();

	}

	@Step
	public void crearNuevoProyectoConstructora() {
		constructionPage.publicarProyectoConstructora();
	}

	@Step
	public void informacionProyectoConstructora(String nombreproyecto, String tipoinmueble, String etapaconstruccion,
			String descripcionproyecto, String tiempoconstruido, String parqueaderovisitantes, String sobreviaprincipal,
			String sobreviasecundaria, String moneda, String fechaestimadaentrega, String ciudadproyecto,
			String direccionproyecto, String nombrebarrioproyecto, String estratoproyecto, String vigilancia,
			String videoproyecto) {
		createContructionProyectPage.createConstructionProyect(nombreproyecto, tipoinmueble, etapaconstruccion,
				descripcionproyecto, tiempoconstruido, parqueaderovisitantes, sobreviaprincipal, sobreviasecundaria,
				moneda, fechaestimadaentrega, ciudadproyecto, direccionproyecto, nombrebarrioproyecto, estratoproyecto,
				vigilancia, videoproyecto);
	}

	public void publicarInmobiliaria() {
		homeMetroPage.open();
		homeMetroPage.Ingresar();

	}

	@Step
	public void loginMetroInmobiliaria() {
		loginMetroPage.loginMetroInmobiliaria();
	}

	@Step
	public void crearNuevoInmuebleInmobiliaria() {
		inmobiliariaPage.publicarInmuebleInmobiliaria();
	}
	@Step
	public void datosInmuebleInmobiliaria() {
		createPopertyInmobiliariaPage.creacionInmuebleDatosInmueble();
		createPropertyInmobiliariaLocationPage.localizacionInmuebleInmobiliaria();
		createPropertyInmobiliariaDesignPage.disenoInmuebleInmobiliaria();
		createPropertyInmobiliariaAttractivePage.principalesAtractivosInmobiliaria();
	}
	
}