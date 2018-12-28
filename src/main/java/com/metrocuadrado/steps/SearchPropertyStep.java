package com.metrocuadrado.steps;

import com.metrocuadrado.pages.HomeMetroPage;
import com.metrocuadrado.pages.SearchPage;

import net.thucydides.core.annotations.Step;

public class SearchPropertyStep {
	HomeMetroPage homeMetroPage;
	SearchPage searchPage;

	@Step
	public void filtroBusquedaHome(String tipobusqueda, String tipoinmueble, String ciudadbarrio) {
		homeMetroPage.open();
		homeMetroPage.busquedaInmueble(tipobusqueda, tipoinmueble, ciudadbarrio);
		}
	@Step 
	public void filtrosBusqueda(String palabraclave, String precio) {
		searchPage.filtroPalabra(palabraclave);
		searchPage.filtroPrecio(precio);
		
	} 
}
