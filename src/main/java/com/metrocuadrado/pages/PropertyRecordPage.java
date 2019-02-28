package com.metrocuadrado.pages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.metrocuadrado.utils.Helpers;

import dates.Datos;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class PropertyRecordPage extends PageObject {

	Helpers helpers = new Helpers();
	Datos excel = null;
	@FindBy(xpath = "//*[@id=\"secondStepForm\"]/fieldset/div[1]/div/input")
	WebElement txtNombre;
	@FindBy(xpath = "//*[@id=\"secondStepForm\"]/fieldset/div[2]/div/input")
	WebElement txtCelular;
	@FindBy(xpath = "//*[@id=\"secondStepForm\"]/fieldset/div[3]/div/input")
	WebElement txtCorreoElectronico;
	@FindBy(xpath = "//*[@id=\"secondStepForm\"]/fieldset/div[4]/div/div[1]/button")
	WebElement btnTipoInmueble;
	@FindBy(xpath = "//*[@id=\"secondStepForm\"]/fieldset/div[4]/div/div[1]/div/ul/li[3]/a")
	WebElement cmbTipoInmueble;
	@FindBy(xpath = "//*[@id=\"secondStepForm\"]/fieldset/div[5]/div/input[1]")
	WebElement txtUbicacioninmueble;
	@FindBy(xpath = "//*[@id=\"secondStepForm\"]/fieldset/div[6]/div/div[1]/button/span[1]")
	WebElement btnZona;
	@FindBy(xpath = "//*[@id=\"secondStepForm\"]/fieldset/div[6]/div/div[1]/div/ul/li[3]/a")
	WebElement cmbZona;
	String rdbArriendo = "businessType0";
	String rdbVenta = "businessType1";
	String rdbVentaArriendo = "businessType2";
	@FindBy(xpath = "//*[@id=\"salePrice\"]")
	WebElement txtPrecioVenta;
	@FindBy(xpath = "//*[@id=\"rentPrice\"]")
	WebElement txtPrecioRenta;
	@FindBy(xpath = "//*[@id=\"area\"]")
	WebElement txtAreaMetros;
	@FindBy(xpath = "//*[@id=\"features\"]")
	WebElement txtCaracteristicasInmueble;
	@FindBy(xpath = "//*[@id=\"sendConsignment\"]")
	WebElement btnEnviarConsignacion;
	@FindBy(xpath = "/html/body/div[10]/div/div/div[2]")
	WebElement lblConfimarConsignacion;

	public void consignarInmueble() {

		excel = new Datos("C:\\Users\\camduc\\eclipse-workspace\\Metrocuadrado\\Datos.xlsx");
		ArrayList<String[]> tools = excel.readData("consignaInmueble");
		for (int i = 0; i < tools.size(); i++) {
			String[] fila = tools.get(i);
			
			txtNombre.sendKeys(fila[0]);
			txtCelular.sendKeys(fila[1]);
			txtCorreoElectronico.sendKeys(fila[2]);
			btnTipoInmueble.click();
			WebElement tipoInmueble = this.getDriver()
					.findElement(By.xpath("//*[@id=\"secondStepForm\"]/fieldset/div[4]/div/div[1]/div/ul"));
			List<WebElement> tipoInmuebleLista = tipoInmueble.findElements(By.tagName("li"));
			for (int j = 0; j < tipoInmuebleLista.size(); j++) {
				if (tipoInmuebleLista.get(j).getText().equals(fila[3])) {
					tipoInmuebleLista.get(j).click();
					break;
				}
			}
			txtUbicacioninmueble.sendKeys(fila[4]);
			helpers.esperaSelenium(2);
			switch (fila[6]) {
			case "Arriendo":
				find(By.id(rdbArriendo)).click();
				break;
			case "Venta":
				find(By.id(rdbVenta)).click();
				break;
			case "Venta y arriendo":
				find(By.id(rdbVentaArriendo)).click();
				break;
			default:
				break;
			}
			
			txtPrecioVenta.sendKeys(fila[7]);
			Actions actions = new Actions(this.getDriver());
			boolean btnzona = btnZona.isEnabled();
			System.out.println(btnzona);
			actions.moveToElement(btnZona);
			helpers.esperaSelenium(5);
			actions.click();
			actions.build().perform();
			WebElement zona = this.getDriver()
					.findElement(By.xpath("//*[@id=\"secondStepForm\"]/fieldset/div[6]/div/div[1]/div/ul"));
			List<WebElement> zonaLista = zona.findElements(By.tagName("li"));
			for (int j = 0; j < zonaLista.size(); j++) {
				if (zonaLista.get(j).getText().equals(fila[5])) {
					zonaLista.get(j).click();
					break;
				}
			}
			txtPrecioRenta.sendKeys(fila[8]);
			txtAreaMetros.sendKeys(fila[9]);
			txtCaracteristicasInmueble.sendKeys(fila[10]);
			btnEnviarConsignacion.click();
			Assert.assertEquals("En menos de 24 horas, una inmobiliaria se pondrá en contacto contigo.", lblConfimarConsignacion.getText());

		}
	}
}
