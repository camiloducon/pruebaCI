package com.metrocuadrado.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.metrocuadrado.utils.Datos;
import com.metrocuadrado.utils.Helpers;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class CreatePropertyInmobiliariaLocationPage extends PageObject {

	Helpers helpers = new Helpers();
	Datos excel = null;
	@FindBy(xpath = "//input[@id='geolocationDTO.cityId']")
	WebElement txtCiudad;
	String txtBarrioCatastral = "//*[@id=\"geolocationDTO.cadastralNeighborhood\"]";
	@FindBy(xpath = "//*[@id=\"Address\"]")
	WebElement txtDireccion;
	@FindBy(xpath = "//*[@id=\"common0commonNeighborhoodName\"]")
	WebElement txtNombreComunBarrio;
	@FindBy(xpath = "//*[@id=\"txtEstrato\"]")
	WebElement txtEstrato;
	@FindBy(xpath= "//*[@id=\"propertyMultimediaContainer\"]/div/div[1]/div[1]/div/div/div[2]/button")
	WebElement btnCargarFotosProyecto;  
	@FindBy(xpath = "//*[@id=\"propertyMultimediaContainer\"]/div/div[2]/div/div/div[1]/input")
	WebElement txtVideo;
	@FindBy(xpath = "//*[@id=\"publicationCommentTextArea\"]")
	WebElement txtDescribaSuInmueble;

	public void localizacionInmuebleInmobiliaria() {

		excel = new Datos("C:\\Users\\camduc\\eclipse-workspace\\Metrocuadrado\\Datos.xlsx");
		ArrayList<String[]> login = excel.readData("inmobiliaria");
		for (int i = 0; i < login.size(); i++) {
			String[] fila = login.get(i);

			waitFor(ExpectedConditions.invisibilityOfElementLocated(By.className("cargando")));
			helpers.esperaSelenium(3);
			waitForPresenceOf("//input[@id='geolocationDTO.cityId']");
			txtCiudad.sendKeys(fila[19]);
			txtDireccion.sendKeys(fila[20]);
			Actions actions2 = new Actions(this.getDriver());
			actions2.moveToElement(find(By.xpath(txtBarrioCatastral)));
			actions2.click();
			actions2.build().perform();
			txtNombreComunBarrio.sendKeys(fila[21]);
			helpers.esperaSelenium(3);
			WebElement cmbBarrio = find(By.xpath("//ul[contains(@id,'ui-id')]"));
			List<WebElement> listBarrio = cmbBarrio.findElements(By.tagName("li"));
			listBarrio.get(0).click();
			helpers.esperaSelenium(3);
			btnCargarFotosProyecto.click();
			helpers.esperaSelenium(2);
			helpers.carguesAutoIT("C:\\Users\\camduc\\eclipse-workspace\\Metrocuadrado\\cargue3ArchivosUbicacion.exe");
			helpers.esperaSelenium(2);
			helpers.carguesAutoIT("C:\\Users\\camduc\\eclipse-workspace\\Metrocuadrado\\cargue3archivos.exe");
			helpers.esperaSelenium(3);
			waitFor(ExpectedConditions.invisibilityOfElementLocated(By.className("cargador-barra")));
			txtVideo.sendKeys(fila[22]);
			txtDescribaSuInmueble.sendKeys(fila[23]);
		}
	}
}
