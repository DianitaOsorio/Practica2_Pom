package com.advantageshopping.test.models;

public class CrearUnaCuentaDatos {
    public String username, email, password, confirmPassword, firstName, lastName, phoneNumber,
    country, city, addres, postalCode, state;

    public CrearUnaCuentaDatos(){
        this.username = "DianaO";
        this.email = "dosorio@sqasa.co";
        this.password = "Lulu2023";
        this.confirmPassword = "Lulu2023";
        this.firstName = "Diana";
        this.lastName = "Osorio";
        this.phoneNumber = "9874561230";
        this.country = "Colombia";
        this.city = "Bello";
        this.addres ="calle 39 52-25";
        this.postalCode = "051050";
        this.state = "Antioquia";

    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getAddres() {
        return addres;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getState() {
        return state;
    }


}
