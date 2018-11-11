package com.indus.training.pack;

public class A {

    public static void main(String args[]) {

        System.out.println("aa".matches("\\s*\\S+\\s*")); // true
        System.out.println("a bc".matches("\\s*\\S+\\s*")); // false


    }
}



