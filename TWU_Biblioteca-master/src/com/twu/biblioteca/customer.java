package com.twu.biblioteca;

public class customer {
    public String enterLibrary() {
        return BibliotecaApp.showWelcomeMessage();
    }

    public String findListOfBooks() {
        return BibliotecaApp.getInventory();
    }

    public String findListOfBookAuthor() {
        return BibliotecaApp.getListOfAuthor();
    }

    public String findListOfBookPublishedYear() {
        return BibliotecaApp.getListOfPublishedYear();
    }

    public String findMainMenuOfOptions() { return BibliotecaApp.getOptions(); }

    public String checkOut() { return BibliotecaApp.checkOut(); }

    public String checkIn() { return BibliotecaApp.checkIn(); }
}
