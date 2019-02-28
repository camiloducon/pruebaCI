package com.metrocuadrado.pages;

import org.openqa.selenium.WebElement;

import com.metrocuadrado.utils.Helpers;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class InmobiliariaSelectPage extends PageObject {

	Helpers helpers = new Helpers();
	@FindBy(xpath = "(//*[contains(.,'Seleccionar todas')])[9]")
	WebElement chkInmobiliarias;
	@FindBy(xpath = "/html/body/div[6]/div[2]/a/div")
	WebElement btnContinuarConsignacion;

	public void seleccionarInmobiliaria() {
		helpers.esperaSelenium(2);
		chkInmobiliarias.click();
		helpers.esperaSelenium(2);

		btnContinuarConsignacion.click();
	}

}
