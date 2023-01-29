package com.advantageshopping.test.utils;

public class Tiempos {

    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
