package com.metrocuadrado.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class FindPage extends PageObject {
	@FindBy(xpath = "//select")
	WebElementFacade cmbTipoInmueble;
	@FindBy(xpath = "//input[@id='list-search_word']")
	WebElement txtFiltroPalabra;
	@FindBy(xpath = "//*[@id=\"list-search-by-word\"]")
	WebElement btnFiltroPalabra;
	@FindBy(xpath = "//*[@id=\"search_filter\"]/div[2]/div[3]/div[2]/div[2]/div[1]")
	WebElement btnFiltroRangoPrecio;
	String cmbFiltroPrecio = "list-mvalorventa";
	@FindBy(name = "list-price_from")
	WebElement txtFiltroValorRangoDesde;
	@FindBy(name = "list-price_to")
	WebElement txtFiltroValorRangoHasta;
	@FindBy(xpath = "//div[3]/div[2]/div[2]/a")
	WebElement btnFiltroValorRango;
	@FindBy(xpath = "//div[@id='search_filter']/div[2]/div[3]/div[3]/div[2]/div[1]")
	WebElement btnAreaMetrosCuadrados;
	String cmbAreaMetrosCuadrados = "list-marea";
	@FindBy(xpath = "//*[@id=\"search_filter\"]/div[2]/div[3]/div[4]/div/div[1]/div/div[1]/label")
	WebElement btnNumeroHabitacionesInmueble1;
	@FindBy(xpath = "//*[@id=\"search_filter\"]/div[2]/div[3]/div[4]/div/div[1]/div/div[2]/label")
	WebElement btnNumeroHabitacionesInmueble2;
	@FindBy(xpath = "//*[@id=\"search_filter\"]/div[2]/div[3]/div[4]/div/div[1]/div/div[3]/label")
	WebElementFacade btnNumeroHabitacionesInmueble3;
	@FindBy(xpath = "//*[@id=\"search_filter\"]/div[2]/div[3]/div[4]/div/div[1]/div/div[4]/label")
	WebElement btnNumeroHabitacionesInmueble4;
	@FindBy(xpath = "//*[@id=\"search_filter\"]/div[2]/div[3]/div[4]/div/div[1]/div/div[5]/label")
	WebElement btnNumeroHabitacionesInmueble5;

	@FindBy(xpath = "//*[@id=\"search_filter\"]/div[2]/div[3]/div[4]/div/div[2]/div/div[1]/label")
	WebElement btnNumeroBanosInmueble1;
	@FindBy(xpath = "//*[@id=\"search_filter\"]/div[2]/div[3]/div[4]/div/div[2]/div/div[2]/label")
	WebElement btnNumeroBanosInmueble2;
	@FindBy(xpath = "//*[@id=\"search_filter\"]/div[2]/div[3]/div[4]/div/div[2]/div/div[3]/label")
	WebElement btnNumeroBanosInmueble3;
	@FindBy(xpath = "//*[@id=\"search_filter\"]/div[2]/div[3]/div[4]/div/div[2]/div/div[4]/label")
	WebElement btnNumeroBanosInmueble4;
	@FindBy(xpath = "//*[@id=\"search_filter\"]/div[2]/div[3]/div[4]/div/div[2]/div/div[5]/label")
	WebElement btnNumeroBanosInmueble5;
	@FindBy(xpath = "//*[@id=\"search_filter\"]/div[2]/div[3]/div[4]/div/div[3]/div/div/div[1]/label")
	WebElement btnNumeroParqueaderosInmueble1;
	@FindBy(xpath = "//*[@id=\"search_filter\"]/div[2]/div[3]/div[4]/div/div[3]/div/div/div[2]/label")
	WebElement btnNumeroParqueaderosInmueble2;
	@FindBy(xpath = "//*[@id=\"search_filter\"]/div[2]/div[3]/div[4]/div/div[3]/div/div/div[3]/label")
	WebElement btnNumeroParqueaderosInmueble3;
	@FindBy(xpath = "//*[@id=\"search_filter\"]/div[2]/div[3]/div[4]/div/div[3]/div/div/div[4]/label")
	WebElement btnNumeroParqueaderosInmueble4;
	@FindBy(xpath = "//*[@id=\"search_filter\"]/div[2]/div[3]/div[4]/div/div[3]/div/div/div[5]/label")
	WebElement btnNumeroParqueaderosInmueble5;

	@FindBy(xpath = "//div[@id='search_filter']/div[2]/div[3]/div[4]/div/div[4]/div[1]")
	WebElement btnAntiguedad;
	String cmbAntiguedad = "list-mtiempoconstruido";
	@FindBy(xpath = "//*[@id=\"search_filter\"]/div[2]/div[3]/div[5]/div[2]/div[2]/a")
	WebElement btnAplicarPreferencias;
	@FindBy(xpath = "//a/h2")
	WebElement lnkSeleccionarInmueble;
	@FindBy(name = "name")
	WebElement txtNombreContactarConstructora;

	public void filtros(String palabraclave, String preciocompra, String valorrangodesde, String valorrangohasta,
			String area, String habitaciones, String banos, String garajes, String antiguedad) {

		// filtro por palabra
		try {
			if (palabraclave != null) {
				txtFiltroPalabra.sendKeys(palabraclave);
				Thread.sleep(2000);
				btnFiltroPalabra.click();
			}
		} catch (Exception e) {
			if (palabraclave != null) {
				txtFiltroPalabra.sendKeys(palabraclave);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				btnFiltroPalabra.click();
			}
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		// Filtro Rango de precios
		try {
			if (preciocompra != null) {
				btnFiltroRangoPrecio.click();
				find(By.id(cmbFiltroPrecio)).selectByVisibleText(preciocompra);
			}
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			if (preciocompra != null) {
				btnFiltroRangoPrecio.click();
				find(By.id(cmbFiltroPrecio)).selectByVisibleText(preciocompra);
			}
		}
		// Filtro rango desde y hasta
		try {
			if (valorrangodesde != null) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				new WebDriverWait(getDriver(), 10)
						.until(ExpectedConditions.elementToBeClickable(txtFiltroValorRangoDesde));
				txtFiltroValorRangoDesde.sendKeys(valorrangodesde);
				txtFiltroValorRangoHasta.sendKeys(valorrangohasta);
				btnFiltroValorRango.click();
			}
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			if (valorrangodesde != null) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("entra en el catch de los rangos");
				new WebDriverWait(getDriver(), 20)
						.until(ExpectedConditions.visibilityOfAllElements(txtFiltroValorRangoDesde));
				txtFiltroValorRangoDesde.sendKeys(valorrangodesde);
				txtFiltroValorRangoHasta.sendKeys(valorrangohasta);
				btnFiltroValorRango.click();
			}

		}
		// Filtro combo de seleccion de area
		if (area != null) {
			try {
				Thread.sleep(2000);
				btnAreaMetrosCuadrados.click();
				find(By.id(cmbAreaMetrosCuadrados)).selectByVisibleText(area);
			} catch (Exception e) {
				btnAreaMetrosCuadrados.click();
				find(By.id(cmbAreaMetrosCuadrados)).selectByVisibleText(area);
			}

		}
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
		}

		// Seleccion cantidad de habitaciones
		try {
			switch (habitaciones) {
			case "1":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroHabitacionesInmueble1)).click();
				} catch (Exception e) {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroHabitacionesInmueble1)).click();
				}

				break;
			case "2":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroHabitacionesInmueble2)).click();
				} catch (Exception e) {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroHabitacionesInmueble2)).click();
				}

				break;
			case "3":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroHabitacionesInmueble3)).click();
				} catch (Exception e) {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroHabitacionesInmueble3)).click();
				}

				break;
			case "4":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroHabitacionesInmueble4)).click();
				} catch (Exception e) {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroHabitacionesInmueble4)).click();
				}

				break;
			case "5":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroHabitacionesInmueble5)).click();
				} catch (Exception e) {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroHabitacionesInmueble5)).click();
				}

				break;
			}
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			switch (habitaciones) {
			case "1":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroHabitacionesInmueble1)).click();
				} catch (Exception e) {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroHabitacionesInmueble1)).click();
				}

				break;
			case "2":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroHabitacionesInmueble2)).click();
				} catch (Exception e) {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroHabitacionesInmueble2)).click();
				}

				break;
			case "3":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroHabitacionesInmueble3)).click();
				} catch (Exception e) {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroHabitacionesInmueble3)).click();
				}

				break;
			case "4":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroHabitacionesInmueble4)).click();
				} catch (Exception e) {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroHabitacionesInmueble4)).click();
				}

				break;
			case "5":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroHabitacionesInmueble5)).click();
				} catch (Exception e) {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroHabitacionesInmueble5)).click();
				}

				break;
			}
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			switch (banos) {
			case "1":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroBanosInmueble1)).click();
				} catch (Exception e) {
					System.out.println("mensaje de catch en seleccion de baños");
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroBanosInmueble1)).click();
				}

				break;
			case "2":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroBanosInmueble2)).click();
				} catch (Exception e) {
					System.out.println("mensaje de catch en seleccion de baños");
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroBanosInmueble2)).click();
				}

				break;
			case "3":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroBanosInmueble3)).click();
				} catch (Exception e) {
					System.out.println("mensaje de catch en seleccion de baños");
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroBanosInmueble3)).click();
				}

				break;
			case "4":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroBanosInmueble4)).click();
				} catch (Exception e) {
					System.out.println("mensaje de catch en seleccion de baños");
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroBanosInmueble4)).click();
				}

				break;
			case "5":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroBanosInmueble5)).click();
				} catch (Exception e) {
					System.out.println("mensaje de catch en seleccion de baños");
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroBanosInmueble5)).click();
				}

				break;
			}
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			switch (banos) {
			case "1":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroBanosInmueble1)).click();
				} catch (Exception e) {
					System.out.println("mensaje de catch en seleccion de baños");
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroBanosInmueble1)).click();
				}

				break;
			case "2":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroBanosInmueble2)).click();
				} catch (Exception e) {
					System.out.println("mensaje de catch en seleccion de baños");
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroBanosInmueble2)).click();
				}

				break;
			case "3":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroBanosInmueble3)).click();
				} catch (Exception e) {
					System.out.println("mensaje de catch en seleccion de baños");
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroBanosInmueble3)).click();
				}

				break;
			case "4":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroBanosInmueble4)).click();
				} catch (Exception e) {
					System.out.println("mensaje de catch en seleccion de baños");
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroBanosInmueble4)).click();
				}

				break;
			case "5":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroBanosInmueble5)).click();
				} catch (Exception e) {
					System.out.println("mensaje de catch en seleccion de baños");
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroBanosInmueble5)).click();
				}

				break;
			}
		}

		// Scroll a la pagina
		JavascriptExecutor jse = (JavascriptExecutor) this.getDriver();
		jse.executeScript("window.scrollBy(0,250)", "");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// seleccion de cantidad de garajes
		try {
			switch (garajes) {
			case "1":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroParqueaderosInmueble1)).click();
				} catch (Exception e) {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroParqueaderosInmueble1)).click();
				}

				break;
			case "2":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroParqueaderosInmueble2)).click();
				} catch (Exception e) {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroParqueaderosInmueble2)).click();
				}

				break;
			case "3":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroParqueaderosInmueble3)).click();
				} catch (Exception e) {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroParqueaderosInmueble3)).click();
				}

				break;
			case "4":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroParqueaderosInmueble4)).click();
				} catch (Exception e) {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroParqueaderosInmueble4)).click();
				}

				break;
			case "5":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroParqueaderosInmueble5)).click();
				} catch (Exception e) {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroParqueaderosInmueble5)).click();
				}

				break;
			}
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			switch (garajes) {
			case "1":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroParqueaderosInmueble1)).click();
				} catch (Exception e) {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroParqueaderosInmueble1)).click();
				}

				break;
			case "2":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroParqueaderosInmueble2)).click();
				} catch (Exception e) {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroParqueaderosInmueble2)).click();
				}

				break;
			case "3":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroParqueaderosInmueble3)).click();
				} catch (Exception e) {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroParqueaderosInmueble3)).click();
				}

				break;
			case "4":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroParqueaderosInmueble4)).click();
				} catch (Exception e) {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroParqueaderosInmueble4)).click();
				}

				break;
			case "5":
				try {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroParqueaderosInmueble5)).click();
				} catch (Exception e) {
					new WebDriverWait(getDriver(), 10)
							.until(ExpectedConditions.elementToBeClickable(btnNumeroParqueaderosInmueble5)).click();
				}

				break;
			}

		}

		try {
			Thread.sleep(3000);
			btnAntiguedad.click();
			find(By.id(cmbAntiguedad)).selectByVisibleText(antiguedad);
		} catch (Exception e) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			btnAntiguedad.click();
			find(By.id(cmbAntiguedad)).selectByVisibleText(antiguedad);
		}

		try {
			Thread.sleep(2000);
			lnkSeleccionarInmueble.click();
		} catch (Exception e) {
			lnkSeleccionarInmueble.click();
		}
		
	}
}
