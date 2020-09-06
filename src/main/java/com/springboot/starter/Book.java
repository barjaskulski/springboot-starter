package com.springboot.starter;

import org.springframework.stereotype.Component;


public class Book {
    int id;
    String title;
    String author;
    int year;

    public int getId() {
        return id;
    }

    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}
