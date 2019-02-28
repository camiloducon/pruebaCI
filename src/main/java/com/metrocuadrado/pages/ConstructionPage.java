package com.metrocuadrado.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class ConstructionPage extends PageObject{
	@FindBy (xpath = "//*[@id=\"menuHeader_0\"]/a")
	WebElement lnkProyectosConstructora;
	@FindBy (xpath = "//*[@id=\"menuHeader_0\"]/ul/li[1]/a")
	WebElement lnkPublicarProyectoConstructora;
	
	public void publicarProyectoConstructora () {
		lnkProyectosConstructora.click();
		lnkPublicarProyectoConstructora.click();
	}
}
