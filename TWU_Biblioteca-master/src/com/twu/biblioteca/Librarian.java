package com.twu.biblioteca;

import static com.twu.biblioteca.BibliotecaApp.*;

public class Librarian {

    public static void checkOut(book bookToCheckOut) {
        BibliotecaApp.inventory.removeIf(book -> book.equals(bookToCheckOut));
    }
}
