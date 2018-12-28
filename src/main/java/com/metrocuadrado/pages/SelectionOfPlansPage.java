package com.metrocuadrado.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class SelectionOfPlansPage extends PageObject{
	
	@FindBy(xpath="//*[@id=\"publish-splash\"]/div[2]/div[2]/div[1]/div/a")
	WebElement btnPlanPremiun;
	
	public void seleccionPlan () {
		btnPlanPremiun.click();
	}

}
