package com.advantageshopping.test.stepdefinitions;

import com.advantageshopping.test.steps.CrearUnaCuentaSteps;
import com.advantageshopping.test.steps.IniciarSesionSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class AccesoStepsDefinitions {

    @Steps
    IniciarSesionSteps steps;

    @Dado("^que el usuario inicie sesion en la pagina Advantage Shopping$")
    public void queElUsuarioInicieSesionEnLaPaginaAdvantageShopping() { steps.abrirNavegador();

    }

    @Cuando("^El se autentique en la pagina$")
    public void ElSeAutentiqueEnLaPagina() {
        steps.clickInicio();
        steps.llenoLosCamposSolicitados();
        steps.ingresarUsuario();
        steps.ingresarClave();
        steps.clickIngresar();

    }

    @Entonces("^Valido que el inicio de  sesion fue exitoso$")
    public void validoQueElInicioDeSesionFueExitoso() {
        steps.validoQueElInicioDeSesionEsExitoso();

    }


}