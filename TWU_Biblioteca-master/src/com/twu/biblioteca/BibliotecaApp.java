package com.twu.biblioteca;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BibliotecaApp {
    static book book1 = new book("book1", "A", 2021);
    static book book2 = new book("book2", "B", 2022);
    static book book3 = new book("book3", "C", 2023);

    static List<book> inventory = Arrays.asList(book1, book2, book3);
    //static String inventoryScript = String.join(", ", inventory);

    public static String showWelcomeMessage() {
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }

    public static String getInventory() {
        String Courtesy = "book of the library is ";

        List<String> nameList = new ArrayList<>();

        for (book book : inventory) {
            nameList.add(book.getName());
        }

        return Courtesy + String.join(", ", nameList);
    }

    public static String getListOfAuthor() {
        List<String> authorList = new ArrayList<>();

        for (book book : inventory) {
            authorList.add(book.getAuthor());
        }

        return String.join(", ", authorList);
    }

    public static String getListOfPublishedYear() {

        List<String> yearList = new ArrayList<>();

        for (book book : inventory) {
            yearList.add(Integer.toString(book.getpublishedYear()));
        }

        return String.join(", ", yearList);
    }

    public static Object getOptions() {

    }
}
