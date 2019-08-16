package com.mycompany.app;

import lombok.extern.java.Log;

/**
 * Hello world!
 */
@Log
public class App {

    private final String message = "Hello World!";

    public App() {
        Address address = new Address();
        address.setName("ok");
        System.out.println(address);
        System.out.println("the init app class");
        log.info("some information");
    }

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
