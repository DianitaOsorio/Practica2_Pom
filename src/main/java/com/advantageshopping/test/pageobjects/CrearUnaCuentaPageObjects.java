package com.advantageshopping.test.pageobjects;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

    @DefaultUrl("https://www.advantageonlineshopping.com/#/")

    public class CrearUnaCuentaPageObjects extends PageObject{

        By USER = By.id("menuUser");
        By username = By.xpath("//input[@name='usernameRegisterPage']");
        By email = By.xpath("//input[@name='emailRegisterPage']");
        By pass = By.xpath("//input[@name='passwordRegisterPage']");
        By confirmPass = By.xpath("//input[@name='confirm_passwordRegisterPage']");
        By firstName = By.xpath("//input[@name='first_nameRegisterPage']");
        By lastName = By.xpath("//input[@name='last_nameRegisterPage']");
        By phone = By.xpath("//input[@name='phone_numberRegisterPage']");
        By CREATE_NEW_ACCOUNT = By.linkText("CREATE NEW ACCOUNT");
        By listCountry = By.name("countryListboxRegisterPage");
        By city = By.name("cityRegisterPage");
        By address = By.name("addressRegisterPage");
        By state = By.name("state_/_province_/_regionRegisterPage");
        By postalCode = By.name("postal_codeRegisterPage");
        By chkAgree = By.xpath("//input[@name='i_agree']");
        By REGISTER = By.id("register_btnundefined");



        public By getUSER() {
            return USER;
        }

        public By getUsername() {
           return username;
        }

        public By getEmail() {
            return email;
        }

        public By getPass() {
            return pass;
        }

        public By getConfirmPass() {
            return confirmPass;
        }

        public By getFirstName() {
            return firstName;
        }

        public By getLastName() {
            return lastName;
        }

        public By getPhone() {
            return phone;
        }

        public By getCREATE_NEW_ACCOUNT() {
            return CREATE_NEW_ACCOUNT;
        }

        public By getListCountry() {
            return listCountry;
        }

        public By getCity() {
            return city;
        }

        public By getAddress() {
            return address;
        }

        public By getState() {
            return state;
        }

        public By getPostalCode() {
            return postalCode;
        }

        public By getChkAgree() {
            return chkAgree;
        }

        public By getREGISTER() {
            return REGISTER;
        }
    }


