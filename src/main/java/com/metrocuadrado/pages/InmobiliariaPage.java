package com.metrocuadrado.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class InmobiliariaPage extends PageObject {

	@FindBy(xpath = "//*[@id=\"menuHeader_0\"]/a")
	WebElement lnkInmueblesInmobiliaria;
	@FindBy(xpath = "//*[@id=\"menuHeader_0\"]/ul/li[1]/a")
	WebElement lnkPublicarInmuebleInmobiliaria;

	public void publicarInmuebleInmobiliaria() {
		lnkInmueblesInmobiliaria.click();
		lnkPublicarInmuebleInmobiliaria.click();
	}

}
