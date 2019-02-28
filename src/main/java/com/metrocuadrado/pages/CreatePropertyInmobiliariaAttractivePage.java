package com.metrocuadrado.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;

import com.metrocuadrado.utils.Helpers;

import dates.Datos;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreatePropertyInmobiliariaAttractivePage extends PageObject {
	Helpers helpers = new Helpers();
	Datos excel = null;

	@FindBy(xpath = "//form[@id='propertyComplementosForm']/div[4]/div/select")
	WebElement btnTipoAcabadoPiso;
	@FindBy(xpath = "//form[@id='propertyComplementosForm']/div[4]/div/select")
	WebElementFacade cmbTipoAcabadoPiso;
	@FindBy(xpath = "//form[@id='propertyComplementosForm']/div[5]/div/select")
	WebElement btnTipoPisoAlcoba;
	@FindBy(xpath = "//form[@id='propertyComplementosForm']/div[5]/div/select")
	WebElementFacade cmbTipoPisoAlcoba;
	@FindBy(xpath = "//form[@id='propertyComplementosForm']/div[6]/div/select")
	WebElement btnTipoPisoestudio;
	@FindBy(xpath = "//form[@id='propertyComplementosForm']/div[6]/div/select")
	WebElementFacade cmbTipoPisoestudio;
	@FindBy(xpath = "//form[@id='propertyComplementosForm']/div[7]/div/select")
	WebElement btnTipoPisoComedor;
	@FindBy(xpath = "//form[@id='propertyComplementosForm']/div[7]/div/select")
	WebElementFacade cmbTipoPisoComedor;
	@FindBy(xpath = "//form[@id='propertyComplementosForm']/div[8]/div/select")
	WebElement btnTipoPisoSala;
	@FindBy(xpath = "//form[@id='propertyComplementosForm']/div[8]/div/select")
	WebElementFacade cmbTipoPisoSala;
	@FindBy(xpath = "//form[@id='propertyVigilanciaForm']/div/div/select")
	WebElement btnVigiliancia;
	@FindBy(xpath = "//form[@id='propertyVigilanciaForm']/div/div/select")
	WebElementFacade cmbVigilancia;
	@FindBy (xpath= "//*[@id=\"necessaryDocumentTextArea\"]")
	WebElement txtDocumentosNecesarios;
	@FindBy (xpath= "//*[@id=\"cedula\"]")
	WebElement txtNumeroCedula;
	@FindBy (xpath= "//*[@id=\"ownerName\"]")
	WebElement txtNombreApellido;
	@FindBy (xpath= "//*[@id=\"cityOwner\"]")
	WebElement btnCiudad;
	@FindBy (id= "cityOwner")
	WebElementFacade cmbCiudad;
	@FindBy (xpath= "//*[@id=\"addressOwner\"]")
	WebElement txtDireccion;
	@FindBy (xpath= "//*[@id=\"phoneOwner\"]")
	WebElement txtTelefono;
	@FindBy (xpath= "//*[@id=\"necessaryDocumentTextArea\"]")
	WebElement txtCorreo;
	@FindBy (xpath= "//*[@id=\"propertyNoteTextArea\"]")
	WebElement txtNotasImportantes;
	@FindBy (xpath= "//*[@id=\"btnSaveAll\"]")
	WebElement btnGuardarPublicacionInmobiliaria;
	@FindBy(xpath = "//*[@id=\"mostrarEstaSeguro\"]/div/div/div[3]/div/button[2]")
	WebElement btnAceptarPublicacion;

	public void principalesAtractivosInmobiliaria() {
		excel = new Datos("C:\\Users\\camduc\\eclipse-workspace\\Metrocuadrado\\Datos.xlsx");
		ArrayList<String[]> login = excel.readData("inmobiliaria");
		for (int i = 0; i < login.size(); i++) {
			String[] fila = login.get(i);

			btnTipoAcabadoPiso.click();
			cmbTipoAcabadoPiso.selectByVisibleText(fila[44]);
			btnTipoPisoAlcoba.click();
			cmbTipoPisoAlcoba.selectByVisibleText(fila[45]);
			btnTipoPisoestudio.click();
			cmbTipoPisoestudio.selectByVisibleText(fila[46]);
			btnTipoPisoComedor.click();
			cmbTipoPisoComedor.selectByVisibleText(fila[47]);
			btnTipoPisoSala.click();
			cmbTipoPisoSala.selectByVisibleText(fila[48]);
			btnVigiliancia.click();
			cmbVigilancia.selectByVisibleText(fila[49]);
			txtDocumentosNecesarios.sendKeys(fila[50]);
			txtNumeroCedula.sendKeys(fila[51]);
			//txtNombreApellido.sendKeys(fila[52]);
			//btnCiudad.click();
			//cmbCiudad.selectByVisibleText(fila[53]);
			//txtDireccion.sendKeys(fila[54]);
			//txtTelefono.sendKeys(fila[55]);
			//txtCorreo.sendKeys(fila[56]);
			txtNotasImportantes.sendKeys(fila[57]);
			helpers.esperaSelenium(2);
			btnGuardarPublicacionInmobiliaria.click();
			btnAceptarPublicacion.click();
			helpers.esperaSelenium(15);
		}
	}
}