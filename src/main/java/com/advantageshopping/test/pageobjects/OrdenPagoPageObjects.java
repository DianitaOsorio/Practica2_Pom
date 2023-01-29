package com.advantageshopping.test.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.advantageonlineshopping.com/#/")

public class OrdenPagoPageObjects extends PageObject {

    By lnkLaptops = By.xpath("//span[@id='laptopsTxt']");
    By msjPortatil9 = By.xpath("//a[text()='HP Chromebook 14 G1(ENERGY STAR)']");
    By msjPortatil10=  By.xpath("//a[text()='HP Chromebook 14 G1(ES)']");
    By msjPortatil7 = By.xpath("//a[text()='HP ENVY - 17t Touch Laptop']");
    By msjPortatil6 = By.xpath("//a[text()='HP ENVY x360 - 15t Laptop']");
    By msjPortatil1 = By.xpath("//a[text()='HP Pavilion 15t Touch Laptop']");
    By msjPortatil2 = By.xpath("//a[text()='HP Pavilion 15z Laptop']");
    By msjPortatil3 = By.xpath("//a[text()='HP Pavilion 15z Touch Laptop']");
    By msjPortatil11 = By.xpath("//a[text()='HP Pavilion x360 - 11t Touch Laptop']");
    By msjPortatil4 = By.xpath("//a[text()='HP Spectre x360 - 13-4102dx']");
    By msjPortatil5= By.xpath("//a[text()='HP Stream - 11-d020nr Laptop']");
    By msjPortatil8 =By.xpath("//a[text()='HP ZBook 17 G2 Mobile Workstation']");

    public By getLnkLaptops() {
        return lnkLaptops;}
    public By getMsjPortatil9() {
        return msjPortatil9;
    }

    public By getMsjPortatil10() {
        return msjPortatil10;
    }

    public By getMsjPortatil7() {
        return msjPortatil7;
    }

    public By getMsjPortatil6() {
        return msjPortatil6;
    }

    public By getMsjPortatil1() {
        return msjPortatil1;
    }

    public By getMsjPortatil2() {
        return msjPortatil2;
    }

    public By getMsjPortatil3() {
        return msjPortatil3;
    }

    public By getMsjPortatil11() {
        return msjPortatil11;
    }

    public By getMsjPortatil4() {
        return msjPortatil4;
    }

    public By getMsjPortatil5() {
        return msjPortatil5;
    }



    By optionlaptop = By.xpath("//a[@class='titleItemsCount ng-binding']");
    By optionAddToCar = By.xpath("//button[@translate='ADD_TO_CART']");
    By checkOutBuy = By.xpath("//button[@class='roboto-medium ng-binding']");
    By txtSafeUser = By.xpath("//input[@name='usernameInOrderPayment']");
    By txtSafepassword = By.xpath("//input[@name='passwordInOrderPayment']");
    By btnLogin = By.xpath("//button[@id='login_btnundefined']");
    By btnBuy = By.xpath("//button[@id='pay_now_btn_SAFEPAY']");
    By btnNext = By.xpath("//button[@class='a-button nextBtn marginTop75 ng-scope']");
    By lblBuySuccessful = By.xpath("//span[@translate='Thank_you_for_buying_with_Advantage']");



    public By getOptionlaptop() {
        return optionlaptop;
    }

    public By getOptionAddToCar() {
        return optionAddToCar;
    }

    public By getCheckOutBuy() {
        return checkOutBuy;
    }

    public By getTxtSafeUser() {
        return txtSafeUser;
    }

    public By getTxtSafepassword() {
        return txtSafepassword;
    }

    public By getBtnLogin() {
        return btnLogin;
    }

    public By getBtnNext() {
    return btnNext;
     }

    public By getBtnBuy() {
        return btnBuy;
    }

    public By getLblBuySuccessful() {
        return lblBuySuccessful;
    }

    public By getMsjPortatil8() {
        return msjPortatil8;


    }
}

