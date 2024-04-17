package com.test.librarymanagement;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private int memberId;
    private String name;
    private List<Book> borrowedBooks;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (book.getAvailableCopies() > 0) {
            borrowedBooks.add(book);
            book.borrowBook();
            System.out.println("Book '" + book.getTitle() + "' added to " + name + "'s borrowed books.");
        } else {
            System.out.println("Book '" + book.getTitle() + "' is currently not available for borrowing.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook();
            System.out.println("Book '" + book.getTitle() + "' returned by " + name + ".");
        } else {
            System.out.println("Book '" + book.getTitle() + "' is not borrowed by " + name + ".");
        }
    }

    @Override
    public String toString() {
        return "Member [memberId=" + memberId + ", name='" + name + "']";
    }
}
