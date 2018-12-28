package com.metrocuadrado.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchPage extends PageObject {
	@FindBy(xpath = "//*[@id=\"list-search_word\"]")
	WebElement txtFiltroPalabra;
	@FindBy(xpath = "//*[@id=\"list-search-by-word\"]")
	WebElement btnFiltroPalabra;
	@FindBy (xpath="//*[@id=\"search_filter\"]/div[2]/div[3]/div[2]/div[2]/div[1]/span/span/span[1]")
	WebElement btnFiltroPrecio;
	@FindBy(xpath = "//*[@id=\"list-mvalorarriendo\"]")
	WebElementFacade cmbFiltroPrecio;
	@FindBy(xpath = "//*[@id=\"list-price_from\"]")
	WebElement txtFiltroValorRangoDesde;
	@FindBy(xpath = "//*[@id=\"list-price_to\"]")
	WebElement txtFiltroValorRangoHasta;
	@FindBy(xpath = "//*[@id=\"list-price_from\"]")
	WebElement btnFiltroValorRango;
	@FindBy(xpath = "//*[@id=\"list-marea\"]")
	WebElementFacade cmbAreaMetrosCuadrados;
	@FindBy(xpath = "//*[@id=\"search_filter\"]/div[2]/div[3]/div[4]/div/div[1]/div/div[1]/label")
	WebElement btnNumeroHabitaciones;

	@FindBy(xpath = "//*[@id=\"list-mtiempoconstruido\"]")
	WebElementFacade cmbAntiguedad;

	public void filtroPalabra(String palabraclave) {
		txtFiltroPalabra.sendKeys(palabraclave);
		btnFiltroPalabra.click();
	}

	public void filtroPrecio(String precio) {
		btnFiltroPrecio.click();
		cmbFiltroPrecio.selectByVisibleText(precio);
	}

	public void filtroPrecioRango() {
		txtFiltroValorRangoDesde.sendKeys("");
		txtFiltroValorRangoHasta.sendKeys("");
		btnFiltroValorRango.click();
	}

	public void filtroMetrosCuadrados() {
		cmbAreaMetrosCuadrados.selectByVisibleText("");

	}

	public void filtroHabitaciones() {

	}

	public void filtroBaños() {

	}

	public void filtroGaraje() {

	}

	public void filtroAntiguedad() {
		cmbAntiguedad.selectByVisibleText("");
	}

	public void filtroMeGustariaQueTenga() {

	}
}
