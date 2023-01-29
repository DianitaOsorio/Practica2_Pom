package com.advantageshopping.test.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.advantageonlineshopping.com/#/")

public class IniciarSesionPageObjects extends PageObject {

      By USER = By.xpath("//a[@id='menuUserLink']");
      By Username = By.name("username");
      By Password = By.name("password");
      By btnSIGN_IN =  By.id("sign_in_btnundefined");

    public By getUSER() {
        return USER;
    }

    public By getUsername() {
        return Username;
    }

    public By getPassword() {
        return Password;
    }

    public By getBtnSIGN_IN() {
        return btnSIGN_IN;
    }


}

