package com.advantageshopping.test.steps;

import com.advantageshopping.test.models.IniciarSesionDatos;
import com.advantageshopping.test.pageobjects.IniciarSesionPageObjects;
import com.advantageshopping.test.utils.Tiempos;
import net.thucydides.core.annotations.Step;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.assertEquals;

public class IniciarSesionSteps {
    IniciarSesionDatos datos = new IniciarSesionDatos();
    IniciarSesionPageObjects pageObjects = new IniciarSesionPageObjects();

    @Step("Se abre el navegador ")
    public void abrirNavegador() {
        pageObjects.open();
    }


    @Step("Lleno los campos")
    public void llenoLosCamposSolicitados() {
        pageObjects.getDriver().manage().timeouts().implicitlyWait(10, SECONDS);
        Tiempos.esperar(2);
    }
    public void  clickInicio(){
    pageObjects.getDriver().manage().timeouts().implicitlyWait(10, SECONDS);
    Tiempos.esperar(2);
        pageObjects.getDriver().findElement(pageObjects.getUSER()).click();

}

    public void ingresarUsuario (){
        pageObjects.getDriver().findElement(pageObjects.getUsername()).sendKeys(datos.username);

    }
    public  void ingresarClave() {
        pageObjects.getDriver().findElement(pageObjects.getPassword()).sendKeys(datos.password);


    }
        public void clickIngresar () {
            pageObjects.getDriver().manage().timeouts().implicitlyWait(10, SECONDS);
            Tiempos.esperar(1);
            pageObjects.getDriver().findElement(pageObjects.getBtnSIGN_IN()).click();
        }

        public void validoQueElInicioDeSesionEsExitoso () {
            String usernameDeLaPage = pageObjects.getDriver().findElement(pageObjects.getUsername()).getText();
            System.out.println("ESTE ES EL USERNAME DE LA PAGINA!! ->" + usernameDeLaPage);
            Tiempos.esperar(6);
        }

    }






