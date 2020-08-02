package com.twu.biblioteca;


import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class ExampleTest {

    @Test
    public void viewWelcomeMessage() {
        customer customer = new customer();
        assertThat(customer.enterLibrary(), is("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!"));
    }

    @Test
    public void showBooks() {
        customer customer = new customer();
        assertThat(customer.findListOfbooks(), is("book of the library is book1, book2, book3"));
    }

    @Test
    public void showBookAuthor() {
        customer customer = new customer();
        System.out.println(customer.findListOfbookAuthor());
    }

    @Test
    public void showBookPublishedYear() {
        customer customer = new customer();
        System.out.println(customer.findListOfbookPublishedYear());
    }
}

