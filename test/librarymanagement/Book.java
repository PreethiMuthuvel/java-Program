package com.test.librarymanagement;

import java.util.Comparator;

public class Book implements Comparable<Book> {
    private String title;
    private Author author;
    private int availableCopies;
    private int totalCopies;
    private Genre genre;

    public Book(String title, Author author, int totalCopies, Genre genre) {
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public void borrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println("Book '" + title + "' borrowed successfully.");
        } else {
            System.out.println("Book '" + title + "' is currently not available for borrowing.");
        }
    }

    public void returnBook() {
        if (availableCopies < totalCopies) {
            availableCopies++;
            System.out.println("Book '" + title + "' returned successfully.");
        } else {
            System.out.println("Cannot return more copies of book '" + title + "'.");
        }
    }

    @Override
    public String toString() {
        return "Book [title='" + title + "', author=" + author.getName() +
               ", availableCopies=" + availableCopies + "/" + totalCopies + "]";
    }
   /* @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }*/

    public static Comparator<Book> compareByAuthor = Comparator.comparing(book -> book.author.getName());
    public static Comparator<Book> compareByGenre = Comparator.comparing(book -> book.genre.getGenre());

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.title.compareTo(o.title);
	}
}
