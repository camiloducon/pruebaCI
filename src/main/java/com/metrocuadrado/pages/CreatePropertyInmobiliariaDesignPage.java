package com.metrocuadrado.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;

import com.metrocuadrado.utils.Datos;
import com.metrocuadrado.utils.Helpers;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreatePropertyInmobiliariaDesignPage extends PageObject {
	Helpers helpers = new Helpers();
	Datos excel = null;

	String btnTipoCocina = "idlistaValoresInput" ;
	@FindBy(xpath = "//div[5]/div/div/div[2]/div/form/div/div/select")
	WebElementFacade cmbTipoCocina;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[2]/div/div[1]/button[1]")
	WebElement btnTipoComedorSalaComedor;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[2]/div/div[1]/button[2]")
	WebElement btnTipoComedorComedorIndependiente;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[3]/div/div[1]/button[1]")
	WebElement btnTipoGasNatural;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[3]/div/div[1]/button[2]")
	WebElement btnTipoGasPropano;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[3]/div/div[1]/button[3]")
	WebElement btnTipoGasNinguna;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[4]/div/div[1]/button[1]")
	WebElement btnTipoEstufaElectrica;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[4]/div/div[1]/button[2]")
	WebElement btnTipoEstufaGas;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[4]/div/div[1]/button[3]")
	WebElement btnTipoEstufaMixta;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[5]/div/div[1]/button[1]")
	WebElement btnTipoCalentadorGas;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[5]/div/div[1]/button[2]")
	WebElement btnTipoCalentadorElectrico;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[5]/div/div[1]/button[3]")
	WebElement btnTipoCalentadorCaldera;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[5]/div/div[1]/button[4]")
	WebElement btnTipoCalentadorNoTiene;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[6]/div/div[1]/button[1]")
	WebElement btnEstudioBibliotecaSi;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[6]/div/div[1]/button[2]")
	WebElement btnEstudioBibliotecaNo;
	String btnTerrazaBalcon ="#propertyStyleForm > .form-group:nth-child(14) #idlistaValoresInput";
	@FindBy(xpath = "//form[@id='propertyStyleForm']/div[7]/div/select")
	WebElementFacade cmbTerrazaBalcon;
	@FindBy(xpath = "//form/div[8]/div/input")
	WebElement txtAreaTerrazaBalcon;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[9]/div/div[1]/button[1]")
	WebElement btnConjuntoCerradoSi;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[9]/div/div[1]/button[2]")
	WebElement btnConjuntoCerradoNo;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[10]/div/div[1]/button[1]")
	WebElement btnZonaLavanderiaSi;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[10]/div/div[1]/button[2]")
	WebElement btnZonaLavanderiaNo;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[11]/div/div[1]/button[1]")
	WebElement btnConMueblesSi;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[11]/div/div[1]/button[1]")
	WebElement btnConMueblesNo;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[12]/div/div[1]/button[1]")
	WebElement btnNumeroClosets0;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[12]/div/div[1]/button[2]")
	WebElement btnNumeroClosets1;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[12]/div/div[1]/button[3]")
	WebElement btnNumeroClosets2;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[12]/div/div[1]/button[4]")
	WebElement btnNumeroClosets3;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[12]/div/div[1]/button[5]")
	WebElement btnNumeroClosets4;
	String btnTipoCortinas = "//form[@id='propertyStyleForm']/div[13]/div/select" ;
	@FindBy(xpath = "//form[@id='propertyStyleForm']/div[13]/div/select")
	WebElementFacade cmbTipoCortinas;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[14]/div/div[1]/button[1]")
	WebElement btnEnInteriorBloqueSi;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[14]/div/div[1]/button[2]")
	WebElement btnEnInteriorBloqueNo;
	@FindBy(name = "listOtherFeaturesDTO[14].stringValue")
	WebElement txtNumeroInteriorBloque;
	@FindBy(name = "listOtherFeaturesDTO[15].stringValue")
	WebElement txtNumeroApto;
	@FindBy(name = "listOtherFeaturesDTO[16].stringValue")
	WebElement txtNumeroPiso;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[18]/div/div[1]/button[1]")
	WebElement btnNumeroAscensores0;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[18]/div/div[1]/button[2]")
	WebElement btnNumeroAscensores1;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[18]/div/div[1]/button[3]")
	WebElement btnNumeroAscensores2;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[18]/div/div[1]/button[4]")
	WebElement btnNumeroAscensores3;
	@FindBy(xpath = "//*[@id=\"propertyStyleForm\"]/div[18]/div/div[1]/button[5]")
	WebElement btnNumeroAscensores4;
	@FindBy(css = ".form-group:nth-child(38) #idlistaValoresInput")
	WebElement btnEntidadHipoteca;
	@FindBy(xpath= "//form[@id='propertyStyleForm']/div[19]/div/select")
	WebElementFacade cmbEntidadHipoteca ;
	@FindBy(name = "listOtherFeaturesDTO[19].stringValue")
	WebElement txtMatriculaInmobiliaria;
	

	public void disenoInmuebleInmobiliaria() {
		excel = new Datos("C:\\Users\\camduc\\eclipse-workspace\\Metrocuadrado\\Datos.xlsx");
		ArrayList<String[]> login = excel.readData("inmobiliaria");
		for (int i = 0; i < login.size(); i++) {
			String[] fila = login.get(i);

			find(By.cssSelector(btnTipoCocina));
			cmbTipoCocina.selectByValue(fila[24]);
			switch (fila[25]) {
			case "Sala Comedor":
				btnTipoComedorSalaComedor.click();
				break;
			case "Comedor Independiente":
				btnTipoComedorComedorIndependiente.click();
				break;
			default:
				break;
			}
			switch (fila[26]) {
			case "Natural":
				btnTipoGasNatural.click();
				break;
			case "Propano":
				btnTipoGasPropano.click();
				break;
			case "Ninguna":
				btnTipoGasNinguna.click();
				break;

			default:
				break;
			}
			switch (fila[27]) {
			case "Electrica":
				btnTipoEstufaElectrica.click();
				break;
			case "Gas":
				btnTipoEstufaGas.click();
				break;
			case "Mixta":
				btnTipoEstufaMixta.click();
				break;

			default:
				break;
			}
			switch (fila[28]) {
			case "Gas":
				btnTipoCalentadorGas.click();
				break;
			case "Electrico":
				btnTipoCalentadorElectrico.click();
				break;
			case "Caldera":
				btnTipoCalentadorCaldera.click();
				break;
			case "No tiene":
				btnTipoCalentadorNoTiene.click();
				break;
			default:
				break;
			}
			switch (fila[29]) {
			case "Si":
				btnEstudioBibliotecaSi.click();
				break;
			case "No":
				btnEstudioBibliotecaNo.click();
				break;

			default:
				break;
			}
			find(By.cssSelector(btnTerrazaBalcon));
			cmbTerrazaBalcon.selectByValue(fila[30]);
			txtAreaTerrazaBalcon.sendKeys(fila[31]);
			switch (fila[32]) {
			case "Si":
				btnConjuntoCerradoSi.click();
				break;
			case "No":
				btnConjuntoCerradoNo.click();
				break;

			default:
				break;
			}
			switch (fila[33]) {
			case "Si":
				btnZonaLavanderiaSi.click();
				break;
			case "No":
				btnZonaLavanderiaNo.click();
				break;

			default:
				break;
			}
			switch (fila[34]) {
			case "Si":
				btnConMueblesSi.click();
				break;
			case "No":
				btnConMueblesNo.click();
				break;

			default:
				break;
			}
			switch (fila[35]) {
			case "0":
				btnNumeroClosets0.click();
				break;
			case "1":
				btnNumeroClosets1.click();
				break;
			case "2":
				btnNumeroClosets2.click();
				break;
			case "3":
				btnNumeroClosets3.click();
				break;
			case "4":
				btnNumeroClosets4.click();
				break;
			default:
				break;
			}
			find(By.xpath(btnTipoCortinas));
			cmbTipoCortinas.selectByVisibleText(fila[36]);
			switch (fila[37]) {
			case "Si":
				btnEnInteriorBloqueSi.click();
				break;
			case "No":
				btnEnInteriorBloqueNo.click();
				break;

			default:
				break;
			}
			txtNumeroInteriorBloque.sendKeys(fila[38]);
			txtNumeroApto.sendKeys(fila[39]);
			txtNumeroPiso.sendKeys(fila[40]);
			switch (fila[41]) {
			case "0":
				btnNumeroAscensores0.click();
				break;
			case "1":
				btnNumeroAscensores1.click();
				break;
			case "2":
				btnNumeroAscensores2.click();
				break;
			case "3":
				btnNumeroAscensores3.click();
				break;
			case "4":
				btnNumeroAscensores4.click();
				break;
			default:
				break;
			}
			helpers.esperaSelenium(5);
			btnEntidadHipoteca.click();
			cmbEntidadHipoteca.selectByValue(fila[42]);
			txtMatriculaInmobiliaria.sendKeys(fila[43]);
		}
	}
}
