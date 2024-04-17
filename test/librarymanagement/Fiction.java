package com.test.librarymanagement;

public class Fiction implements Genre {
    private String genre;

    public Fiction() {
        this.genre = "Fiction";
    }

    @Override
    public String getGenre() {
        return genre;
    }
}
