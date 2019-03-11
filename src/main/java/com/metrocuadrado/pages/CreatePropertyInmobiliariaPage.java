package com.metrocuadrado.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.metrocuadrado.utils.Datos;
import com.metrocuadrado.utils.Helpers;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreatePropertyInmobiliariaPage extends PageObject {
	Helpers helpers = new Helpers();
	Datos excel = null;
	
	
	@FindBy(name = "businessTypeId")
	WebElement btnTipoNegocioInmueble;
	@FindBy(id = "listBusinessTypeField")
	WebElementFacade cmbTipoNegocioInmueble;
	@FindBy(xpath = "//*[@id=\"negotiationType\"]")
	WebElement btnTipoNegociacion;
	@FindBy(id = "negotiationType")
	WebElementFacade cmbTipoNegociacion;
	@FindBy(name = "propertyTypeId")
	WebElement btnTipoInmueble;
	@FindBy(name = "propertyTypeId")
	WebElementFacade cmbTipoInmueble;
	@FindBy(xpath = "//*[@id=\"horizontalFormtext\"]")
	WebElement txtValorVenta;
	@FindBy(name = "leasingValue")
	WebElement txtValorArriendo;
	@FindBy(name = "adminValue")
	WebElement txtValorAdministracion;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[1]/div/div[1]/button[1]")
	WebElement btnVistaInterior;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[1]/div/div[1]/button[2]")
	WebElement btnVistaExterior;
	@FindBy(id = "idlistaValoresInput")
	WebElement btnTiempoConstruido;
	@FindBy(id = "idlistaValoresInput")
	WebElementFacade cmbTiempoConstruido;
	
	
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[3]/div/div[1]/button[1]")
	WebElement btnHabitaciones1;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[3]/div/div[1]/button[2]]")
	WebElement btnHabitaciones2;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[3]/div/div[1]/button[3]")
	WebElement btnHabitaciones3;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[3]/div/div[1]/button[4]")
	WebElement btnHabitaciones4;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[3]/div/div[1]/button[5]")
	WebElement btnHabitaciones5;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[4]/div/div[1]/button[1]")
	WebElement btnBanos1;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[4]/div/div[1]/button[2]")
	WebElement btnBanos2;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[4]/div/div[1]/button[3]")
	WebElement btnBanos3;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[4]/div/div[1]/button[4]")
	WebElement btnBanos4;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[4]/div/div[1]/button[5]")
	WebElement btnBanos5;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[5]/div/div[1]/button[1]")
	WebElement btnParqueadero0;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[5]/div/div[1]/button[2]")
	WebElement btnParqueadero1;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[5]/div/div[1]/button[3]")
	WebElement btnParqueadero2;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[5]/div/div[1]/button[4]")
	WebElement btnParqueadero3;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[5]/div/div[1]/button[5]")
	WebElement btnParqueadero4;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[6]/div/div[1]/button[1]")
	WebElement btnParqueaderoCubiertoSi;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[6]/div/div[1]/button[2]")
	WebElement btnParqueaderoCubiertoNo;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[7]/div/div[1]/button[1]")
	WebElement btntipoParqueaderoPropio;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[7]/div/div[1]/button[2]")
	WebElement btntipoParqueaderoComunal;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[7]/div/div[1]/button[3]")
	WebElement btntipoParqueaderoServidumbre;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[7]/div/div[1]/button[4]")
	WebElement btntipoParqueaderoIndependiente;
	@FindBy(name = "listOtherFeaturesDTO[7].stringValue")
	WebElement txtAreaConstruidaInmueble;
	@FindBy(name = "listOtherFeaturesDTO[8].stringValue")
	WebElement txtAreaPrivadaInmueble;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[10]/div/div[1]/button[1]")
	WebElement btnNegociarPrecioSi;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[10]/div/div[1]/button[2]")
	WebElement btnNegociarPrecioNo;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[12]/div/div[1]/button[1]")
	WebElement btnDeposito0;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[12]/div/div[1]/button[2]")
	WebElement btnDeposito1;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[12]/div/div[1]/button[3]")
	WebElement btnDeposito2;
	@FindBy(xpath = "//*[@id=\"propertyDataForm\"]/div[7]/div[12]/div/div[1]/button[4]")
	WebElement btnDeposito3;
	@FindBy(xpath="//*[@id=\"sendPropertyData\"]")
	WebElement btnGuardarPublicacionInmobiliaria;



	public void creacionInmuebleDatosInmueble() {

		excel = new Datos("C:\\Users\\camduc\\eclipse-workspace\\Metrocuadrado\\Datos.xlsx");
		ArrayList<String[]> login = excel.readData("inmobiliaria");
		for (int i = 0; i < login.size(); i++) {
			String[] fila = login.get(i);

			helpers.esperaSelenium(2);
			btnTipoNegocioInmueble.click();
			cmbTipoNegocioInmueble.selectByVisibleText(fila[2]);
			Actions actions = new Actions(this.getDriver());
			actions.moveToElement(btnTipoNegociacion);
			actions.click();
			cmbTipoNegociacion.selectByVisibleText(fila[3]);
			helpers.esperaSelenium(2);
			btnTipoInmueble.click();
			cmbTipoInmueble.selectByVisibleText(fila[4]);
			txtValorVenta.sendKeys(fila[5]);
			txtValorArriendo.sendKeys(fila[6]);
			txtValorAdministracion.sendKeys(fila[7]);
			switch (fila[8]) {
			case "Interior":
				btnVistaInterior.click();
				break;
			case "Exterior":
				btnVistaExterior.click();
				break;

			default:
				break;
			}
			btnTiempoConstruido.click();
			cmbTiempoConstruido.selectByVisibleText(fila[9]);
			switch (fila[10]) {
			case "1":
				btnHabitaciones1.click();
				break;
			case "2":
				btnHabitaciones2.click();
				break;
			case "3":
				btnHabitaciones3.click();
				break;
			case "4":
				btnHabitaciones4.click();
				break;
			case "5":
				btnHabitaciones5.click();
				break;

			default:
				break;
			}
			switch (fila[11]) {
			case "1":
				btnBanos1.click();
				break;
			case "2":
				btnBanos2.click();
				break;
			case "3":
				btnBanos3.click();
				break;
			case "4":
				btnBanos4.click();
				break;
			case "5":
				btnBanos5.click();
				break;

			default:
				break;
			}
			switch (fila[12]) {
			case "1":
				btnParqueadero0.click();
				break;
			case "2":
				btnParqueadero1.click();
				break;
			case "3":
				btnParqueadero2.click();
				break;
			case "4":
				btnParqueadero3.click();
				break;
			case "5":
				btnParqueadero4.click();
				break;

			default:
				break;
			}
			switch (fila[13]) {
			case "Si":
				btnParqueaderoCubiertoSi.click();
				break;
			case "No":
				btnParqueaderoCubiertoNo.click();
				break;
			default:
				break;
			}
			switch (fila[14]) {
			case "Propio":
				btntipoParqueaderoPropio.click();
				break;
			case "Comunal":
				btntipoParqueaderoComunal.click();
				break;
			case "Servidumbre":
				btntipoParqueaderoServidumbre.click();
				break;
			case "Independiente":
				btntipoParqueaderoIndependiente.click();
				break;

			default:
				break;
			}
			txtAreaConstruidaInmueble.sendKeys(fila[15]);
			txtAreaPrivadaInmueble.sendKeys(fila[16]);
			switch (fila[17]) {
			case "Si":
				btnNegociarPrecioSi.click();
				break;
			case "No":
				btnNegociarPrecioNo.click();
				break;

			default:
				break;
			}
			switch (fila[18]) {
			case "0":
				btnDeposito0.click();
				break;
			case "1":
				btnDeposito1.click();
				break;
			case "2":
				btnDeposito2.click();
				break;
			case "3":
				btnDeposito3.click();
				break;

			default:
				break;
			}
			btnGuardarPublicacionInmobiliaria.click();
		}
	}
}
