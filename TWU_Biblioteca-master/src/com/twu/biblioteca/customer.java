package com.twu.biblioteca;

import java.util.Scanner;

import static com.twu.biblioteca.BibliotecaApp.inventory;

public class customer {
    public String enterLibrary() {
         return BibliotecaApp.showWelcomeMessage();
    }

    public String findListOfbooks() {
        return BibliotecaApp.getInventory();
    }

    public Object findListOfbookAuthor() {
        return BibliotecaApp.getListOfAuthor();
    }

    public Object findListOfbookPublishedYear() {
        return BibliotecaApp.getListOfPublishedYear();
    }

    public Object findMainMenuOfOptions() { return BibliotecaApp.getOptions();
    }

    public String checkOut() {
        System.out.println("please enter book name to check out");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        for (book book: inventory) {
            if (input.equals(book.getName())) {
                Librarian.checkOut(book);
                return "check out successful";
            }
        }
        return "the book selected is out of stock";

    }
}
