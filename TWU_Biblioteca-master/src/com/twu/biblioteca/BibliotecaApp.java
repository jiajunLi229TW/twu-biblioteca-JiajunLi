package com.twu.biblioteca;

import java.util.Arrays;
import java.util.List;

public class BibliotecaApp {
    static List<String> inventory = Arrays.asList("book1","book2","book3");
    static String inventoryScript = String.join(", ", inventory);

    public static String showWelcomeMessage() {
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }
    public static String getInventory() {
        String Courtesy = "book of the library is ";
        return Courtesy + inventoryScript;
    }
}
