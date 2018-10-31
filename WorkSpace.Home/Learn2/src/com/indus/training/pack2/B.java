package com.indus.training.pack2;

import com.indus.training.pack.A;

public class B extends A {
    int total;

    void sum() {
        total = i * j; // ERROR, j is not accessible here
    }
}

class Access {
    public static void main(String args[]) {



        B subOb = new B();

        subOb.setij(10, 12);

        subOb.sum();
        System.out.println("Total is " + subOb.total);

        subOb.add(21,23,123,12,3,123,12,3,123);
    }
}