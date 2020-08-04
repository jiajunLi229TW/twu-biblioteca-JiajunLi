package com.twu.biblioteca;

import java.util.Scanner;

import static com.twu.biblioteca.BibliotecaApp.*;

public class customer {
    public String enterLibrary() {
         return BibliotecaApp.showWelcomeMessage();
    }

    public String findListOfbooks() {
        return BibliotecaApp.getInventory();
    }

    public Object findListOfbookAuthor() {
        return BibliotecaApp.getListOfAuthor();
    }

    public Object findListOfbookPublishedYear() {
        return BibliotecaApp.getListOfPublishedYear();
    }

    public Object findMainMenuOfOptions() { return BibliotecaApp.getOptions();
    }

    public String checkOut() { return BibliotecaApp.checkOut();}
}
