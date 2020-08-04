package com.twu.biblioteca;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {
    static book book1 = new book("book1", "A", 2021);
    static book book2 = new book("book2", "B", 2022);
    static book book3 = new book("book3", "C", 2023);

    //static List<book> inventory = Arrays.asList(book1, book2, book3);
    static List<book> inventory = new java.util.ArrayList<>(java.util.Arrays.asList(book1, book2, book3));
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

    public static String getOptions() {
        System.out.println("please enter following numbers for different options" +
                "\n1. Show list of books" +
                "\n2. Show list of author" +
                "\n3. show list of published year" +
                "\n4. check out a book" +
                "\n5. exit");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
//       if (Integer.parseInt(input) > 4 || Integer.parseInt(input) < 1) {
//           return "your input should be integer within 1 to 4";
//       }
        switch (input) {
            case "1":
                return getInventory();
            case "2":
                return getListOfAuthor();
            case "3":
                return getListOfPublishedYear();
            case "4":
                break;
            case "5":
                break;
            default:
                return "your input should be integer within 1 to 4";
        }

        return null;
    }
}
