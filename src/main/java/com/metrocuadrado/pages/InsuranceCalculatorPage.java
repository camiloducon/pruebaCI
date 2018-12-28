package com.metrocuadrado.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class InsuranceCalculatorPage extends PageObject {

	@FindBy(xpath = "//*[@id=\"campoArriendo\"]")
	WebElement txtValorBasicoMensual;
	@FindBy(xpath = "//*[@id=\"campoAdmin\"]")
	WebElement txtValorAdministracion;
	@FindBy(xpath = "//*[@id=\"button\"]")
	WebElement btnCalcularValorSeguro;
	@FindBy(xpath = "//*[@id=\"td-resul-calc\"]/tbody/tr[2]/td[4]/button")
	WebElement btnContactarAseguradora;

	public void calcularValorSeguro(String valorBasicoMensual, String valorAdministracion) {
		txtValorBasicoMensual.sendKeys(valorBasicoMensual);
		txtValorAdministracion.sendKeys(valorAdministracion);
		btnCalcularValorSeguro.click();
	}

	public void contactarAseguradora() {
		btnContactarAseguradora.click();
	}
}
