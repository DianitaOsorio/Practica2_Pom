package com.advantageshopping.test.steps;
import com.advantageshopping.test.models.CrearUnaCuentaDatos;
import com.advantageshopping.test.pageobjects.CrearUnaCuentaPageObjects;
import com.advantageshopping.test.utils.Tiempos;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.assertEquals;

public class CrearUnaCuentaSteps {
    CrearUnaCuentaDatos datos = new CrearUnaCuentaDatos();
    CrearUnaCuentaPageObjects pageObject = new CrearUnaCuentaPageObjects();

    @Step("Se abre el navegador")
    public void abrirNavegador(){
        pageObject.open();
    }

    @Step("Lleno los campos")
    public void llenoLosCamposSolicitadosYMeRegistro(){

        pageObject.getDriver().manage().timeouts().implicitlyWait(10, SECONDS) ;
        Tiempos.esperar(2);
    }
        public void darClickUsuario (){
            pageObject.getDriver().findElement(pageObject.getUSER()).click();
            Tiempos.esperar(2);
        }
        public void crearCuenta() {
            pageObject.getDriver().findElement(pageObject.getCREATE_NEW_ACCOUNT()).click();
            pageObject.getDriver().manage().timeouts().implicitlyWait(3, SECONDS) ;
            Tiempos.esperar(2);
        }
        public void ingresarUsuario(){
            pageObject.getDriver().findElement(pageObject.getUsername()).sendKeys(datos.getUsername());
            Tiempos.esperar(2);
        }
        public void ingresarCorreo(){
            pageObject.getDriver().findElement(pageObject.getEmail()).sendKeys(datos.getEmail());
            Tiempos.esperar(1);
        }
        public void ingresarClave (){
            pageObject.getDriver().findElement(pageObject.getPass()).sendKeys(datos.getPassword());
            Tiempos.esperar(1);
        }
         public void confirmarClave() {
             pageObject.getDriver().findElement(pageObject.getConfirmPass()).sendKeys(datos.getConfirmPassword());
             Tiempos.esperar(1);
         }
         public void ingresarNombre(){
             pageObject.getDriver().findElement(pageObject.getFirstName()).sendKeys(datos.getFirstName());
             Tiempos.esperar(1);
         }
         public  void ingresarApellido(){
             pageObject.getDriver().findElement(pageObject.getLastName()).sendKeys(datos.getLastName());
             Tiempos.esperar(1);
         }
         public void ingresarTelefono(){
             pageObject.getDriver().findElement(pageObject.getPhone()).sendKeys(datos.getPhoneNumber());
             Tiempos.esperar(1);
         }
         public void ingresarPais(){
             WebElement selectElement = pageObject.getDriver().findElement(pageObject.getListCountry());
             Select selectObject = new Select(selectElement);
             selectObject.selectByVisibleText(datos.getCountry());
             Tiempos.esperar(1);
         }
         public void ingresarCiudad(){
             pageObject.getDriver().findElement(pageObject.getCity()).sendKeys(datos.getCity());
             Tiempos.esperar(1);
         }
         public void ingresarDireccion(){
             pageObject.getDriver().findElement(pageObject.getAddress()).sendKeys(datos.getAddres());
             Tiempos.esperar(1);
         }
         public void ingresarEstado(){
             pageObject.getDriver().findElement(pageObject.getState()).sendKeys(datos.getState());
             Tiempos.esperar(1);
         }
         public void ingresarCodigoPostal(){
             pageObject.getDriver().findElement(pageObject.getPostalCode()).sendKeys(datos.getPostalCode());
             Tiempos.esperar(1);
         }
         public void darClickCheckbox(){
             pageObject.getDriver().findElement(pageObject.getChkAgree()).click();
             Tiempos.esperar(1);
         }
         public void darClickRegistro(){
          pageObject.getDriver().findElement(pageObject.getREGISTER()).click();
         }

         public void validoQueMeRegistreCorrectamente() {
             String usernameDeLaPage = pageObject.getDriver().findElement(pageObject.getUsername()).getText();
             System.out.println("ESTE ES EL USERNAME DE LA PAGINA!! ->"+usernameDeLaPage);

    }

}
