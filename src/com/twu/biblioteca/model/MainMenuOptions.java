package com.twu.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class MainMenuOptions {
    private static List<String> options;

    public MainMenuOptions(){
        this.options = new ArrayList<String>();
        options.add("List Book");
        options.add("Checkout Book");
        options.add("Return Book");
        options.add("Quit");
    }


    public static List<String> getOptions(){
        return options;
    }


}
