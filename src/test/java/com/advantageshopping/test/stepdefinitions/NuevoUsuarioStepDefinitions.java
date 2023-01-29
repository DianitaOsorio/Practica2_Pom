package com.advantageshopping.test.stepdefinitions;

import com.advantageshopping.test.steps.CrearUnaCuentaSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class NuevoUsuarioStepDefinitions {
    @Steps
    CrearUnaCuentaSteps steps;


    @Dado("^que usuario este en la pagina de Advantage shopping$")
    public void queUsuarioEsteEnLaPaginaDeAdvantageShopping() {
        steps.abrirNavegador();
    }


    @Cuando("^llene los campos solicitados para el registro$")
    public void lleneLosCamposSolicitadosParaElRegistro() {
        steps.llenoLosCamposSolicitadosYMeRegistro();
        steps.darClickUsuario();
        steps.crearCuenta();
        steps.ingresarUsuario();
        steps.ingresarCorreo();
        steps.ingresarClave();
        steps.confirmarClave();
        steps.ingresarNombre();
        steps.ingresarApellido();
        steps.ingresarTelefono();
        steps.ingresarPais();
        steps.ingresarCiudad();
        steps.ingresarDireccion();
        steps.ingresarEstado();
        steps.ingresarCodigoPostal();
        steps.darClickCheckbox();
        steps.darClickRegistro();

    }

    @Entonces("^valido que me registre correctamente$")
    public void validoQueMeRegistreCorrectamente() {
        steps.validoQueMeRegistreCorrectamente();
    }


}