package com.metrocuadrado.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class ContactPage extends PageObject {

	@FindBy(name = "name")
	WebElement txtNombreContactarConstructora;
	@FindBy(name = "phone")
	WebElement txtTelefonoContactarConstructora;
	@FindBy(name = "email")
	WebElement txtCorreoContactarConstructora;
	@FindBy(xpath = "//*[@id=\"btnMainContact\"]")
	WebElement btnContactarVerTelefono;
	@FindBy(xpath = "//*[@id=\"main\"]/div/div[4]/div/div[1]/div/h2")
	WebElement lblDatosPrincipalesProyecto;

	public void contactarInmobiliaria(String nombre, String telefono, String correo) {
		for (String handle : this.getDriver().getWindowHandles()) {

			this.getDriver().switchTo().window(handle);
		}

		try {
			Thread.sleep(3000);
			txtNombreContactarConstructora.sendKeys(nombre);
		} catch (Exception e) {
			// TODO: handle exception
		}
		txtTelefonoContactarConstructora.sendKeys(telefono);
		txtCorreoContactarConstructora.sendKeys(correo);
		btnContactarVerTelefono.click();
		Assert.assertEquals("Datos principales del proyecto", lblDatosPrincipalesProyecto.getText());

	}
}
