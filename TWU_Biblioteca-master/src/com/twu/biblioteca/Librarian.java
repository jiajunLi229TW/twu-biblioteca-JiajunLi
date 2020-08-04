package com.twu.biblioteca;

public class Librarian {

    public static void checkOut(book bookToCheckOut) {
        BibliotecaApp.inventory.removeIf(book -> book.equals(bookToCheckOut));
    }
}
