package com.metrocuadrado.pages;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreatePublicationPage extends PageObject {

	@FindBy(xpath = "//*[@id=\"collapsibleCamposInicialesBody\"]/div/div[1]/div[2]/div/div[1]/button[1]")
	WebElement btnVenderInmueble;
	@FindBy(xpath = "//*[@id=\"collapsibleCamposInicialesBody\"]/div/div[1]/div[2]/div/div[1]/button[2]")
	WebElement btnArrendarInmueble;
	@FindBy(xpath = "//div[2]/div/button")
	WebElementFacade cmbTipoInmueble;
	@FindBy(xpath = "//li[1]/a/span")
	WebElementFacade cmbTipoInmuebleApartamento;
	@FindBy(xpath = "//li[2]/a/span")
	WebElementFacade cmbTipoInmuebleCasa;
	@FindBy(xpath = "//li[3]/a/span")
	WebElementFacade cmbTipoInmuebleOficina;
	@FindBy(xpath = "//li[4]/a/span")
	WebElementFacade cmbTipoInmuebleLoteCasaLote;
	@FindBy(xpath = "//li[5]/a/span")
	WebElementFacade cmbTipoInmuebleConsultorio;
	@FindBy(xpath = "//li[6]/a/span")
	WebElementFacade cmbTipoInmuebleLocalComercial;
	@FindBy(xpath = "//li[7]/a/span")
	WebElementFacade cmbTipoInmuebleFinca;
	@FindBy(xpath = "//li[8]/a/span")
	WebElementFacade cmbTipoInmuebleBodega;
	@FindBy(xpath = "//*[@id=\"inputsaleValue\"]")
	WebElement txtValorVenta;
	@FindBy(xpath = "//*[@id=\"inputleasingValue\"]")
	WebElement txtValorArriendo;
	@FindBy(xpath = "//*[@id=\"whitAdmin_cb\"]")
	WebElement chkIncluyeAdministacion;
	@FindBy(xpath = "//*[@id=\"inputadminValue\"]")
	WebElement txtValorAdministracion;

	// UBICACION
	@FindBy(xpath = "//*[@id=\"collapsibleLocationBody\"]/div/div[2]/div[2]/div/button")
	WebElement cmbUbicacionInmueble;
	@FindBy(xpath = "//li[contains(@class, 'selected active')]/a/span[contains(@class, 'text')]")
	WebElement selectCmbUbicacionInmueble;
	@FindBy(xpath = "//*[@id=\"collapsibleLocationBody\"]/div/div[2]/div[2]/div/div/div/input")
	WebElement txtUbicacionInmueble;
	@FindBy(xpath = "//*[@id=\"address\"]")
	WebElement txtDireccionInmueble;
	@FindBy(xpath = "//*[@id=\"neighborhoodCommonName\"]")
	WebElement txtBarrioInmueble;
	@FindBy(xpath = "//*[@id=\"ui-id-1926\"]")
	WebElementFacade selectBarrioInmueble;

	// caracteristicasInmueble
	@FindBy(xpath = "//*[@id=\"estrato\"]")
	WebElement txtEstratoInmueble;
	@FindBy(xpath = "//*[@id=\"input-text-id-area\"]")
	WebElement txtAreaPrivadaInmueble;
	@FindBy(xpath = "//*[@id=\"input-text-id-areaConstruida\"]")
	WebElement txtAreaContruidaInmueble;
	@FindBy(xpath = "//*[@id=\"input-text-id-nroPiso\"]")
	WebElement txtNumeroPisosInmueble;
	@FindBy(xpath = "//*[@id=\"select-id-tiempoConstruido\"]")
	WebElementFacade cmbTiempoCOntruido;
	@FindBy(xpath = "//*[@id=\"collapsibleFeaturesBody\"]/div/div[6]/div[2]/div/div[1]/button[1]")
	WebElementFacade btnNumeroHabitacionesInmueble1;
	@FindBy(xpath = "//*[@id=\"collapsibleFeaturesBody\"]/div/div[6]/div[2]/div/div[1]/button[2]")
	WebElementFacade btnNumeroHabitacionesInmueble2;
	@FindBy(xpath = "//*[@id=\"collapsibleFeaturesBody\"]/div/div[6]/div[2]/div/div[1]/button[3]")
	WebElementFacade btnNumeroHabitacionesInmueble3;
	@FindBy(xpath = "//*[@id=\"collapsibleFeaturesBody\"]/div/div[6]/div[2]/div/div[1]/button[4]")
	WebElementFacade btnNumeroHabitacionesInmueble4;
	@FindBy(xpath = "//*[@id=\"collapsibleFeaturesBody\"]/div/div[6]/div[2]/div/div[1]/button[5]")
	WebElementFacade btnNumeroHabitacionesInmueble5;
	@FindBy(xpath = "//*[@id=\"collapsibleFeaturesBody\"]/div/div[7]/div[2]/div/div[1]/button[1]")
	WebElement btnNumeroBanosInmueble1;
	@FindBy(xpath = "//*[@id=\"collapsibleFeaturesBody\"]/div/div[7]/div[2]/div/div[1]/button[2]")
	WebElement btnNumeroBanosInmueble2;
	@FindBy(xpath = "//*[@id=\"collapsibleFeaturesBody\"]/div/div[7]/div[2]/div/div[1]/button[3]")
	WebElement btnNumeroBanosInmueble3;
	@FindBy(xpath = "//*[@id=\"collapsibleFeaturesBody\"]/div/div[7]/div[2]/div/div[1]/button[4]")
	WebElement btnNumeroBanosInmueble4;
	@FindBy(xpath = "//*[@id=\"collapsibleFeaturesBody\"]/div/div[7]/div[2]/div/div[1]/button[5]")
	WebElement btnNumeroBanosInmueble5;
	@FindBy(xpath = "//*[@id=\"collapsibleFeaturesBody\"]/div/div[8]/div[2]/div/div[1]/button[1]")
	WebElement btnNumeroParqueaderosInmueble0;
	@FindBy(xpath = "//*[@id=\"collapsibleFeaturesBody\"]/div/div[8]/div[2]/div/div[1]/button[2]")
	WebElement btnNumeroParqueaderosInmueble1;
	@FindBy(xpath = "//*[@id=\"collapsibleFeaturesBody\"]/div/div[8]/div[2]/div/div[1]/button[3]")
	WebElement btnNumeroParqueaderosInmueble2;
	@FindBy(xpath = "//*[@id=\"collapsibleFeaturesBody\"]/div/div[8]/div[2]/div/div[1]/button[4]")
	WebElement btnNumeroParqueaderosInmueble3;
	@FindBy(xpath = "//*[@id=\"collapsibleFeaturesBody\"]/div/div[8]/div[2]/div/div[1]/button[5]")
	WebElement btnNumeroParqueaderosInmueble4;
	@FindBy(xpath = "//*[@id=\"collapsibleFeaturesBody\"]/div/div[9]/div[2]/div/div[1]/button[1]")
	WebElement btntipoParqueaderoPropio;
	@FindBy(xpath = "//*[@id=\"collapsibleFeaturesBody\"]/div/div[9]/div[2]/div/div[1]/button[2]")
	WebElement btntipoParqueaderoComunal;
	@FindBy(xpath = "//*[@id=\"collapsibleFeaturesBody\"]/div/div[9]/div[2]/div/div[1]/button[3]")
	WebElement btntipoParqueaderoServidumbre;
	@FindBy(xpath = "//*[@id=\"collapsibleFeaturesBody\"]/div/div[9]/div[2]/div/div[1]/button[4]")
	WebElement btntipoParqueaderoIndependiente;
	@FindBy(xpath = "//*[@id=\"select-id-caracteristicasParqueadero\"]")
	WebElementFacade cmbCaracteristicaParqueadero;
	@FindBy (xpath = "//*[@id=\"collapsibleMultimediaBody\"]/div/div[1]/div[1]/div[2]/button")
	WebElement btnAgregarFoto;

	// caracteristicas inmueble
	@FindBy(xpath = "//*[@id=\"collapsibleMultimediaBody\"]/div/div[1]/div[4]/div/div/div/div[1]/input")
	WebElement txtVideoInmueble;
	@FindBy(xpath = "//*[@id=\"publicationComment\"]")
	WebElement txtComentariosInmueble;
	@FindBy(xpath = "//*[@id=\"textadvice\"]")
	WebElement txtAvisoImpreso;
	@FindBy(xpath = "//*[@id=\"btnpublishcreateproperty\"]")
	WebElement btnContinuarPublicacion;

	/*
	 * @FindBy() WebElement;
	 * 
	 * @FindBy() WebElement;
	 * 
	 * @FindBy() WebElement;
	 * 
	 * @FindBy() WebElement;
	 */
	public void informacionInmueble(String tipooferta, String tipoinmueble, String valorventa, String valorarriendo,
			String ubicacioninmueble, String direccioninmueble, String barrioinmueble, String barrioinmuebleexacto,
			String estrato, String areaprivada, String areaconstruida, String numeropisos, String tiempoconstruido,
			String habitaciones, String banos, String parqueaderos, String tipoparqueadero,
			String caracteristicaparqueadero, String videoinmueble, String comentariosadicionales, String avisoimpreso)  {
		switch (tipooferta) {
		case "Vender":
			btnVenderInmueble.click();
			break;
		case "Arrendar":
			btnArrendarInmueble.click();
			break;

		default:
			break;
		}
		cmbTipoInmueble.click();

		switch (tipoinmueble) {
		case "Apartamento":
			cmbTipoInmuebleApartamento.click();
			break;
		case "Casa":
			cmbTipoInmuebleCasa.click();
			break;
		case "Oficina":
			cmbTipoInmuebleOficina.click();
			break;
		case "Lote o Casalote":
			cmbTipoInmuebleLoteCasaLote.click();
			break;
		case "Consultorio":
			cmbTipoInmuebleConsultorio.click();
			break;
		case "LocalComercial":
			cmbTipoInmuebleLocalComercial.click();
			break;
		case "Finca":
			cmbTipoInmuebleFinca.click();
			break;
		case "Bodega":
			cmbTipoInmuebleBodega.click();
			break;

		default:
			break;
		}
		if (tipooferta.equals("Vender")) {
			txtValorVenta.sendKeys(valorventa);
		} else {
			txtValorArriendo.sendKeys(valorarriendo);
		}
		cmbUbicacionInmueble.click();
		txtUbicacionInmueble.sendKeys(ubicacioninmueble);
		selectCmbUbicacionInmueble.click();
		txtDireccionInmueble.sendKeys(direccioninmueble);
		txtBarrioInmueble.sendKeys(barrioinmueble);
		// selectBarrioInmueble.selectByVisibleText(barrioinmuebleexacto);
		txtEstratoInmueble.sendKeys(estrato);
		txtAreaPrivadaInmueble.sendKeys(areaprivada);
		txtAreaContruidaInmueble.sendKeys(areaconstruida);
		txtNumeroPisosInmueble.sendKeys(numeropisos);
		// cmbTiempoCOntruido.click();
		cmbTiempoCOntruido.selectByVisibleText(tiempoconstruido);
		switch (habitaciones) {
		case "1":
			btnNumeroHabitacionesInmueble1.click();
			break;
		case "2":
			btnNumeroHabitacionesInmueble2.click();
			break;
		case "3":
			btnNumeroHabitacionesInmueble3.click();
			break;
		case "4":
			btnNumeroHabitacionesInmueble4.click();
			break;
		case "5":
			btnNumeroHabitacionesInmueble5.click();
			break;

		default:
			break;
		}
		switch (banos) {
		case "1":
			btnNumeroBanosInmueble1.click();
			break;
		case "2":
			btnNumeroBanosInmueble2.click();
			break;
		case "3":
			btnNumeroBanosInmueble3.click();
			break;
		case "4":
			btnNumeroBanosInmueble4.click();
			break;
		case "5":
			btnNumeroBanosInmueble5.click();
			break;

		default:
			break;
		}
		switch (parqueaderos) {
		case "1":
			btnNumeroParqueaderosInmueble0.click();
			break;
		case "2":
			btnNumeroParqueaderosInmueble1.click();
			break;
		case "3":
			btnNumeroParqueaderosInmueble2.click();
			break;
		case "4":
			btnNumeroParqueaderosInmueble3.click();
			break;
		case "5":
			btnNumeroParqueaderosInmueble4.click();
			break;

		default:
			break;
		}
		switch (tipoparqueadero) {
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
		cmbCaracteristicaParqueadero.selectByValue(caracteristicaparqueadero);
		btnAgregarFoto.click();
		//String ruta = "C:\\Users\\camduc\\Pictures";
		//Robot robot = new Robot();
		txtVideoInmueble.sendKeys(videoinmueble);
		txtComentariosInmueble.sendKeys(comentariosadicionales);
		txtAvisoImpreso.sendKeys(avisoimpreso);
		btnContinuarPublicacion.click();
		
		
	}
}
