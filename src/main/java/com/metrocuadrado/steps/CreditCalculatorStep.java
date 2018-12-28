package com.metrocuadrado.steps;

import com.metrocuadrado.pages.ContactBankPage;
import com.metrocuadrado.pages.CreditCalculatorPage;
import com.metrocuadrado.pages.HomeMetroPage;

import net.thucydides.core.annotations.Step;

public class CreditCalculatorStep {

	CreditCalculatorPage creditCalculatorPage;
	HomeMetroPage homeMetroPage;
	ContactBankPage contactBankPage;

	@Step
	public void paginaInicioMetro() {
		homeMetroPage.open();
		homeMetroPage.ingresarEnCalculadoraCredito();
	}

	@Step
	public void ingresarDatosCalculoCredito(String ingresosMensuales, String plazoEnAnos) {
		creditCalculatorPage.calcularCredito(ingresosMensuales, plazoEnAnos);

	}

	@Step
	public void contactarBancos() {
		creditCalculatorPage.calculoCredito();
	}

	@Step
	public void ingresarDatosCalculoCuotasCredito(String valorCredito, String plazoEnAnos) {
		creditCalculatorPage.calcularCuotasCredito(valorCredito, plazoEnAnos);

	}

	@Step
	public void contactarBancosCuotasCredito() {
		creditCalculatorPage.calculoCuotasCredito();
	}

	@Step
	public void enviarDatosBanco(String nombreUsuario, String cedulaUsuario, String correoElectronicoUsuario,
			String telefonoUsuario, String ciudadUsuario) {
		contactBankPage.contactarBanco(nombreUsuario, cedulaUsuario, correoElectronicoUsuario, telefonoUsuario,
				ciudadUsuario);
	}

}
