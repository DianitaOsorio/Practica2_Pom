package com.advantageshopping.test.stepdefinitions;

import com.advantageshopping.test.steps.OrdenPagoSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class ComprarPortatilStepDefinitions {

    @Steps
    OrdenPagoSteps steps;

    @Dado("^que el  usuario este en la seccion portatiles$")
    public void queElUsuarioEsteEnLaSeccionPortatiles() { steps.abrirNavegador();


    }

    @Cuando("^se muestre la lista de los portatiles$")
    public void seMuestreLaListaDeLosPortatiles() {
        steps.darClickPortatiles();
        steps.mostrarPortatil9();
        steps.mostrarPortatil10();
        steps.mostrarPortatil7();
        steps.mostrarPortatil6();
        steps.mostrarPortatil1();
        steps.mostrarPortatil2();
        steps.mostrarPortatil3();
        steps.mostrarPortatil11();
        steps.mostrarPortatil4();
        steps.mostrarPortatil5();
        steps.mostrarPortatil8();

    }

    @Entonces("^se realice la compra y sea exitosa$")
    public void seRealiceLaCompraYSeaExitosa() {
        steps.darClickOpcion();
        steps.darClickAnadir();
        steps.darClickPagar();
        steps.ingresarUsuario();
        steps.ingresarClave();
        steps.darClickAcceso();
        steps.darClickSiguiente();
        steps.darClickComprar();
        steps.validoLaCompra();
    }


}
