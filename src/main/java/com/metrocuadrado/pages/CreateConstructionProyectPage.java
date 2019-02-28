package com.metrocuadrado.pages;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.metrocuadrado.utils.Helpers;

import dates.Datos;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreateConstructionProyectPage extends PageObject {

	Helpers helpers = new Helpers();
	WebDriver driver = null;
	Datos excel = null;
	SimpleDateFormat sdfFecha = new SimpleDateFormat("dd-MM-yyyy");
	SimpleDateFormat sdfHora = new SimpleDateFormat("hh:mm aa");

	@FindBy(xpath = "//*[@id=\"horizontalFormEmail\"]")
	WebElement txtNombreProyectoConstructora;
	@FindBy(name = "propertyTypeId")
	WebElement btnTipoInmueble;
	@FindBy(xpath = "//*[@id=\"loadLogo\"]")
	WebElement btnCargarLogo;
	@FindBy(xpath = "//*[@id=\"propertyListField\"]")
	WebElementFacade cmbTipoInmueble;
	String rdbEnConstruccion = "buildingPhaseId1";
	String rdbEstudio = "buildingPhaseId2";
	String rdbParaEntrega = "buildingPhaseId3";
	@FindBy(name = "description")
	WebElement txtDescripcionProyecto;
	@FindBy(xpath = "//*[@id=\"featuresproject\"]/div[1]/div/div[1]/button[1]")
	WebElement btnSobrePlano;
	@FindBy(xpath = "//*[@id=\"featuresproject\"]/div[1]/div/div[1]/button[2]")
	WebElement btnEnConstruccion;
	@FindBy(xpath = "//*[@id=\"featuresproject\"]/div[1]/div/div[1]/button[3]")
	WebElement btnParaEstrenar;
	@FindBy(xpath = "//*[@id=\"featuresproject\"]/div[1]/div/div[1]/button[4]")
	WebElement btnRemodelado;
	@FindBy(xpath = "//*[@id=\"featuresproject\"]/div[1]/div/div[1]/button[5]")
	WebElement btnEntre0y5Anos;
	@FindBy(xpath = "//*[@id=\"featuresproject\"]/div[1]/div/div[1]/button[6]")
	WebElement btnEntre5y10Anos;
	@FindBy(xpath = "//*[@id=\"featuresproject\"]/div[1]/div/div[1]/button[7]")
	WebElement btnEntre10y20Anos;
	@FindBy(xpath = "//*[@id=\"featuresproject\"]/div[1]/div/div[1]/button[8]")
	WebElement btnMasDe20Anos;
	@FindBy(xpath = "//*[@id=\"featuresproject\"]/div[2]/div/div[1]/button[1]")
	WebElement btnParqueaderoVisitantesSi;
	@FindBy(xpath = "//*[@id=\"featuresproject\"]/div[2]/div/div[1]/button[2]")
	WebElement btnParqueaderoVisitantesNo;
	@FindBy(xpath = "//*[@id=\"featuresproject\"]/div[3]/div/div[1]/button[1]")
	WebElement btnSobreViaPrincipalSi;
	@FindBy(xpath = "//*[@id=\"featuresproject\"]/div[3]/div/div[1]/button[2]")
	WebElement btnSobreViaPrincipalNo;
	@FindBy(xpath = "//*[@id=\"featuresproject\"]/div[4]/div/div[1]/button[1]")
	WebElement btnSobreViaSecundariaSi;
	@FindBy(xpath = "//*[@id=\"featuresproject\"]/div[4]/div/div[1]/button[2]")
	WebElement btnSobreViaSecundariaNo;
	@FindBy(xpath = "//*[@id=\"featuresproject\"]/div[5]/div/div[1]/button[1]")
	WebElement btnMonedaPeso;
	@FindBy(xpath = "//*[@id=\"featuresproject\"]/div[5]/div/div[1]/button[2]")
	WebElement btnMonedaDolar;
	@FindBy(name = "listFeatureByProjectDTO[5].valueString")
	WebElement txtFechaEstimadaEntrega;
	@FindBy(xpath = "//*[@id=\"saveAll\"]")
	WebElement btnContinuarPublicacionConstructora;
	@FindBy(xpath = "//*[@id=\"projectLocationForm\"]/div[1]/div[1]")
	WebElement txtCiudadProyecto;
	@FindBy(xpath = "//*[@id=\"Address\"]")
	WebElement txtDireccionProyecto;
	@FindBy(xpath = "//*[@id=\"geolocationDTO.cadastralNeighborhood\"]")
	WebElement txtBarrioCatastral;
	@FindBy(xpath = "//*[@id=\"common0commonNeighborhoodName\"]")
	WebElement txtNombreBarrioProyecto;
	@FindBy(xpath = "//*[@id=\"txtEstrato\"]")
	WebElement txtEstratoProyecto;
	@FindBy(xpath = "//*[@id=\"loadMapaConstructor\"]")
	WebElement btnMapaConstructor;
	@FindBy(xpath = "//select[contains(@class, 'form-control arrowright selectChange')]")
	WebElement btnVigilancia;
	String cmbVigilancia = "//*[@id=\"amenitiesFeaturesForm\"]/div[2]/div/select";
	@FindBy(xpath = "//*[@id=\"projectMultimediaContainer\"]/div/div[1]/div[1]/div/div/div[2]/button")
	WebElement btnCargarFotosProyecto;
	@FindBy(xpath = "//li/div/div[2]")
	WebElement lblConfirmarCargarFoto;
	@FindBy(xpath = "//*[@id=\"projectMultimediaContainer\"]/div/div[2]/div/div/div[1]/input")
	WebElement txtNombreVideoProyecto;
	@FindBy(name = "contactEmail")
	WebElement txtEmailContactoSala;
	@FindBy(name = "listProjectSaleRoomDTO[0].title")
	WebElement txtTituloSala;
	@FindBy(xpath = "//div/div[2]/div/input")
	WebElement rdbMismaUbicacionSala;
	String txtCiudadSala = "//input[@id='listProjectSaleRoomDTO[0].geolocationDTO.cityId']";
	String txtBarrioCatastralSala = "listProjectSaleRoomDTO[0].geolocationDTO.cadastralNeighborhood";
	@FindBy(name = "listProjectSaleRoomDTO[0].geolocationDTO.address")
	WebElement txtDireccionSala;
	@FindBy(name = "listProjectSaleRoomDTO[0].geolocationDTO.commonNeighborhoodName")
	WebElement txtNombreComunBarrioSala;
	@FindBy(name = "listProjectSaleRoomDTO[0].geolocationDTO.stratum")
	WebElement txtEstratoSala;
	@FindBy(name = "listProjectSaleRoomDTO[0].mobilePhones[0].number")
	WebElement txtNumeroCelularSala;
	@FindBy(xpath = "//*[@id=\"sampleCheckboxV\"]")
	WebElement chkViaWhatsappSala;
	@FindBy(name = "listProjectSaleRoomDTO[0].landlines[0].number")
	WebElement txtTelefonoFijoSala;
	@FindBy(name = "listProjectSaleRoomDTO[0].landlines[0].extension")
	WebElement txtExtensionTelefonoFijoSala;
	@FindBy(xpath = "//*[@id=\"sampleCheckboxV\"]")
	WebElement chkHorarioAtencionLunesViernes;
	@FindBy(name = "listProjectSaleRoomDTO[0].schedules[0].fromHourId")
	WebElement btnHorarioAtencionLunesViernesHoraDesde;
	// @FindBy(name = "")
	// WebElementFacade cmbHorarioAtencionLunesViernesHoraDesde;
	@FindBy(name = "listProjectSaleRoomDTO[0].schedules[0].toHourId")
	WebElement btnHorarioAtencionLunesViernesHoraHasta;
	// @FindBy(name = "")
	// WebElementFacade ;
	String cmbHorarioAtencionLunesViernesHoraDesde = "listProjectSaleRoomDTO[0].schedules[0].fromHourId";
	String cmbHorarioAtencionLunesViernesHoraHasta = "listProjectSaleRoomDTO[0].schedules[0].toHourId";
	@FindBy(xpath = "//*[@id=\"sampleCheckboxV\"]")
	WebElement chkHorarioAtencionSabados;
	@FindBy(name = "listProjectSaleRoomDTO[0].schedules[1].fromHourId")
	WebElement btnHorarioAtencionSabadosHoraDesde;
	String cmbHorarioAtencionSabadoHoraDesde = "listProjectSaleRoomDTO[0].schedules[1].fromHourId";
	@FindBy(name = "listProjectSaleRoomDTO[0].schedules[1].toHourId")
	WebElement btnHorarioAtencionSabadosHoraHasta;
	String cmbHorarioAtencionSabadoHoraHasta = "listProjectSaleRoomDTO[0].schedules[1].toHourId";
	@FindBy(xpath = "//*[@id=\"sampleCheckboxV\"]")
	WebElement chkHorarioAtencionDomingos;
	@FindBy(name = "listProjectSaleRoomDTO[0].schedules[2].fromHourId")
	WebElement btnHorarioAtencionDomingosHoraDesde;
	String cmbHorarioAtencionDomingoHoraDesde = "listProjectSaleRoomDTO[0].schedules[2].fromHourId";
	@FindBy(name = "listProjectSaleRoomDTO[0].schedules[2].toHourId")
	WebElement btnHorarioAtencionDomingosHoraHasta;
	String cmbHorarioAtencionDomingoHoraHasta = "listProjectSaleRoomDTO[0].schedules[2].toHourId";
	@FindBy(name = "projectPropertyDTO.propertyName")
	WebElement txtTituloInmuebleTipo;
	@FindBy(name = "projectPropertyDTO.value")
	WebElement txtValorTituloInmueble;
	@FindBy(name = "projectPropertyDTO.approximateArea")
	WebElement txtAreaPrivadaInmueble;
	@FindBy(name = "projectPropertyDTO.builtArea")
	WebElement txtAreaConstruidaInmueble;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[5]/div/div[1]/button[1]")
	WebElement btnConMueblesSI;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[5]/div/div[1]/button[2]")
	WebElement btnConMueblesNo;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[6]/div/div[1]/button[1]")
	WebElement btnHabitaciones1;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[6]/div/div[1]/button[2]")
	WebElement btnHabitaciones2;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[6]/div/div[1]/button[3]")
	WebElement btnHabitaciones3;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[6]/div/div[1]/button[4]")
	WebElement btnHabitaciones4;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[6]/div/div[1]/button[5]")
	WebElement btnHabitaciones5;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[7]/div/div[1]/button[1]")
	WebElement btnBanos1;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[7]/div/div[1]/button[2]")
	WebElement btnBanos2;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[7]/div/div[1]/button[3]")
	WebElement btnBanos3;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[7]/div/div[1]/button[4]")
	WebElement btnBanos4;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[7]/div/div[1]/button[5]")
	WebElement btnBanos5;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[8]/div/div[1]/button[1]")
	WebElement btnParqueadero0;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[8]/div/div[1]/button[2]")
	WebElement btnParqueadero1;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[8]/div/div[1]/button[3]")
	WebElement btnParqueadero2;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[8]/div/div[1]/button[4]")
	WebElement btnParqueadero3;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[8]/div/div[1]/button[5]")
	WebElement btnParqueadero4;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[9]/div/div[1]/button[1]")
	WebElement btnParqueaderoPropioSi;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[9]/div/div[1]/button[2]")
	WebElement btnParqueaderoPropioNo;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[10]/div/div[1]/button[1]")
	WebElement btnParqueaderoCubiertoSi;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[10]/div/div[1]/button[2]")
	WebElement btnParqueaderoCubiertoNo;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[11]/div/div[1]/button[1]")
	WebElement btnGarajeConServidumbreSi;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[11]/div/div[1]/button[2]")
	WebElement btnGarajeConServidumbreNo;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[12]/div/div[1]/button[1]")
	WebElement btnTipoComedorSalaComedor;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[12]/div/div[1]/button[2]")
	WebElement btnTipoComedorComedorIndependiente;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[13]")
	WebElement btnTipoCocina;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[13]/select")
	WebElementFacade cmbTipoCocina;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[14]/div/div[1]/button[1]")
	WebElement btnTipoGasNatural;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[14]/div/div[1]/button[2]")
	WebElement btnTipoGasPropano;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[14]/div/div[1]/button[3]")
	WebElement btnTipoGasNinguna;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[15]/div/div[1]/button[1]")
	WebElement btnTipoEstufaElectrica;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[15]/div/div[1]/button[2]")
	WebElement btnTipoEstufaGas;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[15]/div/div[1]/button[3]")
	WebElement btnTipoEstufaMixta;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[16]/div/div[1]/button[1]")
	WebElement btnTipoCalentadorGas;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[16]/div/div[1]/button[2]")
	WebElement btnTipoCalentadorElectrico;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[16]/div/div[1]/button[3]")
	WebElement btnTipoCalentadorCaldera;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[16]/div/div[1]/button[4]")
	WebElement btnTipoCalentadorNoTiene;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[17]")
	WebElement btnTerrazaBalcon;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[17]/select")
	WebElementFacade cmbTerrazaBalcon;
	@FindBy(name = "listOtherFeaturesProjectDTO[13].stringValue")
	WebElement txtAreaTerrazaBalcon;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[28]/div/div[1]/button[1]")
	WebElement btnDeposito0;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[28]/div/div[1]/button[2]")
	WebElement btnDeposito1;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[28]/div/div[1]/button[3]")
	WebElement btnDeposito2;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[28]/div/div[1]/button[4]")
	WebElement btnDeposito3;
	@FindBy(xpath = "//*[@id=\"formpropertytype0\"]/div[29]/button")
	WebElement btnAgregarFotosInmuebleTipo;
	@FindBy(xpath = "//*[@id=\"collapsetipo0\"]/div/div/div/div[2]/div/div/div[1]/input")
	WebElement txtLinkVideoInmueble;
	@FindBy(xpath = "//*[@id=\"responsibleSignatureForm\"]/div[1]/div[2]/span/button")
	WebElement btnFirmaResponsable;
	@FindBy(xpath = "//*[@id=\"projectNoteForm\"]/div/div/textarea")
	WebElement txtInformacionImportante;
	@FindBy(xpath = "//*[@id=\"collapsetipo0\"]/div/div/div/div[1]/div[1]/div/div/div[2]/button")
	WebElement btnCargarHasta20Fotos;
	@FindBy(xpath = "//*[@id=\"saveAll\"]")
	WebElement btnGuardarPublicacionConstructora;
	@FindBy(xpath = "//*[@id=\"mensajeConfirmacionExitosa\"]/div/div/div[3]/div/div/button")
	WebElement btnAceptarProyectoGuardado;
	@FindBy(xpath = "//*[@id=\"publish\"]")
	WebElement BtnPublicarProyectoGuardado;
	@FindBy(xpath = "//*[@id=\"mostrarEstaSeguro\"]/div/div/div[3]/div/button[2]")
	WebElement btnEstaSeguroPublicar;

	public void createConstructionProyect(String nombreproyecto, String tipoinmueble, String etapaconstruccion,
			String descripcionproyecto, String tiempoconstruido, String parqueaderovisitantes, String sobreviaprincipal,
			String sobreviasecundaria, String moneda, String fechaestimadaentrega, String ciudadproyecto,
			String direccionproyecto, String nombrebarrioproyecto, String estratoproyecto, String vigilancia,
			String videoproyecto) {
		excel = new Datos(
				"C:\\Users\\camduc\\eclipse-workspace\\Metrocuadrado\\Datos.xlsx");
		ArrayList<String[]> Constructora = excel.readData("constructora");
		for (int i = 0; i < Constructora.size(); i++) {
			String[] fila = Constructora.get(i);
			txtNombreProyectoConstructora.sendKeys(fila[0]);
			btnTipoInmueble.click();
			cmbTipoInmueble.selectByVisibleText(fila[1]);
			btnCargarLogo.click();
			helpers.esperaSelenium(3);
			helpers.carguesAutoIT("C:\\Users\\camduc\\eclipse-workspace\\Metrocuadrado\\CargueLogo.exe");
			helpers.esperaSelenium(3);
			switch (fila[2]) {
			case "En construccion":
				find(By.id(rdbEnConstruccion)).click();
			case "Estudio":
				find(By.id(rdbEstudio)).click();
				break;
			case "Para Entrega":
				find(By.id(rdbParaEntrega)).click();
				break;
			default:
				break;
			}
			txtDescripcionProyecto.sendKeys(fila[3]);
			switch (fila[4]) {
			case "Sobre Plano":
				break;
			case "En Construccion":
				btnEnConstruccion.click();
				break;
			case "Para Estrenar":
				btnParaEstrenar.click();
				break;
			case "Remodelado":
				btnRemodelado.click();
				break;
			case "Entre 0 y 5 anos":
				btnEntre0y5Anos.click();
				break;
			case "Entre 5 y 10 anos":
				btnEntre10y20Anos.click();
				break;
			case "Entre 10 y 20 anos":
				btnEntre10y20Anos.click();
				break;
			case "Mas de 20 anos":
				btnMasDe20Anos.click();
				break;
			default:
				break;
			}
			switch (fila[5]) {
			case "Si":
				btnParqueaderoVisitantesSi.click();
				break;
			case "No":
				btnParqueaderoVisitantesNo.click();
				break;
			default:
				break;
			}
			switch (fila[6]) {
			case "Si":
				btnSobreViaPrincipalSi.click();
				break;
			case "No":
				btnSobreViaPrincipalNo.click();
				break;
			default:
				break;
			}
			switch (fila[7]) {
			case "Si":
				btnSobreViaSecundariaSi.click();
				break;
			case "No":
				btnSobreViaSecundariaNo.click();
				break;
			default:
				break;
			}
			switch (fila[8]) {
			case "Peso colombiano":
				btnMonedaPeso.click();
				break;
			case "Dolar US":
				btnMonedaDolar.click();
				break;
			default:
				break;
			}
			txtFechaEstimadaEntrega.sendKeys(sdfFecha.format(new Date(Long.parseLong(fila[9]))));
			btnContinuarPublicacionConstructora.click();
			helpers.esperaSelenium(3);
			Actions actions = new Actions(this.getDriver());
			actions.moveToElement(txtCiudadProyecto);
			actions.click();
			actions.sendKeys(fila[10]);
			actions.build().perform();
			txtDireccionProyecto.sendKeys(fila[11]);
			helpers.esperaSelenium(1);
			actions.moveToElement(txtBarrioCatastral);
			actions.click();
			actions.build().perform();
			helpers.esperaSelenium(5);
			txtNombreBarrioProyecto.sendKeys(fila[12]);
			txtEstratoProyecto.sendKeys(fila[13]);
			btnMapaConstructor.click();
			helpers.carguesAutoIT("C:\\Users\\camduc\\eclipse-workspace\\Metrocuadrado\\CargueLogo.exe");
			helpers.esperaSelenium(3);
			btnVigilancia.click();
			find(By.xpath(cmbVigilancia)).selectByValue(fila[14]);
			helpers.esperaSelenium(3);
			btnCargarFotosProyecto.click();
			helpers.carguesAutoIT("C:\\Users\\camduc\\eclipse-workspace\\Metrocuadrado\\cargue3archivos.exe");
			helpers.esperaSelenium(3);
			waitFor(ExpectedConditions.invisibilityOfElementLocated(By.className("cargador-barra")));
			txtNombreVideoProyecto.sendKeys(fila[15]);
			txtEmailContactoSala.sendKeys(fila[16]);
			txtTituloSala.sendKeys(fila[17]);
			// if (fila[18].equals("Si")) {
			// rdbMismaUbicacionSala.click();
			// }
			// txtCiudadSala.sendKeys(fila[19]);
			Actions actions2 = new Actions(this.getDriver());
			actions2.moveToElement(find(By.xpath(txtCiudadSala)));
			actions2.click();
			actions2.sendKeys(fila[19]);
			actions2.build().perform();
			txtDireccionSala.sendKeys(fila[20]);
			helpers.esperaSelenium(2);
			actions2.moveToElement(find(By.name(txtBarrioCatastralSala)));
			actions2.click();
			actions2.build().perform();
			helpers.esperaSelenium(5);
			txtNombreComunBarrioSala.sendKeys(fila[21]);
			txtEstratoSala.sendKeys(fila[22]);
			txtNumeroCelularSala.sendKeys(fila[23]);
			// if (fila[24].equals("Si")) {
			// chkViaWhatsappSala.click();
			// }
			txtTelefonoFijoSala.sendKeys(fila[25]);
			txtExtensionTelefonoFijoSala.sendKeys(fila[26]);
			btnHorarioAtencionLunesViernesHoraDesde.click();
			String horaSelDesde = sdfHora.format(new Date(Long.parseLong(fila[28])));
			find(By.name(cmbHorarioAtencionLunesViernesHoraDesde)).selectByVisibleText(horaSelDesde.toLowerCase());
			btnHorarioAtencionLunesViernesHoraHasta.click();
			String horaSelHasta = sdfHora.format(new Date(Long.parseLong(fila[29])));
			find(By.name(cmbHorarioAtencionLunesViernesHoraHasta)).selectByVisibleText(horaSelHasta.toLowerCase());
			btnHorarioAtencionSabadosHoraDesde.click();
			String horaSelDesde1 = sdfHora.format(new Date(Long.parseLong(fila[31])));
			find(By.name(cmbHorarioAtencionSabadoHoraDesde)).selectByVisibleText(horaSelDesde1.toLowerCase());
			btnHorarioAtencionSabadosHoraHasta.click();
			String horaSelHasta1 = sdfHora.format(new Date(Long.parseLong(fila[32])));
			find(By.name(cmbHorarioAtencionSabadoHoraHasta)).selectByVisibleText(horaSelHasta1.toLowerCase());
			btnHorarioAtencionDomingosHoraDesde.click();
			String horaSelDesde2 = sdfHora.format(new Date(Long.parseLong(fila[34])));
			find(By.name(cmbHorarioAtencionDomingoHoraDesde)).selectByVisibleText(horaSelDesde2.toLowerCase());
			btnHorarioAtencionDomingosHoraHasta.click();
			String horaSelHasta2 = sdfHora.format(new Date(Long.parseLong(fila[35])));
			find(By.name(cmbHorarioAtencionDomingoHoraHasta)).selectByVisibleText(horaSelHasta2.toLowerCase());
			txtTituloInmuebleTipo.sendKeys(fila[36]);
			txtValorTituloInmueble.sendKeys(fila[37]);
			txtAreaPrivadaInmueble.sendKeys(fila[38]);
			txtAreaConstruidaInmueble.sendKeys(fila[39]);
			switch (fila[40]) {
			case "Si":
				btnConMueblesSI.click();
				break;
			case "No":
				btnConMueblesNo.click();
				break;
			default:
				break;
			}
			switch (fila[41]) {
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
			switch (fila[42]) {
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
			switch (fila[43]) {
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
			switch (fila[44]) {
			case "Si":
				btnParqueaderoPropioSi.click();
				break;
			case "No":
				btnParqueaderoPropioNo.click();
				break;
			default:
				break;
			}
			switch (fila[45]) {
			case "Si":
				btnParqueaderoCubiertoSi.click();
				break;
			case "No":
				btnParqueaderoCubiertoNo.click();
				break;
			default:
				break;
			}
			switch (fila[46]) {
			case "Si":
				btnGarajeConServidumbreSi.click();
				break;
			case "No":
				btnGarajeConServidumbreNo.click();
				break;
			default:
				break;
			}
			switch (fila[47]) {
			case "Sala-comedor":
				btnTipoComedorSalaComedor.click();
				break;
			case "Comedor independiente":
				btnTipoComedorComedorIndependiente.click();
				break;
			default:
				break;
			}
			btnTipoCocina.click();
			cmbTipoCocina.selectByValue(fila[48]);
			switch (fila[49]) {
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
			switch (fila[50]) {
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
			switch (fila[51]) {
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
			btnTerrazaBalcon.click();
			cmbTerrazaBalcon.selectByValue(fila[52]);
			txtAreaTerrazaBalcon.sendKeys(fila[53]);
			switch (fila[54]) {
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
			btnAgregarFotosInmuebleTipo.click();
			btnCargarHasta20Fotos.click();
			helpers.carguesAutoIT("C:\\Users\\camduc\\eclipse-workspace\\Metrocuadrado\\cargue3archivos.exe");
			helpers.esperaSelenium(3);
			waitFor(ExpectedConditions.invisibilityOfElementLocated(By.className("cargador-barra")));
			txtLinkVideoInmueble.sendKeys(fila[55]);
			btnFirmaResponsable.click();
			helpers.carguesAutoIT("C:\\Users\\camduc\\eclipse-workspace\\Metrocuadrado\\firma.exe");
			txtInformacionImportante.sendKeys(fila[56]);
			btnGuardarPublicacionConstructora.click();
			helpers.esperaSelenium(5);
			btnAceptarProyectoGuardado.click();
			helpers.esperaSelenium(2);
			BtnPublicarProyectoGuardado.click();
			btnEstaSeguroPublicar.click();
		}
	}

}
