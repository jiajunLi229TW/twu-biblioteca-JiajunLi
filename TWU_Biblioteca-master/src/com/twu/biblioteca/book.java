package com.twu.biblioteca;

public class book {
    private final String name;
    private final String author;
    private final int publishedYear;

    public book (String name, String author, int publishedYear) {
        this.name = name;
        this.author = author;
        this. publishedYear = publishedYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getpublishedYear() {
        return publishedYear;
    }
}
