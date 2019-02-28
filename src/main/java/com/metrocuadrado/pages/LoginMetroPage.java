package com.metrocuadrado.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dates.Datos;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class LoginMetroPage extends PageObject {

	WebDriver driver = null;
	Datos excel = null;

	@FindBy(xpath = "//*[@id=\"j_username\"]")
	WebElement txtUsuario;
	@FindBy(xpath = "//*[@id=\"j_password\"]")
	WebElement txtContrasena;
	@FindBy(xpath = "//*[@id=\"submit\"]")
	WebElement btnIngresar;

	public void loginMetroOcasional(String usuario, String contrasena) {
		excel = new Datos("C:\\Users\\camduc\\eclipse-workspace\\Metrocuadrado\\Datos.xlsx");
		ArrayList<String[]> login = excel.readData("loginocasional");
		for (int i = 0; i < login.size(); i++) {
			String[] fila = login.get(i);
			txtUsuario.sendKeys(fila[0]);
			txtContrasena.sendKeys(fila[1]);
			btnIngresar.click();
		}
	}
	public void loginMetroConstructora(String usuario, String contrasena) {
		excel = new Datos("C:\\Users\\camduc\\eclipse-workspace\\Metrocuadrado\\Datos.xlsx");
		ArrayList<String[]> login = excel.readData("loginconstructora");
		for (int i = 0; i < login.size(); i++) {
			String[] fila = login.get(i);
			txtUsuario.sendKeys(fila[0]);
			txtContrasena.sendKeys(fila[1]);
			btnIngresar.click();
		}
	}

	public void loginMetroInmobiliaria() {
		excel = new Datos("C:\\Users\\camduc\\eclipse-workspace\\Metrocuadrado\\Datos.xlsx");
		ArrayList<String[]> login = excel.readData("inmobiliaria");
		for (int i = 0; i < login.size(); i++) {
			String[] fila = login.get(i);
			txtUsuario.sendKeys(fila[0]);
			txtContrasena.sendKeys(fila[1]);
			btnIngresar.click();
		}
	}
}