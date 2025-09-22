package com.example.sept.oops.labsession1.m2;

import com.example.sept.oops.labsession1.m1.User;

public interface Lendable {
    boolean lend(User user);
    void returnBook(User user);
    boolean isAvailable();
}
