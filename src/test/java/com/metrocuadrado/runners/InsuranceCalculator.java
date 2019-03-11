package com.metrocuadrado.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/insuranceCalculator.feature",
		glue = "",
        snippets = SnippetType.CAMELCASE,
        tags = {"@insurance"}
		)
public class InsuranceCalculator {

}
