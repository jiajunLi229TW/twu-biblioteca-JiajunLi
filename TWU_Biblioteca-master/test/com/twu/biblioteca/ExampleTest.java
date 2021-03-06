package com.twu.biblioteca;


import org.junit.Test;

import java.io.ByteArrayInputStream;

import static com.twu.biblioteca.BibliotecaApp.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class ExampleTest {
    static customer customer = new customer();

    @Test
    public void viewWelcomeMessage() {
        assertThat(customer.enterLibrary(), is("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!"));
    }

    @Test
    public void showBooks() {
        assertThat(customer.findListOfBooks(), is("book of the library is book1, book2, book3"));
    }

    @Test
    public void showBookAuthor() {
        assertThat(customer.findListOfBookAuthor(), is("A, B, C"));
        assertThat(customer.findListOfBookAuthor(), is("A, B, C"));
    }

    @Test
    public void showBookPublishedYear() {
        assertThat(customer.findListOfBookPublishedYear(), is("2021, 2022, 2023"));
    }


    @Test
    public void showMenuOfOptions() {
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);
        assertThat(customer.findMainMenuOfOptions(), is("book of the library is book1, book2, book3"));
    }

    @Test
    public void showMenuOfOptionsForAuthor() {
        ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
        System.setIn(in);
        assertThat(customer.findMainMenuOfOptions(), is("A, B, C"));
    }

    @Test
    public void showMenuOfOptionsForPublishedYear() {
        ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
        System.setIn(in);
        assertThat(customer.findMainMenuOfOptions(), is("2021, 2022, 2023"));
    }

    @Test
    public void InvalidInputTest() {
        ByteArrayInputStream firstUserInput = new ByteArrayInputStream("7".getBytes());
        System.setIn(firstUserInput);
        assertThat(customer.findMainMenuOfOptions(), is("your input should be integer within 1 to 6"));
        ByteArrayInputStream secondUserInput = new ByteArrayInputStream("1".getBytes());
        System.setIn(secondUserInput);
        assertThat(customer.findMainMenuOfOptions(), is("book of the library is book1, book2, book3"));
    }

    @Test
    public void checkedBooksByLibrarian() {
        Librarian.checkOut(book1);
        assertThat(customer.findListOfBooks(), is("book of the library is book2, book3"));
    }

    @Test
    public void checkedBooksByCustomer() {
        ByteArrayInputStream firstUserInput = new ByteArrayInputStream("book1".getBytes());
        System.setIn(firstUserInput);
        assertThat(customer.checkOut(), is("Thank you! Enjoy the book"));

        ByteArrayInputStream secondUserInput = new ByteArrayInputStream("book4".getBytes());
        System.setIn(secondUserInput);
        assertThat(customer.checkOut(), is("Sorry, that book is not available"));
    }

    @Test
    public void returnBooksByCustomer() {
        ByteArrayInputStream firstUserInput = new ByteArrayInputStream("book1".getBytes());
        System.setIn(firstUserInput);
        assertThat(customer.checkIn(), is("Thank you for returning the book"));
        ByteArrayInputStream secondUserInput = new ByteArrayInputStream("book4".getBytes());
        System.setIn(secondUserInput);
        assertThat(customer.checkIn(), is("That is not a valid book to return"));
    }
}

