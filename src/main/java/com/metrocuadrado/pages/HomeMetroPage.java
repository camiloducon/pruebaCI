package com.metrocuadrado.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.metrocuadrado.utils.Helpers;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://staging.metrocuadrado.com/metrocuadrado-home/")

public class HomeMetroPage extends PageObject {

	Helpers helpers = new Helpers();
	@FindBy(xpath = "//*[@id=\"menu_level_0_alt\"]/li[4]/a")
	WebElement btnIngresar;
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
	@FindBy(xpath = "//input[@id='checkh_02']")
	WebElement btnTipoInmuebleApartamentos;
	@FindBy(xpath = "//input[@id='checkh_03']")
	WebElement btnTipoInmuebleOficinas;
	@FindBy(xpath = "//input[@id='checkh_04']")
	WebElement btnTipoInmuebleBodegas;
	@FindBy(xpath = "//input[@id='checkh_05']")
	WebElement btnTipoInmuebleConsultorios;
	@FindBy(xpath = "//input[@id='checkh_06']")
	WebElement btnTipoInmuebleLocales;
	@FindBy(xpath = "//input[@id='checkh_07']")
	WebElement btnTipoInmuebleLotes;
	@FindBy(xpath = "//input[@id='checkh_08']")
	WebElement btnTipoInmuebleFincas;
	@FindBy(xpath = "//input[@id='checkh_09']")
	WebElement btnTipoInmuebleEdificioOficinas;
	@FindBy(xpath = "//div[6]/a")
	WebElement btnAceptarTipoInmueble;
	@FindBy(xpath = "//*[@id=\"home-desktop-location\"]")
	WebElement txtCiudadBarrio;
	@FindBy(xpath = "//div[6]/a")
	WebElement btnAutoCompletadoCiudadBarrio;
	@FindBy(xpath = "//*[@id=\"btn_submit_search_home\"]")
	WebElement btnRealizarBusqueda;

	@FindBy(xpath = "//ul[@id='menu_level_0_alt']/li[3]/span")
	WebElement lnkHerramientas;
	@FindBy(xpath = "//a[contains(text(),'Solicita tu inmueble')]")
	WebElement btnSolicitaTuInmueble;
	@FindBy(xpath = "//a[contains(text(),'Consigna tu inmueble')]")
	WebElement btnConsignaTuInmueble;

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
		switch (tipoinmueble) {
		case "Casas":
			btnTipoInmuebleCasas.click();
			break;
		case "Apartamentos":
			btnTipoInmuebleApartamentos.click();
			break;
		case "Oficinas":
			btnTipoInmuebleOficinas.click();
			break;
		case "Bodegas":
			btnTipoInmuebleBodegas.click();
			break;
		case "Consultorios":
			btnTipoInmuebleConsultorios.click();
			break;
		case "Locales":
			btnTipoInmuebleLocales.click();
			break;
		case "Lotes":
			btnTipoInmuebleLotes.click();
			break;
		case "Fincas":
			btnTipoInmuebleFincas.click();
			break;
		case "Edificio de oficinas":
			btnTipoInmuebleEdificioOficinas.click();
			break;

		default:
			break;
		}
		btnAceptarTipoInmueble.click();
		txtCiudadBarrio.sendKeys(ciudadbarrio);
		// btnAutoCompletadoCiudadBarrio.click();
		btnRealizarBusqueda.click();
	}

	public void publicarInmueble() {
		btnPublicaTuInmueble.click();
	}

	public void Ingresar() {
		btnIngresar.click();
	}

	public void solicitaTuInmueble() {
		helpers.esperaSelenium(5);
		Actions actions = new Actions(this.getDriver());
		actions.moveToElement(lnkHerramientas);
		actions.perform();
		helpers.esperaSelenium(2);
		btnSolicitaTuInmueble.click();
	}
	public void consigaTuInmueble() {
		helpers.esperaSelenium(5);
		Actions actions = new Actions(this.getDriver());
		actions.moveToElement(lnkHerramientas);
		actions.perform();
		helpers.esperaSelenium(2);
		btnConsignaTuInmueble.click();
	}
}
