package com.twu.biblioteca;

public class customer {
    public String enterLibrary() {
         return BibliotecaApp.showWelcomeMessage();
    }

    public String findListOfbooks() {
        return BibliotecaApp.getInventory();
    }
}
