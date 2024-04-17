package com.test.librarymanagement;

public class NonFiction implements Genre {
    private String genre;

    public NonFiction() {
        this.genre = "Non-Fiction";
    }

    @Override
    public String getGenre() {
        return genre;
    }
}
