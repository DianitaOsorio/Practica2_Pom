package com.advantageshopping.test.steps;

import com.advantageshopping.test.models.OrdenPagoDatos;
import com.advantageshopping.test.pageobjects.OrdenPagoPageObjects;
import com.advantageshopping.test.utils.Scroll;
import com.advantageshopping.test.utils.Tiempos;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static java.util.concurrent.TimeUnit.SECONDS;

public class OrdenPagoSteps {
    OrdenPagoDatos datos = new OrdenPagoDatos();
    OrdenPagoPageObjects pageObjects = new OrdenPagoPageObjects();
    Scroll scroll = new Scroll();


    @Step("Se abre el navegador ")
    public void abrirNavegador() {
        pageObjects.open();
    }


    @Step("Dar click en portatiles")
    public void darClickPortatiles() {
        Tiempos.esperar(3);
        pageObjects.getDriver().findElement(pageObjects.getLnkLaptops()).click();
    }

    @Step
    public void mostrarPortatil9() {
        scroll.scrollElemento(pageObjects.getDriver(), pageObjects.getMsjPortatil9());
        String mostrarPortatil9 = pageObjects.getDriver().findElement(pageObjects.getMsjPortatil9()).getText();
        System.out.println("Portatil 9" + mostrarPortatil9);
    }

    @Step
    public void mostrarPortatil10() {
        scroll.scrollElemento(pageObjects.getDriver(), pageObjects.getMsjPortatil10());
        String mostrarportatil10 = pageObjects.getDriver().findElement(pageObjects.getMsjPortatil10()).getText();
        System.out.println("Portatil 10" + mostrarportatil10);
    }

    @Step
    public void mostrarPortatil7() {
        scroll.scrollElemento(pageObjects.getDriver(), pageObjects.getMsjPortatil7());
        String mostrarportatil7 = pageObjects.getDriver().findElement(pageObjects.getMsjPortatil7()).getText();
        System.out.println("Portatil 7" + mostrarportatil7);
    }

    @Step
    public void mostrarPortatil6() {
        scroll.scrollElemento(pageObjects.getDriver(), pageObjects.getMsjPortatil6());
        String mostrarportatil6 = pageObjects.getDriver().findElement(pageObjects.getMsjPortatil6()).getText();
        System.out.println("Portatil 6" + mostrarportatil6);
    }

    @Step
    public void mostrarPortatil1() {
        scroll.scrollElemento(pageObjects.getDriver(), pageObjects.getMsjPortatil1());
        String mostrarportatil1 = pageObjects.getDriver().findElement(pageObjects.getMsjPortatil1()).getText();
        System.out.println("Portatil 1" + mostrarportatil1);
    }

    @Step
    public void mostrarPortatil2() {
        scroll.scrollElemento(pageObjects.getDriver(), pageObjects.getMsjPortatil2());
        String mostrarportatil2 = pageObjects.getDriver().findElement(pageObjects.getMsjPortatil2()).getText();
        System.out.println("Portatil 2" + mostrarportatil2);
    }

    @Step
    public void mostrarPortatil3() {
        scroll.scrollElemento(pageObjects.getDriver(), pageObjects.getMsjPortatil3());
        String mostrarportatil3 = pageObjects.getDriver().findElement(pageObjects.getMsjPortatil3()).getText();
        System.out.println("Portatil 3" + mostrarportatil3);
    }

    @Step
    public void mostrarPortatil11() {
        scroll.scrollElemento(pageObjects.getDriver(), pageObjects.getMsjPortatil11());
        String mostrarportatil11 = pageObjects.getDriver().findElement(pageObjects.getMsjPortatil11()).getText();
        System.out.println("Portatil 11" + mostrarportatil11);
    }

    @Step
    public void mostrarPortatil4() {
        scroll.scrollElemento(pageObjects.getDriver(), pageObjects.getMsjPortatil4());
        String mostrarportatil4 = pageObjects.getDriver().findElement(pageObjects.getMsjPortatil4()).getText();
        System.out.println("Portatil 4" + mostrarportatil4);
    }

    @Step
    public void mostrarPortatil5() {
        String mostrarportatil5 = pageObjects.getDriver().findElement(pageObjects.getMsjPortatil5()).getText();
        System.out.println("Portatil 5" + mostrarportatil5);
    }

    @Step
    public void mostrarPortatil8() {
        String mostrarportatil8 = pageObjects.getDriver().findElement(pageObjects.getMsjPortatil8()).getText();
        System.out.println("Portatil 8" + mostrarportatil8);
    }

    @Step
    public void darClickOpcion() {
        scroll.scrollElemento(pageObjects.getDriver(), pageObjects.getOptionlaptop());
        Tiempos.esperar(5);
        pageObjects.getDriver().findElement(pageObjects.getMsjPortatil7()).click();

    }

    @Step
    public void darClickAnadir() {
        pageObjects.getDriver().findElement(pageObjects.getOptionAddToCar()).click();
        Tiempos.esperar(2);
    }

    @Step
    public void darClickPagar() {
        pageObjects.getDriver().findElement(pageObjects.getCheckOutBuy()).click();
        Tiempos.esperar(2);
    }



   @Step
    public void ingresarUsuario() {
        pageObjects.getDriver().findElement(pageObjects.getTxtSafeUser()).sendKeys(datos.getSafeUser());
        Tiempos.esperar(2);
    }
    @Step
    public void ingresarClave() {
        pageObjects.getDriver().findElement(pageObjects.getTxtSafepassword()).sendKeys(datos.getSafePassword());
        Tiempos.esperar(2);
    }

   @Step
    public void darClickAcceso(){
        pageObjects.getDriver().findElement(pageObjects.getBtnLogin()).click();
    }
    @Step
    public void darClickSiguiente() {
      pageObjects.getDriver().findElement(pageObjects.getBtnNext()).click();
    Tiempos.esperar(2);
    }


    @Step
    public void darClickComprar() {
        pageObjects.getDriver().findElement(pageObjects.getBtnBuy()).click();

        Tiempos.esperar(3);
    }
    @Step
    public void validoLaCompra() {
        Assert.assertThat(pageObjects.getDriver().findElement(pageObjects.getLblBuySuccessful()).isDisplayed(), Matchers.is(true));
        Tiempos.esperar(3);
    }

}






