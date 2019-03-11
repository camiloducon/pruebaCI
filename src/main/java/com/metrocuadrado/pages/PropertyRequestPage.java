package com.metrocuadrado.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.metrocuadrado.utils.Datos;
import com.metrocuadrado.utils.Helpers;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PropertyRequestPage extends PageObject {

	Helpers helpers = new Helpers();
	Datos excel = null;

	String rdbQuieroComprar = "businessTypeId1";

	String rdbQuieroArrendar = "businessTypeId2";

	@FindBy(xpath = "//*[@id=\"user-search-request-form\"]/fieldset/div[2]/div/button")
	WebElement btnBusco;
	String cmbBusco = "//*[@id=\"user-search-request-form\"]/fieldset/div[2]/div/div/ul/li[2]/a";

	@FindBy(xpath = "//*[@id=\"user-search-request-form\"]/fieldset/div[3]/div/button")
	WebElement btnUbicadoEn;
	@FindBy(xpath = "//*[@id=\"user-search-request-form\"]/fieldset/div[3]/div/div/ul/li[4]/a")
	WebElementFacade cmbUbicadoEn;
	@FindBy(xpath = "//*[@id=\"user-search-request-form\"]/fieldset/div[4]/div[2]/div/button/span[1]")
	WebElement btnRangoPrecio;
	@FindBy(xpath = "//*[@id=\"user-search-request-form\"]/fieldset/div[4]/div[2]/div/div/ul/li[5]/a")
	WebElementFacade cmbRangoPrecio;
	@FindBy(xpath = "//*[@id=\"numberOfRooms\"]/div/div/button[1]")
	WebElement btnHabitaciones1;
	@FindBy(xpath = "//*[@id=\"numberOfRooms\"]/div/div/button[2]")
	WebElement btnHabitaciones2;
	@FindBy(xpath = "//*[@id=\"numberOfRooms\"]/div/div/button[3]")
	WebElement btnHabitaciones3;
	@FindBy(xpath = "//*[@id=\"numberOfRooms\"]/div/div/button[4]")
	WebElement btnHabitaciones4;
	@FindBy(xpath = "//*[@id=\"numberOfRooms\"]/div/div/button[5]")
	WebElement btnHabitaciones5;
	@FindBy(xpath = "//*[@id=\"numberOfBathRooms\"]/div/div/button[1]")
	WebElement btnBanos1;
	@FindBy(xpath = "//*[@id=\"numberOfBathRooms\"]/div/div/button[2]")
	WebElement btnBanos2;
	@FindBy(xpath = "//*[@id=\"numberOfBathRooms\"]/div/div/button[3]")
	WebElement btnBanos3;
	@FindBy(xpath = "//*[@id=\"numberOfBathRooms\"]/div/div/button[4]")
	WebElement btnBanos4;
	@FindBy(xpath = "//*[@id=\"numberOfBathRooms\"]/div/div/button[5]")
	WebElement btnBanos5;
	@FindBy(xpath = "//*[@id=\"user-search-request-form\"]/fieldset/div[7]/textarea")
	WebElement txtMasCaracteristicasInmueble;
	@FindBy(xpath = "//*[@id=\"name\"]")
	WebElement txtNombre;
	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement txtCorreo;
	@FindBy(xpath = "//*[@id=\"user-search-request-form\"]/fieldset/div[11]/input")
	WebElement txtVivoEn;
	@FindBy(xpath = "//*[@id=\"mobile\"]")
	WebElement txtLlamame;
	@FindBy(xpath = "//*[@id=\"user-search-request-form\"]/fieldset/div[14]/button")
	WebElement btnEnviarSolicitud;
	@FindBy(xpath = "//*[@id=\"modalLabel\"]")
	WebElement lblConfirmacionSolicitudInmueble;

	public void solicitaTuInmueble() {

		excel = new Datos("C:\\Users\\camduc\\eclipse-workspace\\Metrocuadrado\\Datos.xlsx");
		ArrayList<String[]> tools = excel.readData("solicitaInmueble");
		for (int i = 0; i < tools.size(); i++) {
			String[] fila = tools.get(i);

			switch (fila[0]) {
			case "Comprar":
				find(By.id(rdbQuieroComprar)).click();
				break;
			case "Arrendar":
				find(By.id(rdbQuieroArrendar)).click();
				break;

			default:
				break;
				
			}
			btnBusco.click();
			WebElement listElements = this.getDriver()
					.findElement(By.xpath("//*[@id='user-search-request-form']/fieldset/div[2]/div/div/ul"));
			List<WebElement> liElements = listElements.findElements(By.tagName("li"));
			for (int j = 0; j < liElements.size(); j++) {
				if (liElements.get(j).getText().equals(fila[1])) {
					liElements.get(j).click();
					break;
				}
			}
			btnUbicadoEn.click();
			WebElement ubicadoEn = this.getDriver()
					.findElement(By.xpath("//*[@id=\"user-search-request-form\"]/fieldset/div[3]/div/div/ul"));
			List<WebElement> ubicadoEnLista = ubicadoEn.findElements(By.tagName("li"));
			for (int j = 0; j < ubicadoEnLista.size(); j++) {
				if (ubicadoEnLista.get(j).getText().equals(fila[2])) {
					ubicadoEnLista.get(j).click();
					break;
				}
			}
			btnRangoPrecio.click();
			WebElement rangoPrecios = this.getDriver()
					.findElement(By.xpath("//*[@id=\"user-search-request-form\"]/fieldset/div[4]/div[2]/div/div"));
			List<WebElement> rangoPreciosLista = rangoPrecios.findElements(By.tagName("li"));
			System.out.println(rangoPreciosLista);
			for (int j = 0; j < ubicadoEnLista.size(); j++) {
				if (rangoPreciosLista.get(j).getText().equals(fila[3])) {
					rangoPreciosLista.get(j).click();
					break;
				}
			}
			switch (fila[4]) {
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
			switch (fila[5]) {
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
			txtMasCaracteristicasInmueble.sendKeys(fila[6]);
			txtNombre.sendKeys(fila[7]);
			txtCorreo.sendKeys(fila[8]);
			txtVivoEn.sendKeys(fila[9]);
			txtLlamame.sendKeys(fila[10]);
			btnEnviarSolicitud.click();
			// Assert.assertEquals("Envío de Solicitud ¡exitoso!",
			// lblConfirmacionSolicitudInmueble.getText());

		}

	}
}