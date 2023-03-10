package com.advantageshopping.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = " src/test/resources/features/Acceso.Feature",
    glue ="com.advantageshopping.test.stepdefinitions",
    snippets = SnippetType.CAMELCASE)

public class AccesoRunners {
}
