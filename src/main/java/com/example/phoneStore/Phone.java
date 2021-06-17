package com.example.phoneStore;

public class Phone {

    private Configuration configuration;

    public Phone(Configuration configuration) {
        this.configuration = configuration;
    }

    public String readyForSale() {
        return "Phone ready for sale: " + configuration.makeConfiguration();
    }
}
