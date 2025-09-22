package com.example.sept.oops.labsession1.m3;

import java.util.ArrayList;
import java.util.List;

import com.example.sept.oops.labsession1.m1.User;
import com.example.sept.oops.labsession1.m2.Book;

public class LibraryManagementSystem {
    List<Book> books;
    List<User> users;
    public LibraryManagementSystem(){
        // VERY IMPORTANT TO INITIALISE THE VARS, else NPE.
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    // toDo: Method should only be available to librarian.
    public void addBook(Book book){
        books.add(book);
    }

    // toDo: Method should only be available to librarian.
    public void registerUser(User user){
        users.add(user);
    }

    // Method available for All. 
    public List<Book> searchBooks(String title){
        List<Book> result = new ArrayList<>();
        for(Book book : books){
            if(book.getTitle().contains(title)){
                result.add(book);
            }
        }
        return result;
    }

    // Method available for All. 
    public List<Book> searchBooks(String criteria, String author){
        // Implement.
       return null;
    }

    // Method available for All. 
    public boolean returnBook(Book book, User user){
        Book existingBook = searchBooks(book.getTitle()).get(0);
        existingBook.returnBook(user);
        return true;
    }
    
}
