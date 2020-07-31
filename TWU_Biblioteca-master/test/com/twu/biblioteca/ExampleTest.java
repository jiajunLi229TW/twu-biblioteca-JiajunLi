package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void viewWelcomeMessage() {
        assertEquals(BibliotecaApp.showWelcomeMessage(), "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }
}
