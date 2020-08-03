package com.twu.biblioteca;


import org.junit.Test;

import java.io.ByteArrayInputStream;

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
        assertThat(customer.findListOfbooks(), is("book of the library is book1, book2, book3"));
    }

    @Test
    public void showBookAuthor() {
        assertThat(customer.findListOfbookAuthor(), is("A, B, C"));
    }

    @Test
    public void showBookPublishedYear() {
        assertThat(customer.findListOfbookPublishedYear(), is("2021, 2022, 2023"));
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
    public void switchLoopTest() {
        ByteArrayInputStream in = new ByteArrayInputStream("4".getBytes());
        System.setIn(in);
        System.out.println(customer.findMainMenuOfOptions());
    }
}

