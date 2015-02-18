package com.arturotena;

import org.apache.log4j.Logger;

public class App {

    static Logger log = Logger.getLogger(App.class);

    public static void main(String[] args) {
        System.out.println("Hello World!");
        log.error("Hola");
    }
}
