package com.twu.biblioteca;

public class customer {
    public String enterLibrary() {
        return BibliotecaApp.showWelcomeMessage();
    }

    public String findListOfBooks() {
        return BibliotecaApp.getInventory();
    }

    public Object findListOfBookAuthor() {
        return BibliotecaApp.getListOfAuthor();
    }

    public Object findListOfBookPublishedYear() {
        return BibliotecaApp.getListOfPublishedYear();
    }

    public Object findMainMenuOfOptions() { return BibliotecaApp.getOptions(); }

    public String checkOut() { return BibliotecaApp.checkOut(); }

    public String checkIn() { return BibliotecaApp.checkIn(); }
}
