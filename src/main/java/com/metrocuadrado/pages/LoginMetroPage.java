package com.metrocuadrado.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class LoginMetroPage extends PageObject {
	@FindBy(xpath="//*[@id=\"j_username\"]")
	WebElement txtUsuario;
	@FindBy(xpath ="//*[@id=\"j_password\"]")
	WebElement txtContrasena;
	@FindBy(xpath="//*[@id=\"submit\"]")
	WebElement btnIngresar;
	
	public void loginMetro (String usuario, String contrasena) {
		txtUsuario.sendKeys(usuario);
		txtContrasena.sendKeys(contrasena);
		btnIngresar.click();
	}
}
