package com.metrocuadrado.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://staging.metrocuadrado.com/metrocuadrado-home/")

public class HomeMetroPage extends PageObject {
	@FindBy(xpath = "//*[@id=\"page\"]/div[6]/div/div/div[3]/a/div[2]/h3")
	WebElement btnCalculadoraCredito;
	@FindBy(xpath = "//*[@id=\"page\"]/div[6]/div/div/div[1]/a/div[2]/h3")
	WebElement btnCalculadoraSeguro;
	@FindBy(xpath = "//*[@id=\"publishAPropertyLiHref\"]")
	WebElement btnPublicaTuInmueble;
	@FindBy(xpath = "//*[@id=\"busquedaTipoNegocio\"]/span")
	WebElementFacade cmbTipoNegocio;
	@FindBy(xpath = "//*[@id=\"home-desktop-mtiponegocio\"]/option[1]")
	WebElementFacade selectTipoNegocioCompraNuevo;
	@FindBy(xpath = "//*[@id=\"home-desktop-mtiponegocio\"]/option[2]")
	WebElementFacade selectTipoNegocioCompraUsado;
	@FindBy(xpath = "//*[@id=\"home-desktop-mtiponegocio\"]/option[3]")
	WebElementFacade selectTipoNegocioCompraNuevoUsado;
	@FindBy(xpath = "//*[@id=\"home-desktop-mtiponegocio\"]/option[4]")
	WebElementFacade selectTipoNegocioArriendo;
	@FindBy(xpath = "//*[@id=\"campo-selector-multiple\"]/div[1]")
	WebElementFacade btnTipoInmueble;
	@FindBy(xpath = "//input[@id='checkh_01']")
	WebElement btnTipoInmuebleCasas;
	@FindBy(xpath = "//div[6]/a")
	WebElement btnAceptarTipoInmueble;
	@FindBy(xpath = "//*[@id=\"home-desktop-location\"]")
	WebElement txtCiudadBarrio;
	@FindBy(xpath = "//div[6]/a")
	WebElement btnAutoCompletadoCiudadBarrio;
	@FindBy(xpath = "//*[@id=\"btn_submit_search_home\"]")
	WebElement btnRealizarBusqueda;

	public void ingresarEnCalculadoraCredito() {

		btnCalculadoraCredito.click();
	}

	public void ingresarEnCalculadoraSeguro() {

		btnCalculadoraSeguro.click();
	}

	public void busquedaInmueble(String tipobusqueda, String tipoinmueble, String ciudadbarrio) {

		cmbTipoNegocio.click();
		switch (tipobusqueda) {

		case "Compra Nuevo":
			selectTipoNegocioCompraNuevo.click();
			break;
		case "Compra Usado":
			selectTipoNegocioCompraUsado.click();
			break;
		case "Compra Nuevo y Usado":
			selectTipoNegocioCompraNuevoUsado.click();
			break;
		case "Arriendo":
			selectTipoNegocioArriendo.click();
			break;

		default:
			break;
		}
		btnTipoInmueble.click();
		btnTipoInmuebleCasas.click();
		btnAceptarTipoInmueble.click();
		txtCiudadBarrio.sendKeys(ciudadbarrio);
		// btnAutoCompletadoCiudadBarrio.click();
		btnRealizarBusqueda.click();
	}
	public void publicarInmueble () {
		btnPublicaTuInmueble.click();
	}
}
