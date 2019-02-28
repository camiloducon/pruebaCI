package com.metrocuadrado.steps;

import com.metrocuadrado.pages.ContactPage;
import com.metrocuadrado.pages.HomeMetroPage;
import com.metrocuadrado.pages.LoginMetroPage;
import com.metrocuadrado.pages.FindPage;

import net.thucydides.core.annotations.Step;

public class FindPropertyStep {
	HomeMetroPage homeMetroPage;
	FindPage findPage;
	ContactPage contactPage;
	LoginMetroPage loginMetroPage;

	@Step
	public void filtroBusquedaHome(String tipobusqueda, String tipoinmueble, String ciudadbarrio) {
		homeMetroPage.open();
		homeMetroPage.busquedaInmueble(tipobusqueda, tipoinmueble, ciudadbarrio);
	}

	@Step
	public void filtrosBusqueda(String palabraclave, String preciocompra, String valorrangodesde,
			String valorrangohasta, String area, String habitaciones, String banos, String garajes, String antiguedad) {
		findPage.filtros(palabraclave, preciocompra, valorrangodesde, valorrangohasta, area, habitaciones, banos,
				garajes, antiguedad);
	}
	@Step 
	public void contactarInmobiliaria (String nombre, String telefono, String correo) {
		contactPage.contactarInmobiliaria(nombre, telefono, correo);
	}

	
}
