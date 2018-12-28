package com.metrocuadrado.steps;

import com.metrocuadrado.pages.ContactBankPage;
import com.metrocuadrado.pages.HomeMetroPage;
import com.metrocuadrado.pages.InsuranceCalculatorPage;

import net.thucydides.core.annotations.Step;

public class InsuranceCalculatorStep {

	HomeMetroPage homeMetroPage;
	InsuranceCalculatorPage insuranceCalculatorPage;
	ContactBankPage contactBankPage;

	@Step
	public void paginaInicioMetroCalculadoraCredito() {
		homeMetroPage.open();
		homeMetroPage.ingresarEnCalculadoraCredito();
	}

	@Step
	public void paginaInicioMetroCalculadoraSeguro() {
		homeMetroPage.open();
		homeMetroPage.ingresarEnCalculadoraSeguro();
	}

	@Step
	public void ingresarDatosCalculoSeguro(String valorBasicoMensual, String valorAdministracion) {
		insuranceCalculatorPage.calcularValorSeguro(valorBasicoMensual, valorAdministracion);
		insuranceCalculatorPage.contactarAseguradora();

	}

	@Step
	public void enviarDatosAseguradora(String nombreUsuario, String cedulaUsuario, String correoElectronicoUsuario,
			String telefonoUsuario, String ciudadUsuario) {
		contactBankPage.contactarAseguradora(nombreUsuario, cedulaUsuario, correoElectronicoUsuario, telefonoUsuario,
				ciudadUsuario);
	}
}
