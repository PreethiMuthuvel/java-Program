package com.preethi.test;

import java.util.HashMap;
import java.util.Map;

//Implementing Cloneable interface
class Book implements Cloneable {
  String title;
 private String author;
 private int pageCount;

 public Book(String title, String author, int pageCount) {
     this.title = title;
     this.author = author;
     this.pageCount = pageCount;
 }

 // Override clone method
 @Override
 public Book clone() {
     try {
         return (Book) super.clone();
     } catch (CloneNotSupportedException e) {
         // Should not happen since Book implements Cloneable
         return null;
     }
 }

 @Override
 public String toString() {
     return title + " by " + author + " - " + pageCount + " pages";
 }
}

//Prototype manager
class BookShop {
 private Map<String, Book> books = new HashMap<>();

 public void registerBook(String key, Book book) {
     books.put(key, book);
 }

 public void unregisterBook(String key) {
     books.remove(key);
 }

 public Book cloneBook(String key) {
     return books.get(key).clone();
 }
}

//Main class
public class Main {
 public static void main(String[] args) {
     BookShop bookShop = new BookShop();

     // Create prototype books
     Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);
     Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 281);

     // Register prototypes
     bookShop.registerBook("gatsby", book1);
     bookShop.registerBook("mockingbird", book2);

     // Clone a book
     Book clonedBook = bookShop.cloneBook("gatsby");
     clonedBook.title = "The Great Gatsby - Special Edition"; // Modifying the title of cloned book

     // Print original and cloned books
     System.out.println("Original Book: " + book1);
     System.out.println("Cloned Book: " + clonedBook);
 }
}

