package com.example.sept.oops.scaler.interfacesEg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Stack stack = new LinkedListStack();
        stack.pop();
        stack.push(10);
        stack.peek();
        stack.size();
    }
}
