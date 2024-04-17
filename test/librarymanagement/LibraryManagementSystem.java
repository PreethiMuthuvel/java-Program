package com.test.librarymanagement;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        Author author1 = new Author("J.K. Rowling");
        Author author2 = new Author("George Orwell");

        Fiction fiction = new Fiction();
        NonFiction nonFiction = new NonFiction();

        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", author1, 5, fiction);
        Book book2 = new Book("1984", author2, 3, fiction);
        Book book3 = new Book("Sapiens", author1, 7, nonFiction);

        Member member1 = new Member(1, "John Doe");
        Member member2 = new Member(2, "Jane Smith");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.addMember(member1);
        library.addMember(member2);

        member1.borrowBook(book1);
        member1.borrowBook(book2);
        member2.borrowBook(book3);

        System.out.println("\nLibrary Status After Borrowing:");
        library.displayBooks();
        library.displayMembers();
        library.displayBorrowedBooks(member1);
        library.displayBorrowedBooks(member2);

        member1.returnBook(book1);
        member2.returnBook(book3);

        System.out.println("\nLibrary Status After Returning:");
        library.displayBooks();
        library.displayMembers();
        library.displayBorrowedBooks(member1);
        library.displayBorrowedBooks(member2);

        // Sorting books by title, author, and genre
        System.out.println("\nSorted Books by Title:");
        List<Book> bookList=new LinkedList();
        bookList=library.getBooks();
        Collections.sort(library.getBooks());
        library.displayBooks();

        System.out.println("\nSorted Books by Author:");
        Collections.sort(library.getBooks(), Book.compareByAuthor);
        library.displayBooks();

        System.out.println("\nSorted Books by Genre:");
        Collections.sort(library.getBooks(), Book.compareByGenre);
        library.displayBooks();
    }
}
