package com.metrocuadrado.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreditCalculatorPage extends PageObject {

	// calculo cuotas
	@FindBy(xpath = "/html/body/div[3]/div[2]/div/ul/li[2]/a")
	WebElement lnkCalculoValorCuotas;
	@FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div[2]/div[1]/form/div[1]/input")
	WebElement txtValorCredito;
	@FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div[2]/div[1]/form/div[2]/select")
	WebElementFacade cmbPlazoAnosCuotas;
	@FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div[2]/div[1]/form/button")
	WebElement btnCalcularCuotasCredito;
	@FindBy(xpath = "//*[@id=\"td-resul-calc\"]/tbody/tr[2]/td[5]/button")
	WebElement btnContactarBanco;

	// calculo credito
	@FindBy(name = "monthlyIncome")
	WebElement txtIngresosMensuales;
	@FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div[1]/div[1]/form/div[2]/select")
	WebElementFacade cmbPlazoEnAnos;
	@FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div[1]/div[1]/form/button/h4")
	WebElement btnCalcularCredito;
	@FindBy(xpath = "//*[@id=\"td-resul-calc\"]/tbody/tr[2]/td[5]/button")
	WebElement btnContactar1;

	public void calcularCredito(String ingresosMensuales, String plazoEnAnos) {
		txtIngresosMensuales.sendKeys(ingresosMensuales);
		cmbPlazoEnAnos.click();
		cmbPlazoEnAnos.selectByValue("number:"+ plazoEnAnos);
		btnCalcularCredito.click();
	}

	public void calculoCredito() {
		btnContactar1.click();
	}

	public void calcularCuotasCredito(String valorCredito, String plazoEnAnos) {
		lnkCalculoValorCuotas.click();
		txtValorCredito.sendKeys(valorCredito);
		cmbPlazoAnosCuotas.click();
		cmbPlazoAnosCuotas.selectByValue("number:"+ plazoEnAnos);
		btnCalcularCuotasCredito.click();
	}

	public void calculoCuotasCredito() {
		btnContactarBanco.click();
	}
}
