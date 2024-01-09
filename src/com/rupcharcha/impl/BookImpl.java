package com.rupcharcha.impl;

public class BookImpl {
    private String title;
    private String ISBN;
    private String author;
    private String publisher;
    private int releaseYear;
    private int editYear;

    public BookImpl(String title, String ISBN, String author, String publisher, int releaseYear, int editYear) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.publisher = publisher;
        this.releaseYear = releaseYear;
        this.editYear = editYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getEditYear() {
        return editYear;
    }

    public void setEditYear(int editYear) {
        this.editYear = editYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", releaseYear=" + releaseYear +
                ", editYear=" + editYear +
                '}';
    }
}
