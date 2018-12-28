package com.metrocuadrado.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ContactBankPage extends PageObject {

	@FindBy(xpath = "/html/body/section/div[1]/div/form/div[1]/input")
	WebElement txtNombreUsuario;
	@FindBy(name = "userId")
	WebElement txtCedulaUsuario;
	@FindBy(xpath = "/html/body/section/div[1]/div/form/div[3]/input")
	WebElement txtCorreoUsuario;
	@FindBy(xpath = "/html/body/section/div[1]/div/form/div[4]/input")
	WebElement txtTelefonoUsuario;
	@FindBy(xpath = "//*[@id=\"tags\"]")
	WebElement txtCiudadUsuario;
	@FindBy(xpath = "//*[@id=\"sampleCheckboxPolitica\"]")
	WebElement chkTerminosCondicionesUsuario;
	@FindBy(xpath = "/html/body/section/div[1]/div/form/div[7]/button")
	WebElement btncontactarBanco;
	@FindBy(xpath = "/html/body/section/div[2]/div[1]/h2")
	WebElement lblContactarBanco;
	
	@FindBy(xpath = "//*[@id=\"name\"]")
	WebElement txtNombreUsuarioAsegurado;
	@FindBy(xpath ="//*[@id=\"identification\"]")
	WebElement txtCedulaUsuarioAsegurado;
	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement txtCorreoUsuarioAsegurado;
	@FindBy(xpath = "//*[@id=\"phone\"]")
	WebElement txtTelefonoUsuarioAsegurado;
	@FindBy(xpath = "//*[@id=\"city\"]")
	WebElementFacade cmbCiudadUsuario;
	@FindBy(xpath = "//*[@id=\"contactButton\"]")
	WebElement btncontactarAseguradora;
	@FindBy(xpath = "//*[@id=\"modalLabel\"]")
	WebElement lblContactarAseguradora;
	

	public void contactarBanco(String nombreUsuario, String cedulaUsuario, String correoElectronicoUsuario,
			String telefonoUsuario, String ciudadUsuario) {
		txtNombreUsuario.sendKeys(nombreUsuario);
		txtCedulaUsuario.sendKeys(cedulaUsuario);
		txtCorreoUsuario.sendKeys(correoElectronicoUsuario);
		txtTelefonoUsuario.sendKeys(telefonoUsuario);
		txtCiudadUsuario.sendKeys(ciudadUsuario);
		chkTerminosCondicionesUsuario.click();
		btncontactarBanco.click();
		Assert.assertEquals("SOLICITAR INFORMACIÓN AL BANCO", lblContactarBanco.getText());
	}
	public void contactarAseguradora(String nombreUsuario, String cedulaUsuario, String correoElectronicoUsuario,
			String telefonoUsuario, String ciudadUsuario) {
		txtNombreUsuarioAsegurado.sendKeys(nombreUsuario);
		txtCedulaUsuarioAsegurado.sendKeys(cedulaUsuario);
		txtCorreoUsuarioAsegurado.sendKeys(correoElectronicoUsuario);
		txtTelefonoUsuarioAsegurado.sendKeys(telefonoUsuario);
		cmbCiudadUsuario.selectByVisibleText(ciudadUsuario);
		btncontactarAseguradora.click();
		Assert.assertEquals("SOLICITAR INFORMACIÓN DE LAS ASEGURADORAS", lblContactarAseguradora.getText());
	}
	
}
