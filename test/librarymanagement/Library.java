package com.test.librarymanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private List<Book> books;
    private Map<Integer, Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    public List<Book> searchBooksByAuthor(Author author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    public void displayBooks() {
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayMembers() {
        System.out.println("Library Members:");
        for (Member member : members.values()) {
            System.out.println(member);
        }
    }

    public void displayBorrowedBooks(Member member) {
        System.out.println(member.getName() + "'s Borrowed Books:");
        for (Book book : member.getBorrowedBooks()) {
            System.out.println(book);
        }
    }

	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		
		return books;
	}
}
