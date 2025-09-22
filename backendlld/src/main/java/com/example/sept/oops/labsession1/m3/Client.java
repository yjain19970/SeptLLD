package com.example.sept.oops.labsession1.m3;

import com.example.sept.oops.labsession1.m1.Librarian;
import com.example.sept.oops.labsession1.m1.Member;
import com.example.sept.oops.labsession1.m2.Book;
import com.example.sept.oops.labsession1.m2.NovelBook;
import com.example.sept.oops.labsession1.m2.TextBook;

public class Client {
    
    public static void main(String[] args) {
        Librarian l1 = new Librarian("Sundar", "sundar@gmail.com", "emp1");
        
        // Add Members.
        Member m1 = new Member("Yash","yash@gmail.com");
        Member m2 = new Member("Amit", "amit@gmail.com");
        Member m3 = new Member("Rashi", "rashi@gmail.com");

        TextBook t1 = new TextBook("isbn1", "HarryPotter-1", "J.K. Rowling", "Novel", 1);
        TextBook t2 = new TextBook("isbn2", "HarryPotter-2", "J.K. Rowling", "Novel", 1);
        TextBook t3 = new TextBook("isbn3", "HarryPotter-3", "J.K. Rowling", "Novel", 1);
        TextBook t4 = new TextBook("isbn4", "HarryPotter-4", "J.K. Rowling", "Novel", 1);
        TextBook t5 = new TextBook("isbn5", "HarryPotter-5", "J.K. Rowling", "Novel", 1);
        

        LibraryManagementSystem lbms = new LibraryManagementSystem();
        // Adding books
        lbms.addBook(t1);
        lbms.addBook(t2);
        lbms.addBook(t3);
        lbms.addBook(t4);
        lbms.addBook(t5);
        // Adding users
        lbms.registerUser(m1);
        lbms.registerUser(m2);
        lbms.registerUser(m3);

        System.out.println("Size of books: " + lbms.books.size());
        System.out.println("Size of users: " + lbms.users.size());
        // DEMO: Now Lending Functionality:
        lbms.searchBooks("HarryPotter-1").get(0).lend(m3);
        lbms.searchBooks("HarryPotter-1").get(0).lend(m2);
        lbms.returnBook(t1, m3);
        lbms.searchBooks("HarryPotter-1").get(0).lend(m2);



        /**
         * Homework:
         * - currently the `addBook` method is exposed to Client.
         * - ideally It should only be accessible via the librarian
         * - So create a method in LBMS - login().
         * - this `login()` when is done via librarian, then only should allow
         *    to add a book. For normal users, only `search` and `return` functionality
         *    should be present.
         */

    }
}
